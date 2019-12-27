package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import collection.Student;

public class FindVowels {
	
	static List<String> list= new ArrayList<>();
	static Map<String,Integer> map = new HashMap();
	
	public static void addWord() {
		int i=1;
		System.out.println("Enter words to find vowel count: and to quit type quit");
		Scanner sc = new Scanner(System.in);
		String word;
		while(true) {
			 word = sc.nextLine();
			if(word.equals("quit")) {
				System.out.println("You have Quit....Wait for results");
				break;
			}
			else {
				list.add(word);
				
			}
			
		}
		
	}
	
	public static int countingVowels(String word) {
		
		int countVowel=0;
		int i;
		word=word.toLowerCase();
		for(i=0;i<word.length();i++) {
			
			
			if(word.charAt(i)=='a'|| word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
				countVowel++;
			}
		}
		
		return countVowel;
		
	}
	
	public static void creatingMap() {
		
		
		
		Iterator<String> std =list.iterator();
		while(std.hasNext()) {
			String element = std.next();
			map.put(element,countingVowels(element));
		}
	}
	
	public static void showMap()
	{
		Set<String> set= map.keySet();
		Iterator<String> it1 =set.iterator();
		while(it1.hasNext()) {
			String key= it1.next();
			Integer value=map.get(key);
			System.out.println(key+":"+ value);
		}	
	}
	public static void main(String [] args) {
		addWord();
		creatingMap();
		showMap();
		
	}

}
