package Loginpagepac;

import java.util.Scanner;

public class PassAtho
{
	void checkpass()
	{
		Scanner scann=new Scanner(System.in);
		System.out.println("Set a new Password\n.");
		System.out.println("Password must contain atleast one of uppercase, lowercase, number, special character");
		String repass=scann.next();
		
		if(repass.length()<=5)
		{
			System.out.println("Enter atleast 5 characters");
		}
		else if(repass.length()>=10)
		{
			System.out.println("Enter less then 10 character");
		}
		else
		{
			for(int i=0;chatAt(0)&&charAt(length()))
		}
		

//		for(int i=0;>=8;i++)
//		System.out.println("New Password Changed Successfuly");
//		System.out.println("Your New Password is "+repass);
	}
	
}
