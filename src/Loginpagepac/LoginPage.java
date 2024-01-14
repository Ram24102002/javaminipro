package Loginpagepac;

import java.util.Scanner;

public class LoginPage
{
	String password="java";
	Scanner scn=new Scanner(System.in);
	public void phone(long no)
	{
		
		System.out.println("You are Loging using phone number");
		PasswordPage pp=new PasswordPage();
		pp.PasswordPg();
		
	}
	public void phone(String email)
	{
		System.out.println("You have entred your email");
		PasswordPage pp=new PasswordPage();
		pp.PasswordPg();
	}
}
   