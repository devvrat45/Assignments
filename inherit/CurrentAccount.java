package inherit;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, int number, double balance) {
		super(name, number, balance);
		System.out.println("CurrentAccount constructor is called");
	}

	@Override
	public void withdraw(double amount) {
		{
			if(amount < balance) {
				balance -=amount;
			}
			else {
				System.out.println("Insufficient Balance2");
			}
		}
		
	}
	

}
