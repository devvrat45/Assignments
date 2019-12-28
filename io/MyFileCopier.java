package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileCopier {

	private static String fileName = "D://data.txt";
	private static String filename ="D://pass.txt";
	public static void main(String[] args) {
		File file= new File (fileName);
		FileReader reader =null;
		BufferedReader buffer =null;
		FileWriter fw = null;
		PrintWriter out =null;
		String line ="";
	

		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The file doesnot exist");
		}
		try {
			fw= new FileWriter(filename);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buffer = new BufferedReader(reader);
		System.out.println("Reading File");
		try {
			
			line = buffer.readLine();
			while(line!= null) {
				out = new PrintWriter(fw);
				out.println(line);
				line=buffer.readLine();	
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error reading file:"+e.getMessage());
			e.printStackTrace();
		}
		out.flush();
		if(fw!=null) {
			try {
				System.out.println("File has been copied");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
}

