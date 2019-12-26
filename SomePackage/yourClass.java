package SomePackage;

public class yourClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello, Java World!";
		System.out.println(s1);
		int len = s1.length();
		System.out.println("The number of char are:"+len);
		System.out.println("Is this true: " +(len==18));
		if (len==10)
		{
			System.out.println("This is correct");
			
		}
		else
		{
			System.out.println("Wrong! Try again");
		}
		System.out.println((len==18?"correct":"wrong"));
		int m=34, n= 45;
		System.out.println(m*n);
		if (m<n) {
			System.out.println(n-m);
		}
		else {
			System.out.println(m+n);
		}
		for(int i=0; i<len;i++)
		{
			System.out.print(i +" ");
		}
		
		double amount = 123.45;
		System.out.println(amount/0);
		int num=(int) 23.45; // explicit or downcasting
		System.out.println("Lower:");
	    char ch='a';
	    int k=1;
		while(k <= 26)
		{
			System.out.print(" "+(int)ch);
			ch++;
			k++;
		}
		System.out.println();
		System.out.println("Capitals:");
		 char ch1='A';
		    k=1;
			while(k <= 26)
			{
				System.out.print(" "+(int)ch1);
				ch1++;
				k++;
			}
			System.out.println();
			System.out.println("Numbers:");
			char ch2='0';
		    k=0;
			while(k <= 9)
			{
				System.out.print(" "+(int)ch2);
				ch2++;
				k++;
			}
			System.out.println();
			rangeSum(1,10);
			calculate(4,6,"+");
			
	}
	public static void rangeSum(int m, int n)
	{
		if(m > n) {
			Swapno(m,n);
		}
		else {
			int summ=0;
			for(int i=m;i<=n;i++)
			{
				summ=summ+i;
			}
			System.out.println("Sum is:"+summ);
		}
	}
	public static void Swapno(int m, int n)
	{
		int temp=0;
		temp=m;
		m=n;
		n=temp;
		System.out.println("m: "+ m + " and" + " n: " + n);
	}
	
	public static int add(int k, int m)
	{
		return k+m;
	}
	
	
	public static void calculate(double a, double b, String op)
	{
		System.out.println("output of the calculate method is:");
		switch (op) {
		
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			if(b==0) {
				System.out.println("Denominator cannot be zero");
			}
			else {
				System.out.println(a/b);
				break;
			}
			break;
		default:
			System.out.println("Invalid operator");
				
		}
			
	}
	
	
	
	
}

