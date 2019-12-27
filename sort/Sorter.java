package sort;

import java.util.Arrays;
import java.util.Comparator;

import compare.Employee;;
public class Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] arr = new String[5];
		 
		 arr[0]="Dev";
		 arr[1]="Aev";
		 arr[2]="Pev";
		 arr[3]="Rev";
		 arr[4]="Bev";
		 
		 Arrays.sort(arr);
		 
		 for (String i: arr) {
			 System.out.println(i);
		 }
		 
		 Employee e1= new Employee("ankit",123,40004.12);
		 Employee e2 = new Employee("Rahul", 345,5000.19);
		 Employee e3 = new Employee("Dev", 345,1000.19);
		 
		 Employee emps[]=new Employee[3];
		 
		 emps[0]= e1;
		 emps[1]=e2;
		 emps[2]=e3;
		 
		// Arrays.sort(emps,e1);
		 
		 /*Creating anonymous inner class
		  * Arrays.sort(emps, new Comparator<Employee>(){
		  * @Override
		  * public int compare(Employee e1, Employee e2){
		  * return e2.getName().compareToIgnoreCase(e1.getName());
		  * }
		  * });
		  */
		 
		 Arrays.sort(emps, new Comparator<Employee>() {
				 @Override
				 public int compare(Employee e1, Employee e2) {
					 return e2.getId() - (e1.getId());
			 
		 }
		 }	 );
		
		 Arrays.sort(emps, new Comparator<Employee>() {
			 @Override
			 public int compare(Employee e1, Employee e2) {
				 return (int)e1.getSalary() - ((int) e2.getSalary());
		 
	 }
	 }	 );
		 
		 for(Employee e:emps) {
			 System.out.println(e);
		 }
		
		 
		
	}

}
