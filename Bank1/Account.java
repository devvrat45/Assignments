package Bank1;

public class Account {
	String acctHolder;
	int acctPin;
	
	double acctbalance ;
	public static final double minBalace=10000;
	public Account(String acctHolder, int acctPin, double acctbalance) {
		super();
		this.acctHolder = acctHolder;
		this.acctPin = acctPin;
		this.acctbalance = acctbalance;
	}
	public String getAcctHolder() {
		return acctHolder;
	}
	public void setAcctHolder(String acctHolder) {
		this.acctHolder = acctHolder;
	}
	public int getAcctPin() {
		return acctPin;
	}
	public void setAcctPin(int acctPin) {
		this.acctPin = acctPin;
	}
	public double getAcctbalance() {
		return acctbalance;
	}
	public void setAcctbalance(double acctbalance) {
		this.acctbalance = acctbalance;
	}
	@Override
	public String toString() {
		return "Account [acctHolder=" + acctHolder + ", acctPin=" + acctPin + ", acctbalance=" + acctbalance + "]";
	}
	
	public static void main(String[] args) {
		
		
	}
	

}
