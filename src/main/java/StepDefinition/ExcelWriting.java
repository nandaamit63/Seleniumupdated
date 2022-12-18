package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelWriting {
	
	ApplicationHooks hooks;
	WebDriver driver;
	public ExcelWriting(WebDriver driver)
	{
		this.driver= driver;
	}

	public void excelWriting() throws IOException {
		FileInputStream fis= new FileInputStream("D://AssignmentUpdate.xlsx"); 
		System.out.println("print1");
	    XSSFWorkbook workbook= new XSSFWorkbook(fis);
	    int sheets=workbook.getNumberOfSheets();
	
	    	
	    		XSSFSheet sheet= workbook.getSheetAt(0);
	    		System.out.println("0");
	    		Iterator<Row> rows= sheet.iterator();
	    		Row firstrow= rows.next();
	    		Iterator<Cell> ce1=firstrow.cellIterator();
	    		int k1=0;
	    		int column1=0;
	    		while(ce1.hasNext())
	    		{
	    			Cell value1=ce1.next();
	    			if(value1.getStringCellValue().equalsIgnoreCase("username"))
	    			{
	    				column1=k1;
	    			}
	    			k1++;
	    		}
	    		
	    		Iterator<Cell> ce2=firstrow.cellIterator();
	    		int k2=0;
	    		int column2=0;
	    		while(ce2.hasNext())
	    		{
	    			Cell value2=ce2.next();
	    			if(value2.getStringCellValue().equalsIgnoreCase("password"))
	    			{
	    				column2=k2;
	    			}
	    			k2++;
	    		}
	    		Row r= rows.next();
	    		
	    		Cell Username=r.getCell(column1);
	    		Cell password=r.getCell(column2);
	    		System.out.println(column1);
	    		System.out.println(column2);
	    		System.out.println(Username);
	    		System.out.println(password);
	    		FormulaEvaluator evaluator= workbook.getCreationHelper().createFormulaEvaluator();
	    		DataFormatter formatter= new DataFormatter(); 
	    		
	    		String strval1= formatter.formatCellValue(Username, evaluator);
	    		String strval2= formatter.formatCellValue(password, evaluator);
	    		System.out.println(strval1);
	    		System.out.println(strval2);
	    		
	    		driver.findElement(By.id("user-name")).sendKeys(strval1);
	    		driver.findElement(By.id("password")).sendKeys(strval2);
	    		
	    		
	    	
	    }
	    
	    
	    
	    
	    
	
	
}
