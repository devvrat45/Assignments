package test;

public class Employee {
	
	protected String  name;
	protected int id;
	protected double salary;
	protected String role;
	protected Department dept;
	protected Employee manager;
	protected boolean increase;
	public Employee(String name, int id, double salary, String role, Department dept, Employee manager) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.dept = dept;
		this.manager = manager;
		increase=false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	public boolean isIncrease() {
		return increase;
	}
	public void setIncrease(boolean increase) {
		this.increase = increase;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", role=" + role + ", dept=" + dept
				+ ", manager=" + manager + "]";
	}
	
	
	

}
