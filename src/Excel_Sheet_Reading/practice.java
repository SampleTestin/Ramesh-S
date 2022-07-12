package Excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//create object of file and pass the path and extension 
		File myfile =new File("E:\\SELENIUM\\Selenium1\\XML FILE\\Sheet_03.xlsx");
		
		/*1.//using workbookfactory the data
		//read string value
		String value = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(0).getCell(0).getStringCellValue();
        System.out.print(value+" ");
        
       //read char value
        String value1 = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();
        System.out.print(value1+" ");
        
      //read numeric value
      	 double value2 = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(2).getCell(2).getNumericCellValue();
        System.out.print(value2+" ");
        
      //read boolean value
      		 boolean value3 = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(3).getCell(3).getBooleanCellValue();
              System.out.print(value3+" ");
		
		//2.read all data
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		CellType datatype = mycell.getCellType();
		System.out.println(datatype);
		
		for(int i=0;i<=5;i++)
		{
			
		for(int j=0;j<=2;j++)
		{
			
		String value = mysheet.getRow(i).getCell(j).getStringCellValue();	
			
			System.out.print(value+" ");
		}
			
		System.out.println();	
		}*/
		
		//3.dynamic code
		//count total number of rows
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		int totalnumberofrow = mysheet.getLastRowNum();
		int rowcount = totalnumberofrow;
		System.out.println(rowcount);
		
		//count total number of cell
		short totalnumbercell = mysheet.getRow(totalnumberofrow).getLastCellNum();
		int cellcount = totalnumbercell-1;
		System.out.println(cellcount);
		
		for(int i=0;i<=rowcount;i++)
		{
			
		for(int j=0;j<=cellcount;j++)
		{
		Cell cellvalue = mysheet.getRow(i).getCell(j);
		CellType datatype = cellvalue.getCellType();
		if(datatype==CellType.STRING)	
		{
			String Svalue = cellvalue.getStringCellValue();
			System.out.print(Svalue +" ");
			
		}
			
		}
		System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
              
       
	}
	

}
