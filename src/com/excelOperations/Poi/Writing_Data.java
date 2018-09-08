package com.excelOperations.Poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data 
{
	public static void main(String[] args) throws IOException 
	{
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet();
		XSSFRow row0=ws.createRow(1);
		/*XSSFCell cellA=row0.createCell(0);
		XSSFCell cellB=row0.createCell(1);
		
		cellA.setCellValue("PRAVEEN");
		cellB.setCellValue("Automation");*/
		
		
		
		for (int rows = 0; rows < 10; rows++)
		{
			XSSFRow row=ws.createRow(rows);
			for (int clos = 0; clos < 10; clos++) 
			{
				Cell cell= row.createCell(clos);
				cell.setCellValue((int)(Math.random()*100));	
			}	
		}
		
		        //Create Stream
				File f=new File("E:\\Praveen_Automation\\Java_Streams\\SampleExcelFile.xlsx");
				FileOutputStream fo=new FileOutputStream(f);
				wb.write(fo);
		
		wb.close();
		System.out.println("FILE CREATED SUCCESSFULLY !!!");	
	}

}
