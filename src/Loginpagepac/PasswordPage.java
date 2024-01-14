package Loginpagepac;

import java.util.Scanner;

public class PasswordPage extends LoginPage
{
	void PasswordPg()
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter your Password");
		String fo=sca.next();

		if(fo.equals(password))
		{
			System.out.println("logging in....");
		}
		else
		{
			int comp=1;
			System.out.println("Your password is wrong enter 1 for Forgot Password");
			int f1=sca.nextInt();
			
			if(f1==comp)
			{
				ForgotPass fp=new ForgotPass();
				fp.forgotpas();
			}
			else
			{
				System.out.println("Enter password Again");
				
			}
			
		}
	}
}
		
