package SomePackage;

public class Person {
	
	private String name;
	private long mobileNumber;
	public static int instances=0;
	// default or no argument constructor(used to create instances of this class )
	public Person() {
		
		
		instances++;
		
	}
	// Another constructor with one argument
	
	public Person(String name) {
		this();
		this.name=name;
		// can also write in this way
		// this(name,0L);
	}
	
	// 2-arg constructor, overloaded constructor
	public Person (String name, long number){
		this();// it refers to the constructor of this class without the argument,hence it will go to the above construct.
		this.name= name;
		mobileNumber=number;
		
	}
	//public int getInstances() {
		//return instances;
	//}
	// setters or mutator
	public void setName(String name) {
		this.name=name;
	}
	// getter or accesor
	public String getName() {
		return name;
	}
	public void setMobileNumber(long num) {
		mobileNumber = num;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}

	@Override
	public String toString(){
		return name+":"+ mobileNumber;
	
	}
	public static void main(String[] args) {
		
		Person neha = new Person();
		neha.setName("Neha Mansukhani");
		System.out.println(neha.getName());
		neha.setMobileNumber(878475874);
		System.out.println(neha.getMobileNumber());
		
		Person harsha = new Person();
		harsha.setName("Harsha Bhogle");
		harsha.setMobileNumber(489389675738L);
		System.out.println(harsha.getMobileNumber());
		System.out.println(harsha.getName());
		System.out.println("Number of instances = " + instances);
		System.out.println(neha.toString());
		System.out.println(harsha);
		
		Person ramesh = new Person("Ramesh",3987635);
		System.out.println(ramesh);
		
		Person ram= new Person("Ram");
		System.out.println(ram);
		System.out.println("Number of instances = " + instances);
		
		
		//Person[] Persons = {neha, harsha, ramesh, ram};
	}

}
