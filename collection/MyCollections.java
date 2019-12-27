package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import compare.Employee;

import java.util.List;


public class MyCollections {
	
	
	public static int findStudent(List<Student> list, String name ) {
	
		for(Student s:list) {
			if(s.getName().equalsIgnoreCase(name)) {
				return s.getRoll();
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<>();
		
		v.add("ankit");
		v.add("pnkit");
		v.add("cnkit");
		v.add("lnkit");
		
		System.out.println(v.size());
		int i;
		int len =v.size();
		System.out.println("#1");
		for(i=0;i<len;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("#2");
		for(String s :v) { // enhanced for loop
			System.out.println(s);
		}
		System.out.println("#3");
		Enumeration<String> E = v.elements();	
		while(E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}
		
		System.out.println("#4");
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(51);
		list.add(23);
		list.add(12);
		list.add(54);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		Iterator<Integer> iter1 = list.iterator();
		int summ=0;
		while(iter1.hasNext()) {
			summ= summ+iter1.next();
				
		}
		System.out.println("sum:"+summ);
		Collections.sort(list);
		System.out.println(list);
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("asha",321));
		students.add(new Student("nina",123));
		students.add(new Student("samir",435));
		students.add(new Student("bsha",121));
		students.add(new Student("Avirup",125));
		
		Iterator <Student> sdIt = students.iterator();
		while(sdIt.hasNext()) {
			Student st = sdIt.next();
			System.out.println(st.getName());
		}
		
		   //Creating anonymous inner class
		   Collections.sort(students, new Comparator<Student>(){
		   @Override
		   public int compare(Student e1, Student e2){
		   return e1.getName().compareToIgnoreCase(e2.getName());
		   }
		   });
		   System.out.println("Sorted by names:");
		   System.out.println(students);
		   
		   Collections.sort(students, new Comparator<Student>(){
			   @Override
			   public int compare(Student e1, Student e2){
			   return e1.getRoll() - (e2.getRoll());
			   }
			   });
			   System.out.println("Sorted by rollnumber:");
			   System.out.println(students);
			   
		  Collections.sort(students, new StudentNameSorter());
		
		  Iterator <Student> s = students.iterator();
		  while(s.hasNext()) {
			  Student s1=s.next();
			  if((s1.getName().charAt(0)=='A') || (s1.getName().charAt(0)=='a')  ) {
				  System.out.println(s1.getName());
				  
			  }
		  }
		  
		  System.out.println(findStudent(students,"nina"));
		  
	}
}
