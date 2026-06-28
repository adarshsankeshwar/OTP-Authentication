package com.kodnest.OTPAuthentication;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	UserotpRepo repo2;
	
	@Autowired
	JavaMailSender mailSender;
	
	public AppUser registerUser(AppUser user) {
		return repo.save(user);
	}
	
	public boolean loginUser(String name, String password) {
		AppUser user = repo.findByName(name);
		if(user!=null) {
			if(user.password.equals(password)) {
				int otp = new Random().nextInt(100000, 999999);
				
				Userotp otpobj = new Userotp(
					    String.valueOf(otp),
					    String.valueOf(user.getId())
					);

					repo2.save(otpobj);
				
				SimpleMailMessage message = new SimpleMailMessage();
				message.setTo(user.getEmail());
				message.setSubject("OTP Code");
				message.setText("Your OTP code is: " + otp);
				mailSender.send(message);		
				return true;
			}
			return false;
		}
		return false;
	}
	
//	boolean verifyOtp(String otp) {
//		Userotp otpObj = repo2.findByOtp(otp);
//		if(otpObj != null) {
//	        int userId = Integer.parseInt(otpObj.getUserid());
//			AppUser user = repo.findById(userId).orElse(null);
//			if(user!=null) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		}
//		return false;
//	}
	boolean verifyOtp(String otp) {

	    System.out.println("Entered OTP: " + otp);

	    Userotp otpObj = repo2.findByOtp(otp);

	    System.out.println("OTP Object: " + otpObj);

	    if (otpObj != null) {

	        int userId = Integer.parseInt(otpObj.getUserid());
	        System.out.println("User ID: " + userId);

	        AppUser user = repo.findById(userId).orElse(null);

	        System.out.println("User: " + user);

	        return user != null;
	    }

	    return false;
	}
	
}
