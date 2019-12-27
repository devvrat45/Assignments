package compare;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	private String name;
	private int id;
	private double salary;
	
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary= salary;
	}
	
	@Override
	public boolean equals(Object other) {
		Employee e= (Employee)other;
		return this.id ==e.id;
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

	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return id/12;
	}
	
	@Override
	public int compareTo(Employee other) { // comparable interface through
	
		return this.id - other.id;                                                             
	}

	@Override
	public int compare(Employee e1, Employee e2) { //hum ye isliya use kr rhr hai kyuki hume ye strig se sort krna hai ar comparable wale method se ek program mai do different things sort nhi kr sakte.
		// TODO Auto-generated method stub				comparator ke though
		return e1.name.compareToIgnoreCase(e2.name);
	}
	
	
	

}
