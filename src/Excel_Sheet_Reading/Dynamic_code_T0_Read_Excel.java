package Excel_Sheet_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamic_code_T0_Read_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("E:\\SELENIUM\\Selenium1\\XML FILE\\Sheet_02.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		 
        //count total number of rows
		int totalnumberofrow = mysheet.getLastRowNum();
		int rowcount = totalnumberofrow;
		System.out.println(rowcount);
		
		//count total number of cell
		short totalnumberofcell = mysheet.getRow(totalnumberofrow).getLastCellNum();
		int cellcount = totalnumberofcell-1;
		System.out.println(cellcount);
		
		//using for loop fetch the data
		
		for(int i=0;i<=rowcount;i++)
		{
		for(int j=0;j<=cellcount;j++)
		{
			Cell cellvalue = mysheet.getRow(i).getCell(j);
			CellType datatype = cellvalue.getCellType();
			
			if(datatype==CellType.STRING)
			{
				String Svalue = cellvalue.getStringCellValue();
				System.out.print(Svalue+" ");
			}
			
			else if(datatype==CellType.NUMERIC)
			{
			double Nvalue = cellvalue.getNumericCellValue();
			System.out.print(Nvalue+" ");
			}
			
			else if(datatype==CellType.BOOLEAN)
			{
			boolean Bvalue = cellvalue.getBooleanCellValue();
			System.out.print(Bvalue+" ");
			}
			
			else if(datatype==CellType.BLANK)
			{
			
			System.out.println(" ");
			}
			
		}
			
		System.out.println();
	                                                 
			
		}
		
		
     
	}

}
