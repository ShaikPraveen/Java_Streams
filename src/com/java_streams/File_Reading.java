package com.java_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reading 
{
	public static void main(String[] args) throws IOException {
		
		//Stream Connectivity
		File f=new File("E:\\Praveen_Automation\\Java_Streams\\Sample.txt");
		FileReader fr=new FileReader(f);
		BufferedReader reader=new BufferedReader(fr);
		
		 //Reading the File data    
		 System.out.println(reader.readLine());//it will read   first line
		 System.out.println(reader.readLine());//it will second second line
		 
		 //I want read all the data
		  
		  String line=null;
		  while ((line=reader.readLine())!=null)
		  {
			  
			  System.out.println(line);
		  }
		 reader.close();
	}

}
