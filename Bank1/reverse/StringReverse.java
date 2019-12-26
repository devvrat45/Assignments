

package reverse;
import java.lang.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello where";
		int count =0;
		StringBuffer stb1 = new StringBuffer();
		stb1.append(s1);
		stb1.reverse();
		
		s1=s1.toLowerCase();
				
          
		
		for(int i=0;i <s1.length();i++ )
		{
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u')
			{
				count ++;
			}
		}
		
		System.out.println(stb1);
		System.out.println(count);
		

	}

}
