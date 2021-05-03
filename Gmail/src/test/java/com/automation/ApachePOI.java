package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePOI {

	public static void main(String[] args)  throws Exception{
		File file = new File("D:\\sss.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
//		Workbook workbook=WorkbookFactory.create(inputStream);
//		System.out.println(workbook.getNumberOfSheets());
//		Sheet sheet= workbook.getSheet("sheet1");
//		System.out.println(sheet.getPhysicalNumberOfRows());
//		System.out.println(sheet.getFirstRowNum());
//		System.out.println(sheet.getLastRowNum());
//		Row row=sheet.getRow(0);
//		System.out.println(row.getPhysicalNumberOfCells());
//		System.out.println(row.getFirstCellNum());
//		System.out.println(row.getLastCellNum());
		
		
		
		Workbook workbook=WorkbookFactory.create(inputStream);
		 Sheet sheet= workbook.getSheet("sheet1");
		 for(int rowindex=sheet.getFirstRowNum();rowindex<=sheet.getLastRowNum();rowindex++) {
			 for(int cellindex=sheet.getRow(rowindex).getFirstCellNum();cellindex < sheet.getRow(rowindex).getLastCellNum();cellindex++) {
			 System.out.print(sheet.getRow(rowindex).getCell(cellindex) + "\t"); 
		 }
			 System.out.println();
		 }
		sheet.getRow(1).createCell(4).setCellValue("PASS");
		workbook.write(new FileOutputStream(file));
		workbook.close();
		

	}

}
