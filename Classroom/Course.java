package Classroom;

public class Course {
	
	private Student[] stds;
	private int counter=0;
	private String sub1;
	private String sub2;
	private int limit =3;
	private int numCourses =0;
	private Course[] courses =new Course[limit];
	

	
	public Course() {
		stds = new Student[limit];// this is allocating memory to array
	}
	public Student[] getStudentsArray() {
		return stds;
	}
	
	public void addCourse(Course c) {
		if(numCourses < limit) {
			courses[numCourses++]=c;
		}
	}
	 public void addStudent(Student st) {
		 if(counter< limit) {
			 stds[counter++]=st;
		 }
		 else {
			 System.out.println("Course is filled");
		 }
	 }
	

	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	
	public void display() {
		
		for(Student s: stds) {
			System.out.println(s.toString());
		}
	}
	
	public void printStudentNames(String subject) {
		for(Course c: courses) {
			if(c.getSub1().equalsIgnoreCase(subject) || c.getSub2().equalsIgnoreCase(subject)) {
				Student[] students =c.getStudentsArray();
				for (Student s: students) {
					System.out.println();
				}
				
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course phys =new Course();
		phys.setSub1("mechanics");
		phys.setSub2("wave theory");
		
		phys.addStudent(new Student("amit",534));
		phys.addStudent(new Student("dev",544));
		phys.addStudent(new Student("avi",636));
		phys.addStudent(new Student("ram",345));
		
		phys.display();
		phys.printStudentNames("wave theory");
		

	}

}
