package Loginpagepac;

import java.util.Scanner;

public class Login
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To _ \n.\n.");
		System.out.println("Please select an Option\n.");
		System.out.println("1.Login\n2.Create an Account\n3.Forgot Password\n.\n.");
		int choice=sc.nextInt();
		LoginPage l1=new LoginPage();
		switch(choice)
		{
		case 1:System.out.println("Entering Login Page\n.\n.");
		System.out.println("Login via Using Phone number on Email");
		System.out.println();
		if(sc.hasNextLong())
		{
			long no=sc.nextLong();
            l1.phone(no);
		} 
		else
		{
			String email=sc.next();
			l1.phone(email);
		}
		break;
		case 2:System.out.println("Entering New Account Page\n.\n.");
		break;
		}
	}
}
