package com.sriya.firstapp.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String name,String pw) {
		boolean isValidName=name.equalsIgnoreCase("sriya");
		boolean isValidPw=pw.equalsIgnoreCase("pw");
		return isValidName && isValidPw;
	}
}
