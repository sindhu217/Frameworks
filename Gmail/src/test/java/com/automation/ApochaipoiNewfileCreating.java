package com.automation;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApochaipoiNewfileCreating {

	public static void main(String[] args) throws Exception {
	 Workbook workbook= WorkbookFactory.create(true);
	Sheet sheet =  workbook.createSheet("sheet1");
	Row row= sheet.createRow(0);
//	String[] data = {"ff","hh","gg","vv"};
//	for(int index=3;index<3;index++){
//	row.createCell(index).setCellValue(data[index]);
//	}
//	 row= sheet.createRow(1);
//	String[] value = {"nn","mm","kk","ll"};
//	for(int index=3;index<3;index++){
//		row.createCell(index).setCellValue(value[index]);	
//	}
	row.createCell(0).setCellValue("TestScriptName");
	row.createCell(1).setCellValue("UserName");
	row.createCell(2).setCellValue("Password");
	row = sheet.createRow(1);
	row.createCell(0).setCellValue("TestScript1");
	row.createCell(1).setCellValue("Mercury");
	row.createCell(2).setCellValue("Admin123");
workbook.write(new FileOutputStream(new File("D:\\www.xlsx")));
	workbook.close();
	 
//		Workbook workbook = WorkbookFactory.create(true);
//		Sheet sheet = workbook.createSheet("Sheet1");
//		Row row = sheet.createRow(0);
//		row.createCell(0).setCellValue("TestScriptName");
//		row.createCell(1).setCellValue("UserName");
//		row.createCell(2).setCellValue("Password");
//		row = sheet.createRow(1);
//		row.createCell(0).setCellValue("TestScript1");
//		row.createCell(1).setCellValue("Mercury");
//		row.createCell(2).setCellValue("Admin123");
//		FileOutputStream outputStream = new FileOutputStream(new File("D:\\TestData.xlsx"));
//		workbook.write(outputStream);
//		workbook.close();
	}

}
