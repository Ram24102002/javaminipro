package ATM;
import java.util.Scanner;

import Loginpagepac.PassAtho;

public class Atm
{
	
	public static void main(String[] args)
	{
		
		int pin=2424;
//		double balance=200000;
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome");
		
		try { 
			Thread.sleep( 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("please Insert your Card and wait...");
		try {
			Thread.sleep( 1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch-block.
			e.printStackTrace();
		}
		
		System.out.println("please enter your pin");
		int password=sc.nextInt();
		
		if(password==pin)
		{
			Geeeee g1=new Geeeee();
			System.out.println();
			System.out.println("Enter 1 for Withdrawal\nEnter 2 for Deposit\nEnter 3 for PIN Change\nEnter 4 for check Balance");
			System.out.println();
			System.out.println("please enter your choice");
			System.out.println();
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Entering Withdrawal");
			g1.get(new withdrawal());
			break;
			case 2: System.out.println("Entering Deposit");
			g1.get(new Deposit());
			break;
			case 3: System.out.println("Entering PIN Change");
			g1.get(new PinChange());
			break;
			case 4: System.out.println("Entering check Balance");
			g1.get(new Balance());
			break;
			}
			
			
		}
		else
		{
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
		
		
	}
}
