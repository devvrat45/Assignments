package Assignment;

public class Address {
	protected  String hno;
	protected String str;
	protected String city;
	protected String state;
	
	
	public Address(String hno, String str, String city, String state) {
		super();
		this.hno = hno;
		this.str = str;
		this.city = city;
		this.state = state;
	}
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", str=" + str + ", city=" + city + ", state=" + state + "]";
	}


	
	
	
	

}
