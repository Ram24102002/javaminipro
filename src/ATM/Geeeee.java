package ATM;

public class Geeeee
{
	public void get (inttttt i)
	{
		if(i instanceof withdrawal)
		{
			withdrawal w1=new withdrawal();
			w1.withdraw();
		}
		else if(i instanceof PinChange)
		{
			PinChange p1=new PinChange();
			p1.pchange();
		}
		else if(i instanceof Deposit)
		{
			Deposit d1=new Deposit();
			d1.dep();
		}
		else if(i instanceof Balance)
		{
			Balance b1=new Balance();
			b1.balance();
		}
	}
}
