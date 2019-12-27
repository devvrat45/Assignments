package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MyMap {
	//MyCode:> I have passed direct value of student that is name and roll in the map.
	public static String findName(Map<Integer, String> map, Integer roll) {
		
		Set<Integer> set1= map.keySet();
		Iterator<Integer> it =set1.iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			if(roll==key) {
			String value=map.get(key);
			return value;
		}
			else {
				return "nill";
			}
			
	}
		return "nill";
}
	
	// Sir's method: Sir has passed student roll number and student object as values in the map
	// getStudent function chcks the roll number in the map and returns the name of the student if the roll number is found.
	public static String getStudentName(int rollNum) {
		Map<Integer,Student> map = getStudentMap();
		if(map.containsKey(rollNum)) { 
			Student st = map.get(rollNum);
			return st.getName();
		}
		return null;
	}
	// getStudentMap creates the map having student roll number as the key and student object as the value.
	// First a student object is create from the student class and afterward the student object is being is being added to a list.
	// In the while loop we are adding key and value into the map.
	public static Map getStudentMap() {
		Map<Integer,Student> stds = new HashMap();
		List<Student> list= new ArrayList<>();
		Student akash =new Student("Akash",123);
		Student kalpana =new Student("kalpana",345);
		Student sasha =new Student("sasha",876);
		Student prakash =new Student("prakasg",567);
		
		list.add(prakash);
		list.add(akash);
		list.add(sasha);
		list.add(kalpana);
		Iterator<Student> its =list.iterator();
		while (its.hasNext()) {
			Student st = its.next();// student object from the "list" is passed in to st. 
			stds.put(st.getRoll(),st);// st.getRoll() sends the roll number and st sends the object of the student.
		}
		
		return  stds;
	}
	public static void main(String [] args)
	{
		Map<Integer, String> map = new HashMap();
		
		map.put(1, "lapttop");
		map.put(2, "mobile");
		map.put(3, "tablet");
		map.put(4, "desktop");
		
		String device = map.get(3);
		System.out.println(device);
		Set<Integer> set= map.keySet();
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			String value=map.get(key);
			System.out.println(key+":"+ value);
		}	
		Map<Integer, String> student = new HashMap();
		
		student.put(1,"Dev");
		student.put(2,"pev");
		student.put(3,"cev");
		student.put(4,"kev");
		
		System.out.println(findName(student,1));
		
		System.out.println(getStudentName(123));
		
	
	}

}
