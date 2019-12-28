package test;

import java.util.ArrayList;
import java.util.List;

public class Organisation {
	//static List<Employee> emps = new ArrayList<>(); 

	static Employee[] emps =new Employee[8];
	static Department[] depts =new Department[3];
	static int limit=8;
	static int counter=0;

	public static void addEmployee(Employee emp) {// add the employees to the employee array
	
		if(counter<limit) {
			emps[counter++]=emp;
		}

	}
	public static void showEmployee() { //TASK:1 Shows all the employees in the organisation
		System.out.println("Showing all Employees");
		for(Employee s: emps) {
			System.out.println(s);
		}
	}

	public static void showEmployeeOfDepartment(String dept) {// TASK:2 This will show the employees under the given dept.
		System.out.println("Showing all Employees in a particular department");
		for(Employee s: emps) {
			if(s.getDept()!= null) {
				if(s.getDept().getName().equalsIgnoreCase(dept)) {
					System.out.println(s.getName());

				}
			}
		}
	}
	public static void onlyRoleEmployee(String role ) {// TASK:3 This will show Employee having a role. Employees not having a role will not be listed. 
		System.out.println("Showing all Employees in a particular role");
		for(Employee s: emps) {
			if(s.getRole().equalsIgnoreCase(role)) {
				System.out.println(s.getName());
			}
		}
	}

	public static void incrementSalary(String role, int increment) { // TASK:4 This function will increment the salary of employees under the given role.
		for(Employee s: emps) {
			if(s.getRole().equalsIgnoreCase(role)) {
				double newSalary = s.getSalary()+(0.01*increment*s.getSalary());
				s.setSalary(newSalary);
				s.setIncrease(true);
			}
		}
	}

	public static void showIncrementEmployeeSalary(){//TASK:7 This function show the employees who salary is incremented.
		System.out.println("Showing all Employees with salary increment");
		for(Employee s: emps) {
			if(s.isIncrease())
				System.out.println(s);
		}
	}
	public static void employeesUnderManger(String name) { //TASK:8 This function will list all the employees under given manager name.
		System.out.println("Showing all Employees under a paricular HR/Manager");
		for(Employee s: emps) {
			if(s.getManager()!= null) {
				if(s.getManager().equalsIgnoreCase(name)) {
					System.out.println(s.getName());
				}
			}
		}
	}





	public static void main(String[] args) {


		Department hr =new Department("HR","Mumbai");
		Department development =new Department("DEVELOPMENT","Delhi");
		Department testing =new Department("TESTING","Hyderabad");

		//List<Employee> emps = new ArrayList<>(); 

		Employee dev = new Employee("Dev",101,60000,"Developer",development,"Tarana");
		Employee avi = new Employee("Avi",102,60000,"Developer",development,"Tarana");

		Employee sid = new Employee("Sid",111,40000.00,"testing",testing,"Tarana");
		Employee tara = new Employee("Tara",112,40000.00,"testing",testing,"Surbhi");

		Employee ashim = new Employee("Ashim",103,60000.00,"Developer",development,"Surbhi");
		Employee karan = new Employee("Karan",104,60000.00,"Developer",development,"Surbhi");



		Employee tarana = new Employee("Tarana",121,80000.00,"HR",hr,null);
		Employee surbhi = new Employee("Surbhi",122,80000.00,"HR",hr,null);

		addEmployee(tarana);
		addEmployee(surbhi);

		addEmployee(dev);
		addEmployee(avi);

		addEmployee(sid);
		addEmployee(tara);

		addEmployee(ashim);
		addEmployee(karan);



		//Task1
		showEmployee();
		//Task2
		showEmployeeOfDepartment("testing");
		//Task3
		onlyRoleEmployee("testing");
		//Task4
		incrementSalary("Developer",10);
		incrementSalary("HR",10);//Here HR is manager
		//Task7
		showIncrementEmployeeSalary();		
		//Task8
		employeesUnderManger("tarana");







	}

}
