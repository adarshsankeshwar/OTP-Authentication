package com.kodnest.OTPAuthentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserotpRepo extends JpaRepository<Userotp, Integer>{
	Userotp findByOtp(String otp);
}
