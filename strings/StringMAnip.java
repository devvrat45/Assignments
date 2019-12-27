package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMAnip {
	
	public static void locate(String word, String line) {
		int len=word.length();
		if(line.contains(word)) {
			int start =line.indexOf(word);
			int end =start+ len-1;
			System.out.println("start "+start+" end "+end);
			System.out.println(line.substring(start,end+1));
			}
		
	}
	
	public static boolean checkPallindrome(String word) {
		StringBuffer bf = new StringBuffer(word);
		bf=bf.reverse();
		return word.equals(bf.toString());
	}
	
	public static void findCharacters(String line) {
		String chars= "";
		int count=0;
		for(char c: line.toCharArray()) {
			if(!chars.contains(c+"")&& c!=' ') {
				chars +=c;
			}
		}
		char [] ch = chars.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		System.out.println(chars.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		str="This is a text";
		String st = new String("this is a line of text");
		System.out.println(str==st);
		str=st;
		System.out.println(str==st);
		System.out.println(str.contentEquals(st));
		int len = str.length();
		int  indexOfC = str.indexOf('t');
		System.out.println(indexOfC);
		
		int lastIndexOft = str.lastIndexOf('t');
		System.out.println(lastIndexOft);
		
		int count =0;
		for(char c: str.toCharArray()) {
			if(c=='t') {
				++count;
			}
		}
		System.out.println("t occurs: "+ count+" times");
		locate("text", str);
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head><title>My web Page</title?</head>");
		buffer.append("<body");
		buffer.append("<h1> This is my web page</h1>");
		buffer.append("</body></html>");
		System.out.println(buffer.toString());
		System.out.println(checkPallindrome("nlghdggd"));
		findCharacters("the quick brown fox jumps over a lazy dog");
	}

}
