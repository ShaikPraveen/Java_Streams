package com.java_streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java_Streams_File_Writing
{
	//1. Creating a Text file or Excel file(csv)
	//2. Writing the data in Text file  or Excel file(csv)

	public static void main(String[] args) throws IOException 
	{
		
		//Stream Connectivity
		File f=new File("E:\\Praveen_Automation\\Java_Streams\\Sample.txt");
		//File f=new File("E:\\Praveen_Automation\\Java_Streams\\Sample.csv");//->it will create excel file
		FileWriter fw=new FileWriter(f,false);
		BufferedWriter writer=new BufferedWriter(fw);
		
		//Writing inside the line
		
		/*writer.newLine();
		writer.write("SELENIUM");//Next time you will change this text, it will override
		writer.newLine();
		writer.write("Testing");//Now you don't want to override the values just you will put a "true" in filewriter
		writer.newLine();
		writer.write("Automation");
		writer.newLine();
		writer.write("Testing");
		writer.newLine();
		writer.write("JOBS");*/
		
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j <3 ; j++) 
			{
				//Here i want to print Random Numbers b/w 100
				int num=(int)(Math.random()*100);
				writer.write(num+"\t"); //tab t
				//writer.write(num+","); //For csv file we have to use this format
				
			}
			writer.newLine();
			
		}
		
		//Close the Stream
		writer.close();
		System.out.println("FILE CREATED !!!!!");
	}

}
