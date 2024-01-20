package ATM;

import java.util.Scanner;

public class WrongPin implements inttttt
{
	void wrongpin()
	{
		int pin=2424;
		Scanner sc=new Scanner(System.in);
		System.out.println("wrong pin");
		System.out.println("Enter 1 for Forgot & Reset PIN");
		int fpin=sc.nextInt();
		
		switch(fpin)
		{
		case 1:
		int otp=1234;
		System.out.println("Enter OTP send to your number and email");
		int otpno=sc.nextInt();
		if(otpno==otp)
		{
			System.out.println("Enter new 4 digit PIN");
			int newpin=sc.nextInt();
			
			System.out.println("Your PIN Changed Successful");
			System.out.println("Old PIN = "+pin);
			pin=newpin;
			System.out.println("New PIN = "+pin);
		}
		else
		{
			System.out.println("Wrong OTP");
		}
		break;
		default:System.out.println("Wrong Choice");
		}
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pchange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}
}
