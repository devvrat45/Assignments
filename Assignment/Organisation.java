package Assignment;

public class Organisation {
	
	
	static Employee[] emps =new Employee[5];
	static Department[] depts =new Department[3];
	static int limit=5;
	static int counter=0;
	
	
	
	public static  void showEmployeeDept(Employee[] e){
		for (int i=0;i<limit;i++)
		{
			System.out.println(e[i].getDept().getName());
		}
	}
	public static void oneEmployeeDept(Employee e) {
		System.out.println(e.getDept().getName());
	}
	
	public static void printEmployee(String dept){
		for (Employee e: emps){
			Department d =e.getDept();
			if(d != null) {
				String deptName=d.getName();
				if(deptName.equalsIgnoreCase(dept)) {
					System.out.println(e);
				}
			}
		}
	}
	
	public static String getDepartment(String empName) {
		for (Employee e: emps) {
			if(e.getName().equalsIgnoreCase(empName)) {
				return e.getDept().getName();
			}
		}
		return null;
	}
	
	public static void notDeptEmployee() {
		for (Employee e: emps) {
			if( e.getDept()== null) {
				System.out.println("No dept:"+e.getName());
			}
		}
	}
	public static void allemployeeDept() {
		System.out.println("All Departments of employees");
		for (Employee e: emps) {
			
			if(e.getDept()!= null) {
				
				System.out.println(e.getName()+" : "+e.getDept().getName());
			}
			
		}
	}
	
	public static void main(String args[]) {
	
		Organisation org = new Organisation();
		Department hr = new Department("hr","hyd");
		Department dev = new Department("dev","nagpur");
		Department test = new Department("test","delhi");
		
		Address a1 = new Address("12E","JCly","Hyd","TS");
		Employee e1 = new Employee("Amit",a1,1,hr);
		
		Address a2 = new Address("121","Eat Street", "N Delhi", "N Delhi");
		Employee e2 = new Employee("Dev",a2,2,dev);
		
		Address a3 = new Address("151","Food Street","Chennai","TN");
		Employee e3 = new Employee("Avi",a3,3,dev);
		
		Address a4 = new Address("131","Old Street","Bombay","MH");
		Employee e4 = new Employee("Sid",a4,4,dev);
		
		Address a5 = new Address("181","New Street","Hyd","TS");
		Employee e5 = new Employee("Neha",a5,5);
		
		depts[0]=hr;
		depts[1]=hr;
		depts[2]=hr;
		
	
	
		
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		emps[3]=e4;
		emps[4]=e5;
		
		oneEmployeeDept(e1);
		
		
		printEmployee("dev");
		
		String depName=getDepartment("Dev");
		System.out.println("Asha belongs to dept:"+ depName);
		
		notDeptEmployee();
		allemployeeDept();
		
}

}
