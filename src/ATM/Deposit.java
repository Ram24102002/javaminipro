package ATM;

import java.util.Scanner;

public class Deposit implements inttttt
{
	public void dep()
	{
		double balance=200000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount you want to Add");
		int addmoney=sc.nextInt();
		System.out.println("Please Insert "+addmoney+" into the ATM Mechine...");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Counting Money...");
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Money Deposited Successfuly...");
		System.out.println("Your Current Balance is $"+(balance+addmoney));
	}
}
