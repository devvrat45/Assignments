package Bank1;

public class MultiAccATM {
	

	private double withdrawLimit;
	private double totalAmount;
	private Account[] accts;
	int counter =0;
	int limit=3;
	Account currentAccountHolder;
	
	public MultiAccATM(double withdrawLimit, double totalAmount) {
		accts = new Account[limit];
		this.withdrawLimit = withdrawLimit;
		this.totalAmount = totalAmount;

	}

	public void addAccount(Account acct) {
		if(counter<limit) {
			accts[counter++] = acct;
		}
	}
		
		public boolean validatePin(int pin){
			for (Account act :accts) {
				if(act.getAcctPin()==pin) {
					currentAccountHolder =act;
					return true;
				}
			}
			return false;
			
		}
		
		public double withdraw(double amt, int pin) {
			
			if(validatePin(pin)) {
				if(amt <= withdrawLimit) {
					if(amt<currentAccountHolder.getAcctbalance()-Account.minBalace) {
					totalAmount -=amt;
					currentAccountHolder.setAcctbalance(currentAccountHolder.getAcctbalance()-amt);
					return amt;
					}
				}
			
			}
			
			return 0.0;
		}
		
		public double deposit(double amt, int pin) {
			
			if(validatePin(pin)) {
				totalAmount += amt;
				currentAccountHolder.setAcctbalance(currentAccountHolder.getAcctbalance()+amt);
			}
			return amt;
			
		}
		public String toString() {
			return "total amount = "+totalAmount;
		}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiAccATM atm = new MultiAccATM(50000,10000);
		Account a1 =new Account("neha",1234, 150000);
		Account a2 =new Account("poha",2234, 160000);

		atm.addAccount(a1);
		atm.withdraw(3000, 3456);
		//System.out.println(atm);
		
		atm.deposit(1000,123);
		System.out.println(atm);
		System.out.println(atm.getAcct());

	}

}
