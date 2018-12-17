package CommonUtility;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataReader  {
	public String data;
	public int rowCount;
	public int colsCount;
	HashMap<String,String>hmap = new HashMap<String,String>();
	
			
			public TestDataReader()   {
				
				try
				{
				File src= new File(ConstantClass.DataPath);
				FileInputStream fis = new FileInputStream(src);
				@SuppressWarnings("resource")
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sh = wb.getSheet(ConstantClass.sheetName);
				rowCount = sh.getLastRowNum();
				Log.info("[CLASS:TestDataReader]/[Method getLastRownum()] return"+rowCount+" rows to calling method");
			 
			   
			   for(int i=1;i<=rowCount;i++)
			   {
				      String key=sh.getRow(i).getCell(1).getStringCellValue();
				      String value=sh.getRow(i).getCell(2).getStringCellValue();
					  hmap.put(key, value);
					  Log.info("[CLASS:TestDataReader]/[collection hmap]" +key+" and "+value+" entered in hmap");
				   
			   }
				
			}
				
			
			catch(Exception e)
			{
				Log.error("[CLASS:TestDataReader]/[Constructor TestDataReader()] Error in constructor TestDataReader|Exception Desc "+e.getMessage());
			
			
			}
				
				
				
			}	
			public String getData(String Key) {
				
				return hmap.get(Key);
				
				
			}
			

			
			
		}



