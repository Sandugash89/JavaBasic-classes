package com.syntax.class13;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Accept username, password and confirm password from a user and check following requirements:
Username and Password cannot be  empty, if somessage=�Username and Password cannot be empty�.
Password should be minimum 8 characters, if less message=�Password is too short�.
Password cannot contain username if so,  message=�Password cannot contain username�.
Password should match confirmed password, if not  message=�Passwords do not match�.
Only after all requirements met message �Your username and password has been created�
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a user name and password?");
		String username=scan.next();
		String password=scan.next();
		String password2=scan.next();
		
		if(username.length()==0|| password.length()==0 || password2.length()==0) {
			System.out.println("Username and password cannot be empty");
		}else if(password.length()<8) {
			System.out.println("Password us too short");
		} else if(password.contains(username)) {
			System.out.println("Password cannot contain username");
		} else if(!password.equals(password2)) {
			System.out.println("Password do not match");
		} else {
			System.out.println("Your user name and password has been created");
		}
		
		
		
	}

}
