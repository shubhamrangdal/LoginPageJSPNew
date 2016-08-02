package com.bitwise.Login.model;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCheck {
	public void checkCookie(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Cookie loginCookie = null;
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("username")){
				loginCookie = cookie;
				break;
			}
		}
		}
		if(loginCookie != null){
			loginCookie.setMaxAge(0);
	    	response.addCookie(loginCookie);
	    	
	    	
		}
		
	}
}
