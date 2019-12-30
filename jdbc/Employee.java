package jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	int id;
	String fullname;
	int deptid;
	double salary;
	Date joinDate;
	
	public Employee(int id, String fullname, int deptid, Date joinDate, double salary) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.deptid = deptid;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		String sdate = sdf.format(joinDate);
		return "Employee [id=" + id + ", fullname=" + fullname + ", deptid=" + deptid + ", joinDate=" + sdate
				+ ", salary=" + salary + "]";
	}
	
	

}
