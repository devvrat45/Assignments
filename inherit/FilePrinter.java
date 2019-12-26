package inherit;

public class FilePrinter implements Printer {
	@Override
	public void print(String s) {
		System.out.println("file mau hu bhai");
		System.out.println(s);
	}

}
