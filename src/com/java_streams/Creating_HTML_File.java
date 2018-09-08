package com.java_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Creating_HTML_File 
{
	public static void main(String[] args) throws IOException
	{
		//Log4j Introduction
		Logger log=Logger.getLogger("devpinoyLogger");
		
		
		File f=new File("E:\\Praveen_Automation\\Java_Streams\\Sample.html");
		log.debug("File Created");
		FileWriter fw=new FileWriter(f);
		BufferedWriter writer=new BufferedWriter(fw);
		
		writer.write("<html><body><title>PRAVEEN LEARNING AUTOMATION</title><h1>Hi i am Learning Automation</h1></body></html>");
		
		writer.close();
		System.out.println("HTML FILE CREATED SUCCESSFULLY !!!");
		
	}

}
