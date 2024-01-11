package ATM;

import java.util.Scanner;

public class PinChange implements inttttt
{
	public void pchange()
	{
		int pin=2424;
		Scanner sc=new Scanner(System.in);
		System.out.println("Old PIN "+pin);
		System.out.println("Enter New PIN");
		int npin=sc.nextInt();
		pin=npin;
		System.out.println("Your New PIN Changed to "+pin+" Successfully...");
	}
}
