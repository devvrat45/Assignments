package compare;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("akhil b",123,4554);
		Employee e2 = new Employee("akhil b",123,5445);
		
		System.out.println(e1.equals(e2));
		

	}

}
