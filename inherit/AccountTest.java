package inherit;

public class AccountTest {
	
	public static void showBalance(Account bc) {
		System.out.println(bc.getBalance());
	}
	
	public static void printAccount(Account ac,Printer p) {
		ac.print("From account");
		p.print("From printer class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SavingsAccount sa = new SavingsAccount("Neha",123,100000);
		System.out.println(sa);
		sa.withdraw(4000);
		System.out.println(sa);

		CurrentAccount ca = new CurrentAccount("Dev",454,4999);
		ca.withdraw(60000);
		System.out.println(ca);
		
		Account ac= new SavingsAccount("Amit",678,100000);
		System.out.println(ac);
		ac.withdraw(50000);
		System.out.println(ac);
		System.out.println("--------------------");
		showBalance(ac);
		System.out.println("--------------------");
		showBalance(sa);
		ac.print("hello yolo");
		sa.print("Savings yolo");
		printAccount(ac, new ConsolePrinter());
		printAccount(ac, new FilePrinter());
	}

}
