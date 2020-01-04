package test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private static String fileName = "D://books.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File (fileName);
		boolean fileExists =file.exists();
		if(fileExists) {
			System.out.println("File available?:"+file.exists());
			System.out.println(file.getPath());
			
			FileReader reader =null;
			BufferedReader buffer =null;
			String line ="";
			// read file content

			try {
				reader = new FileReader(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("The file doesnot exist");
			}
			buffer = new BufferedReader(reader);
			try {
				line = buffer.readLine();
				while(line!= null) {
					System.out.println(line);
					line=buffer.readLine();	
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error reading file:"+e.getMessage());
				e.printStackTrace();
			}
		}

	}

}