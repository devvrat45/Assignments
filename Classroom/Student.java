package Classroom;

public class Student {
	private String name;
	private int rollno;
	
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setRollno(int num) {
		rollno=num;
	}
	@Override
	public String toString() {
		return name + ":" + rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}

}
