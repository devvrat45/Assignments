package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Passwords {
	public static String fileName="D://pass.txt";
	public static void main(String[] args) {
		
		File file= new File (fileName);
		boolean fileExists =file.exists();
		if(fileExists) {
			FileReader reader =null;
			BufferedReader buffer =null;
			String line ="";
			String[] pass1 = new String[2];
			List<String> list= new ArrayList<>();

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
				pass1=line.split(":");	
				System.out.println("Username:"+pass1[0]+" Password:"+pass1[1]);
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
