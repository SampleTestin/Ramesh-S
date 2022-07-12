package Excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_All_Excel_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("E:\\SELENIUM\\Selenium1\\XML FILE\\Sheet_02.xlsx");
		
		 Workbook book = WorkbookFactory.create(myfile);
		 Sheet mysheet = book.getSheet("Sheet2");
             Row myrow = mysheet.getRow(0);
             Cell mycell = myrow.getCell(2);
             CellType type = mycell.getCellType();
             System.out.println(type);
             
           for(int i=0 ;i<=2;i++)
           {
        	  for(int j=0;j<=2;j++)
        	  {
        		   String value = mysheet.getRow(i).getCell(j).getStringCellValue();
        		  System.out.print(value +" ");
        		  
        	  }
        	  System.out.println();
        	   
        	
           }  
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
	}

}
