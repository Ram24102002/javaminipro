package ATM;

import java.util.Scanner;

public class withdrawal implements inttttt
{
	public void withdraw()
	{
		//double balance=200000;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Amount");
		double amt=scn.nextDouble();
		
		if(amt>balance)
		{
			System.out.println("Low Balance\nPlease enter a Amount below "+balance);
		}
		else if(amt<100)
		{
			System.out.println("Please Enter a amount above 100.0");
		}
		else
		{
			System.out.println("Withdrawal Successful");
			System.out.println("Your Current Balance is $"+(balance-amt));
		}
	}
	
}
