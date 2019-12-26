package SomePackage;

import java.util.Scanner;

public class RandomGuess {
	
	private static int target= ( (int)(Math.random()*100))+1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(target);
		play();

	}
	
	private static int getInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
	
	private static void play()
	{
		int i;
		for(i=0;i<5;i++) {
			int input=getInput();
			if(input==target) {
				System.out.println("Correct");
			}
			else {
				int t=5-i-1;
				System.out.println("Try Again......" + "No of tries left:"+ t);
			}
		}
	}

}
