package Excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
//create the object excel file & write the path
	File myfile = new File("E:\\SELENIUM\\Selenium1\\XML FILE\\Sheet_01.xlsx");
	
	//Using workbookFactory read the Excel file 
	//how to write string value
	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(name);
	
	//how to write numerical value
	double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(number);
	
	// how to get char value
	String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	System.out.println(mychar);
	
	
	//how to get boolean value
	boolean value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	System.out.println(value);
	
	// null value
    boolean value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(1).getBooleanCellValue();
	System.out.println(value1);
	
	
	
	
	
}
}
