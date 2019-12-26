package Bank1;

public class ATM {
	
	private double withdrawLimit;
	private double totalAmount;
	//private int pin ;
	
	private Account acct;
	
	
	
	public Account getAcct() {
		return acct;
	} 


	public void setAcct(Account acct) {
		this.acct = acct;
	}


	public ATM() {
		totalAmount=150000;
		withdrawLimit=4000;
		
		
	}
	

	public boolean validatePin(int pin) {
		 return acct.getAcctPin() == pin;
		
	}
	
	

	public double withdraw(double amt, int pin) {
		
		if(validatePin(pin)) {
			if(amt <= withdrawLimit) {
				if(amt<acct.getAcctbalance()-Account.minBalace) {
				totalAmount -=amt;
				acct.setAcctbalance(acct.getAcctbalance()-amt);
				return amt;
				}
			}
		
		}
		
		return 0.0;
	}

	
	public double deposit(double amt, int pin) {
		
		if(validatePin(pin)) {
			totalAmount += amt;
		}
		return amt;
		
	}
	public String toString() {
		return "total amount = "+totalAmount;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM atm = new ATM();
		Account act =new Account("nan",3456, 210000);
		atm.setAcct(act);
		atm.withdraw(3000, 3456);
		//System.out.println(atm);
		
		atm.deposit(1000,123);
		System.out.println(atm);
		System.out.println(atm.getAcct());

	}

}
