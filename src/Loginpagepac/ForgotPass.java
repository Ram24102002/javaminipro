package Loginpagepac;

import java.util.Scanner;

public class ForgotPass extends LoginPage
{
	void forgotpas()
	{
		Scanner scan=new Scanner(System.in);
		int otp=1234;
		System.out.println("Enter OTP send to your number and email");
		int otpno=scan.nextInt();
		if(otpno==otp)
		{
			PassAtho pa=new PassAtho();
			pa.checkpass();
		}
	}
}