package SomePackage;


public class People {

	private Person[] persons;
	int pers=5;
	int counter =0;
	
	public People() {
		persons=new Person[pers];
	}
	
	public void addPerson(Person p) {
		persons[counter++]=p;
	}
	
	public void displayPersons() {
		for(Person p: persons) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People ppl =new People();
		ppl.addPerson(new Person("amit",986783746L));
		// can be written in the another way which is given downstairs
		Person asha = new Person("asha", 53485734L);
		ppl.addPerson(asha);
		
		ppl.displayPersons();

	}

}
