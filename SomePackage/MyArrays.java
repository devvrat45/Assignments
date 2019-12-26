package SomePackage;

import java.util.Arrays; 

public class MyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {12,71,23,53,44,54}; // declaration, memory allocation, initialization
		
		for(int i=0; i<nums.length;i++)
		{
			System.out.println(nums[i]*nums[i]);
		}
		
		double[] amounts; // declaration
		amounts= new double[5]; // memory allocation
		// initialization
		amounts[0]= 123.45;
		amounts[1]= 133.55;
		amounts[2]= 143.65;
		amounts[3]= 153.75;
		amounts[4]= 163.85;
		System.out.println(amounts[3]);
		
		String[] names = new String[3];// declaration + memory allocation
		names[0] = "lol" ;
		names[1] = "anand";
		names[2]="devvrat";
		System.out.println(names[0]);
		
		stringLen(names);
		modArray(names);
		
		for(int i=0;i<names.length;i++)
    	{
    		System.out.println(names[i]);
    	}
	     
		sortArray(nums);
		
		
	}
	
    public static void stringLen(String[] strs )
    {
    	for(int i=0;i<strs.length;i++)
    	{
    		System.out.println(strs[i]+":"+strs[i].length());
    	}
    	
    	strs[0]="zolo";
    	strs[1]="holo";
    	strs[2]="fomo";
    }
    
    public static void modArray(String[] strs)
    {
    	strs[0]="zolo";
    	strs[1]="holo";
    	strs[2]="fomo";
    	
    	for(int i=0;i<strs.length;i++)
    	{
    		System.out.println(strs[i]);
    	}
    	
    }
    
    public static void sortArray(int[] arr)

    {
    	Arrays.sort(arr);
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]);
    	}
    	
    }

 
    
	

}
