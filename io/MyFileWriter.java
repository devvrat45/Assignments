package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
	private static String fileName ="D://pass.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		
			try {
				fw= new FileWriter(fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter out =null;
			out = new PrintWriter(fw);
			out.println("admin:admim123");
			out.println("user1:user14");
			out.println("user2:user21");
			out.println("user3:user32");
			out.flush();
			
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		

	}

}
