package Assignment;

public class Person{
	protected String name;
	protected Address addr;
	
	public Person(String name) {
		this.name=name;
	}

	public Person(String name, Address addr) {
	
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
	
	
	

}
