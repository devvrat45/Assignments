package inherit;

public class ConsolePrinter implements Printer {
	
	@Override
	public void print(String s) {
		System.out.println("console mau hu bhai");
		System.out.println(s);
	}
	

}
