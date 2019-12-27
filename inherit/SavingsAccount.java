package inherit;

public class SavingsAccount extends Account {
	
	private static final double MINIMUM = 10000;

	public SavingsAccount(String name, int number, double balance) {
		super(name, number, balance);
		System.out.println("SavingsAccount constructor is called");
	}
	@Override
	public void print(String s)
	{
		System.out.println(s);
	}
	@Override
	public void withdraw(double amount) {
		if(balance -amount>= MINIMUM) {
			//super.withdraw(amount);
			}
		else
		{
			System.out.println("Insufficeint balance1");
		}
	}

	

}
