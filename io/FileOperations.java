package io;

import java.io.File;
import java.util.Date;

public class FileOperations {

	public static void main(String[] args) {
		// folder create
		File file = new File("D://mydata");
		//boolean done = file.mkdir();
		 System.out.println("Folder:"+file.getName());
		//System.out.println(done);
		String[] files = file.list();
		
		for(String s:files) {

			File f = new File(file.getPath()+"/"+s);
			System.out.println(f.getName() +" "+ new Date(f.lastModified())+" "+f.length());
		}
		
		
		

	}
}
