package StepDefinition;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReading {
	public void excelReading(String price, String name) throws IOException
	{
		Workbook wb= new HSSFWorkbook();
		CreationHelper createhelper= wb.getCreationHelper();
		System.out.println(price);
		System.out.println(name);
		Sheet sheet1= wb.createSheet("Sheet1");
		System.out.println(price);
		System.out.println(name);
		Row row =sheet1.createRow(0);
		Cell cell1 =row.createCell(0);
		Cell cell2 =row.createCell(1);
		cell1.setCellValue(createhelper.createRichTextString(price));
		cell2.setCellValue(createhelper.createRichTextString(name));
		FileOutputStream fileoutput= new FileOutputStream("D://EnterDetails1.xls");
		wb.write(fileoutput);
		fileoutput.close();
		
		
	}
	}
	


