package ReusableClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import CommonUtility.BaseAction;
import CommonUtility.ConstantClass;
import CommonUtility.Log;
import CommonUtility.OR;
import CommonUtility.TestDataReader;

public class Reusable  {
	
	private static TestDataReader ds=new TestDataReader();
	public static WebDriver driver;
	public static java.sql.Statement stmt=null;
	public static Connection conn = null;
	public static ResultSet rs=null;
	public static void LoginPage(WebDriver driver) throws Exception
	{
		try
		{
		  BaseAction.Enter_Text(driver, "L_Username",OR.getMessages("USER"));
		  BaseAction.Enter_Text(driver, "L_Password",OR.getMessages("PWD"));
		  BaseAction.clickElement(driver, "L_SignIn","Sign In");
		  BaseAction.waitFor();
		  Log.info("[CLASS:Reusable]/[Method:LoginPage()]/LoginPage is displayed");
		  
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:LoginPage()]/Exception in LoginPage()"+e.getMessage());
		}
		
	}
	
	public static void StorePage(WebDriver driver) throws Exception
	{
		try
		{
		  BaseAction.Enter_Text(driver, "L_Username",OR.getMessages("USER")) ;
		  BaseAction.Enter_Text(driver, "L_Password",OR.getMessages("PWD")) ;
		  BaseAction.clickElement(driver, "L_SignIn"," ");
		  BaseAction.waitFor();
		  BaseAction.Enter_Text(driver, "DStoreInput", OR.getMessages("STORE"));
		  BaseAction.clickElement(driver, "DSetStore"," ");
		  Log.info("[CLASS:Reusable]/[Method:StorePage()]/StorePage is displayed");
		  
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:StorePage()]/Exception in StorePage()"+e.getMessage());
		}
	}
	
	public static void clearAll(WebDriver driver,String locatorName)
	{
		WebElement ele;
		try
		{
          ele=BaseAction.Element(driver, locatorName);
		  ele.sendKeys(Keys.CONTROL + "a");
	      ele.sendKeys(Keys.DELETE);
	      Log.info("[CLASS:Reusable]/[Method:clearAll()]/field content is deleted");
		  
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:clearAll()]/Exception in clearAll()"+e.getMessage());
		}
		
		
	}
	public static void Isclear(WebDriver driver,String locatorName)
	{
		WebElement ele;
		try
		{
          ele=BaseAction.Element(driver, locatorName);
		  ele.clear();
		  Log.info("[CLASS:Reusable]/[Method:clearAll()]/field content is deleted");
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:IsClear()]/Exception in IsClear()"+e.getMessage());
		}
		
		
	}
	public static void MobileStore(WebDriver driver) throws Exception
	{
		try
		{
		  BaseAction.Enter_Text(driver, "L_Username",OR.getMessages("USER")) ;
		  BaseAction.Enter_Text(driver, "L_Password",OR.getMessages("PWD")) ;
		  BaseAction.clickElement(driver, "L_SignIn"," ");
		  BaseAction.waitFor();
		  BaseAction.Enter_Text(driver, "LMStore", OR.getMessages("STORE"));
		  BaseAction.clickElement(driver, "LMSUbmit","Submit");
		  Log.info("[CLASS:Reusable]/[Method:MobileStore()]/MobileUI is login");
		  
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:MobileStore()]/Exception in MobileStore()"+e.getMessage());
		}
	}
	public static void MobileHipPrinter(WebDriver driver) throws Exception
	{
		try
		{
			  BaseAction.clickElement(driver, "LHipPrinter", "Hip Printer");
	          BaseAction.Enter_Text(driver, "LHipEditText", ds.getData("59393VIP"));
	          BaseAction.Element(driver, "LHipEditText").sendKeys(Keys.ENTER);
	          BaseAction.waitFor();
	          Assert.assertTrue(BaseAction.read_Text(driver, "LModal").contains("Pairing Complete"));
	          Assert.assertTrue(BaseAction.read_Text(driver, "LOKBtn").contains("OK"));
	          BaseAction.clickElement(driver, "LOKBtn", "OK");
	          Log.info("[CLASS:Reusable]/[Method:MobileHipPrinter()]/Hipprinter Pairing is complete");
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:MobileHipPrinter()]/Exception in MobileHipPrinter()"+e.getMessage());
		}
	}
		
	public static void HomePage(WebDriver driver,String MenuButton) throws Exception
	{
		try
		{
		 Reusable.StorePage(driver);
		 
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:HomePage())]/Exception in HomePage()"+e.getMessage());
		}
	}
	
public static boolean IsNumeric(WebDriver driver,String locatorName) throws Exception {
	boolean IsNumeric = false;
		try
		{
			String str = BaseAction.read_Value(driver, locatorName);
		
		
			if (str.equalsIgnoreCase(""))
				IsNumeric = false;

			else if (!str.equalsIgnoreCase("")) {
				String pattern = "^[0-9]*$";
				IsNumeric = str.matches(pattern);
			}
		}
		
		catch(Exception e)
		{
			
			Log.error("[CLASS:Reusable]/[Method:IsNumeric())]/Exception in IsNumeric()"+e.getMessage());
		}

			return IsNumeric;
		}

	
	
	public static boolean IsDisplayed(WebDriver driver,String locatorName)
	{
		boolean IsDisplay=false;
		try
		{
		WebElement ele=BaseAction.Element(driver, locatorName);
	      if(ele.isDisplayed())
	      {
	    	  Reusable.EleBound(driver, ele);	 
	    	  IsDisplay=true;
	    	  Log.info("[CLASS:Reusable]/[Method:IsDisplayed()]"+ele+"is displayed");
	      }
	      else
	      {
	    	  IsDisplay=false;
	    	  Log.info("[CLASS:Reusable]/[Method:IsDisplayed()]"+ele+"is not displayed");
	      }
		}
		catch(Exception e)
		{
			Log.error("[CLASS:Reusable]/[Method:IsDisplayed())]/Exception in IsDisplayed()"+e.getMessage());
		}
	      
	      return IsDisplay;
	      
	}
	
	
public static boolean IsEnabled(WebDriver driver, String LocatorName,String btnName)
{
	
 boolean EnableStatus=false;
 
 try
 {
	List<WebElement> menuBtn= driver.findElements(OR.getObject(LocatorName));
	for(int i=0;i<menuBtn.size();i++)
	{
		WebElement ele=menuBtn.get(i);
		System.out.println("menu"+ele.getText());
		if(ele.getText().contains(btnName))
		{Reusable.EleBound(driver, ele);	
			EnableStatus=ele.isEnabled();
			break;
		}		
			
}
 }
 catch(Exception e)
 {
	 Log.error("[CLASS:Reusable]/[Method:IsEnabled())]/Exception in IsEnabled()"+e.getMessage());
 }
	return EnableStatus;
}

public static void selectPlanogram(WebDriver driver){

	
	try
	{
		
		String ACCSRY =ds.getData("TCACCSRY1");
	    String Value[]=ACCSRY.split(":");
		BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",Value[0],"DPLANOTTYP");
		Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),Value[0]);
			
		for(int j=1;j<Value.length;j++)
		{
			
		BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",Value[j],"DPLANOTTLTYP");
		Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),Value[j]);
}

		
		
	}
	catch(Exception e)
	{
		 Log.error("[CLASS:Reusable]/[Method:selectPlanogram())]/Exception in selectPlanogram()"+e.getMessage());
	}

	
}


public static void IsWindowsHandle(WebDriver driver,String Pr,String TC)
{
	String[] dialog;
	try {
		switch(Pr)
		{
		case "Preview":
		BaseAction.clickElement(driver, "DPREVIEW", OR.getMessages("PREVIEW"));
        Thread.sleep(10000);
        dialog =  new String[]{ ConstantClass.printPreiew,TC};
        Runtime.getRuntime().exec(dialog);
        break;
		case "Print":
		BaseAction.clickElement(driver, "DPRINT", OR.getMessages("PRINT"));
		Thread.sleep(6000);
		dialog =  new String[]{ ConstantClass.LoadPaper,TC};
        Runtime.getRuntime().exec(dialog);
        break;
		case "Logout":
		BaseAction.clickElement(driver,"DLOGOUT",OR.getMessages("LOGOUT")); 
		Thread.sleep(6000);
		dialog =  new String[]{ConstantClass.Logout,TC};  
		Runtime.getRuntime().exec(dialog);
		Thread.sleep(6000);
		break;
		case "Stay":
		BaseAction.clickElement(driver,"DLOGOUT",OR.getMessages("LOGOUT")); 
		Thread.sleep(6000);
		dialog =  new String[]{ConstantClass.Stay,TC};  
		Runtime.getRuntime().exec(dialog);
		Thread.sleep(6000);
		break;
			
		}
	}
	catch (Exception e) {
			// TODO Auto-generated catch block
		 Log.error("[CLASS:Reusable]/[Method:IsWindowHandle())]/Exception in IsWindowHandle()"+e.getMessage());
		}
		
	}



public static boolean IsElementPresent(WebDriver driver,int i)
{
	int count=driver.findElements(By.xpath("//*[@id='slimScroll']/table/tbody/tr["+i+"]")).size();
	if(count==0)
		return false;
	else
		return true;
	
	
}


public static void IsCheckBox(WebDriver driver,String Action)

{
	int rows=BaseAction.ElementList(driver, "LROWS").size();
	WebElement baseTable = driver.findElement(By.tagName("table"));

	try
	{
	switch(Action)
		{
	case "ALL":
	for(int i=1;i<=rows;i++)
	{
	 baseTable = driver.findElement(By.tagName("table"));
     WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
     WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/desktop-checkbox/img"));
     cellIneed.click();
     Log.info("Check box is selected");
    }
	break;
	
	case "1":
	for(int i=1;i<=rows;i++)
	{
	 
     WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
     WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/desktop-checkbox/img"));
     if(i==1)
     {
     cellIneed.click();
     Log.info("Position"+i+"Check box is selected");
     }
	}
	break;
	case "2":
	for(int i=1;i<=rows;i++)
	{
	 
     WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
     WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
     if(i==1||i==2)
     {	 
     cellIneed.click();
     Log.info("Position"+i+"Check box is selected");
     }
	}
	break;
	
	case "Even":	
	for(int i=1;i<=rows;i++)
	{
     WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
     WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
     if(i%2==0)
     {
     cellIneed.click();
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed);
     Log.info("Position"+i+"Check box is selected");
     }
	}
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)"); 
	break;
	case "Odd":
	for(int i=1;i<=rows;i++)
	{
	 
	 WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
     WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
     if(i%2!=0)
     {
     cellIneed.click();
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed); 
     Log.info("Position"+i+"Check box is selected");
     }
			}
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)"); 
	break;
	
	
	}
		}
						  
catch(Exception e)
{
	 Log.error("[CLASS:Reusable]/[Method:IsCheckBox()]/Exception in IsCheckBox()"+e.getMessage());
}
}

public static boolean IsModalPresent(WebDriver driver,String locator1,String locator2,String locator3,String Msg1,String Msg2,String Msg3)
{
	boolean isPopup=false;
	try
	{
		if(BaseAction.read_Text(driver, locator1).equals(OR.getMessages(Msg1)))
		{
		// Assert.assertEquals(BaseAction.read_Text(driver, locator1),OR.getMessages(Msg1) );
		 Reporter.log(OR.getMessages(Msg1)+" Message is displayed");
		 if(BaseAction.read_Text(driver, locator2).equals(OR.getMessages(Msg2)))
		 Reporter.log(OR.getMessages(Msg2)+" Message is displayed");
		 BaseAction.clickElement(driver, locator3, OR.getMessages(Msg3));
		 BaseAction.waitFor();
		 isPopup=true;
	}
		else
			isPopup=false;
	}
	catch(Exception e)
	{
		 Log.error("[CLASS:Reusable]/[Method:IsModalPresent()]/Exception in IsModalPresent()"+e.getMessage());
	}
	return isPopup;
}
public static String IsCarrierPresent(WebDriver driver,String CarrierType,String locator,String Action)
{
	String isSelect="";
ds.getData(CarrierType);
	try
	{
		switch(CarrierType)
		{
		case "ATT":
			if(BaseAction.read_Text(driver,"DATT").contains("ATT"))
			{
			BaseAction.clickElement(driver, "DU2","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U2";
			}
			break;
		case "Sprint":
			if(BaseAction.read_Text(driver,"DSPRT").contains("Sprint"))
			{
			BaseAction.clickElement(driver, "DU0","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U0";
			}
			break;
			
		case "Verizon":
			if(BaseAction.read_Text(driver,"DVER").contains("Verizon")) 
			{
			BaseAction.clickElement(driver, "DU1","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U1";
			}
			break;
			
		case "Hardware":
			if(BaseAction.read_Text(driver,"DHW").contains("Hardware"))
			{
			BaseAction.clickElement(driver, "DU3","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U3";
			}
			break;
		case "All":
			if(BaseAction.read_Text(driver,"DSPRT").contains("Sprint")&&BaseAction.read_Text(driver,"DVER").contains("Verizon")&&BaseAction.read_Text(driver,"DATT").contains("ATT")&&BaseAction.read_Text(driver,"DHW").contains("Hardware"))
			{
			BaseAction.clickElement(driver, "DU0","");
			
			BaseAction.clickElement(driver, "DU1","");
			
			BaseAction.clickElement(driver, "DU2","");
			
			BaseAction.clickElement(driver, "DU3","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U0U1U2U3";
			}
			break;
		case "Sprint&Verizon":
			if(BaseAction.read_Text(driver,"DSPRT").contains("Sprint")&&BaseAction.read_Text(driver,"DVER").contains("Verizon"))
			{
			BaseAction.clickElement(driver, "DU0","");
			BaseAction.clickElement(driver, "DU1","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U0U1";
			}
			break;
		case "ATT&Verizon&HW":
			if(BaseAction.read_Text(driver,"DATT").contains("ATT")&&BaseAction.read_Text(driver,"DVER").contains("Verizon")&&BaseAction.read_Text(driver,"DHW").contains("Hardware"))
			{
			
			BaseAction.clickElement(driver, "DU1","");
			BaseAction.clickElement(driver, "DU2","");
			BaseAction.clickElement(driver, "DU3","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U1U2U3";
			}
			break;
		case "Verizon&ATT&HW":
			if(BaseAction.read_Text(driver,"DVER").contains("ATT")&&BaseAction.read_Text(driver,"DSPRT").contains("Verizon")&&BaseAction.read_Text(driver,"DATT").contains("Hardware"))
			{
			
			BaseAction.clickElement(driver, "DU0","");
			BaseAction.clickElement(driver, "DU1","");
			BaseAction.clickElement(driver, "DU2","");
			BaseAction.clickElement(driver,locator,OR.getMessages(Action));
			isSelect="U0U1U2";
			}
			break;
	
	case "G0":
		if(BaseAction.read_Text(driver, "DSPRT").contains(ds.getData("G0")))
		{
		
		BaseAction.clickElement(driver, "DU0","");
		BaseAction.clickElement(driver,locator,OR.getMessages(Action));
		isSelect="G0";
		}
		else if(BaseAction.read_Text(driver, "DVER").contains(ds.getData("G0")))
		{
		BaseAction.clickElement(driver, "DU1","");
		BaseAction.clickElement(driver,locator,OR.getMessages(Action));
		isSelect="G0";
		}
		else if(BaseAction.read_Text(driver, "DATT").contains(ds.getData("G0")))
		{
		BaseAction.clickElement(driver, "DU2","");
		BaseAction.clickElement(driver,locator,OR.getMessages(Action));
		isSelect="G0";
		}
		else if(BaseAction.read_Text(driver, "DHW").contains(ds.getData("G0")))
		{
		BaseAction.clickElement(driver, "DU3","");
		BaseAction.clickElement(driver,locator,OR.getMessages(Action));
		isSelect="G0";
		}
		break;
	case "AllGrid":
		if(Reusable.IsDisplayed(driver, "DU0"))
		BaseAction.clickElement(driver, "DU0","");
		if(Reusable.IsDisplayed(driver, "DU1"))
		BaseAction.clickElement(driver, "DU1","");
		if(Reusable.IsDisplayed(driver, "DU2"))
		BaseAction.clickElement(driver, "DU2","");
		if(Reusable.IsDisplayed(driver, "DU3"))
		BaseAction.clickElement(driver, "DU3","");
		BaseAction.clickElement(driver,locator,OR.getMessages(Action));
		isSelect="G0G1G2G3";
	 break;
	case "G0G1":
		if(BaseAction.read_Text(driver,"DSPRT").contains(ds.getData("G0"))||BaseAction.read_Text(driver,"DSPRT").contains(ds.getData("G1")))
		BaseAction.clickElement(driver, "DU0","");
		if(BaseAction.read_Text(driver,"DVER").contains(ds.getData("G0"))||BaseAction.read_Text(driver,"DVER").contains(ds.getData("G1")))
		BaseAction.clickElement(driver, "DU1","");
		if(BaseAction.read_Text(driver,"DATT").contains(ds.getData("G0"))||BaseAction.read_Text(driver,"DATT").contains(ds.getData("G1")))
		BaseAction.clickElement(driver, "DU2","");
		
		
		BaseAction.clickElement(driver,locator,OR.getMessages(Action));
		isSelect="G0G1";
	 break;
}
	}
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:IsCarrierPresent()]/Exception in IsCarrierPresent()"+e.getMessage());
	}
	return isSelect;
}


public static String WindowSwitch(WebDriver driver)

{
	String Form="";
	try
	{
String parentHandle = driver.getWindowHandle(); // get the current window handle
                                           
for (String winHandle : driver.getWindowHandles())
{
    
    driver.switchTo().window(winHandle); //Gets the new window handle              
}
BaseAction.Enter_Text(driver, "L_Username",OR.getMessages("UserName")) ;
BaseAction.Enter_Text(driver, "L_Password",OR.getMessages("Password"));

BaseAction.clickElement(driver, "L_SignIn"," ");
BaseAction.waitFor();

Form = BaseAction.read_Text(driver,"DFACTTAGFORM");
driver.close();                                 // close newly opened window when done with it
driver.switchTo().window(parentHandle); 
	}
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:WindowSwitch()]/Exception in WindowSwitch()"+e.getMessage());
	}
return Form;
}



public static void EleBound(WebDriver driver,WebElement element)
{
	if (driver instanceof JavascriptExecutor) {
   ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", element);
    }
}

public static void IncreDecre(WebDriver driver,String locatorName,int c)
{
for(int i=1;i<=c;i++)
{
	BaseAction.clickElement(driver, locatorName," ");
}
	
	
	
}
public static boolean IsPricingGrid(WebDriver driver,int grids)
{
	int count=0;
try
{   List<WebElement> Grid=BaseAction.ElementList(driver, "LAssociatedGrid");
	for(int i=1;i<=Grid.size()-2;i++)
	{
	Reusable.IsEnabled(driver, "LAssociatedGrid", ds.getData("CBGRDID"+i));
	count++;
	} 	



}
catch(Exception e)
{
	Log.error("[CLASS:Reusable]/[Method:IsPricingGrid()]/Exception in IspricingGrid()"+e.getMessage());
	
}
if(count==grids)
	return true;
else
	return false;


}

public static boolean ItemValidation(WebDriver driver,String arr[][])
{
	boolean ItemStatus=false;
	int rows=BaseAction.ElementList(driver, "LROWS").size();
	System.out.println("rows value is : " + rows); 
	//int cols=BaseAction.ElementList(driver, "LCOLS").size();
	 WebElement baseTable = driver.findElement(By.tagName("table"));
	try
	{
	for(int i=1;i<=rows;i++)
	{
		for(int j=2;j<=4;j++)
		{
			    WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
			   
			    
			    //to get 3rd row's 2nd column data
			    WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			   
			    if(valueIneed.contains(arr[i-1][j-2]))
			    		{
			    	
			    	Reusable.EleBound(driver, cellIneed);
			    	ItemStatus=true;
			    	System.out.println(ItemStatus);
			    		}
			    else
			    	ItemStatus=false;
			    
		}
		WebElement tableRow1 = baseTable.findElement(By.xpath("//table/tbody/tr["+rows+"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tableRow1);
		
		
	}
	}
	
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:ItemValidation()]/Exception in ItemValidation())"+e.getMessage());
	}
	
	return ItemStatus;
	
}

public static boolean findBatch(WebDriver driver,String BatchName)
{
	boolean BatchStatus=false;
	int rows=BaseAction.ElementList(driver, "LROWS").size();
	
	try
	{
	for(int i=1;i<=rows;i++)
	{
		
			 WebElement baseTable = driver.findElement(By.tagName("table"));
			 WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
			 WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]/a"));
			 if(cellIneed.getText().equals(BatchName))
			   {
				   Reusable.EleBound(driver, cellIneed);
				   driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]/a")).click();
				   BatchStatus=true;
				   break;
			   }
			 if(i==rows)
				break;
		WebElement tableRow1 = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"+1]"));
	 	WebElement cellIneed1 = tableRow1.findElement(By.xpath("//table/tbody/tr["+i+"+1]/td[4]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed1);  
	}
	

	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)"); 
	}
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:findBatch()]/Exception in findBatch())"+e.getMessage());
	}
	
	return BatchStatus;
	
}

public static int ItemValidation1(WebDriver driver,String TC)
{
int ItemStatus=0;
int k=0;
	String Data =ds.getData(TC);
	String Item[]=Data.split(":");
	int rows=BaseAction.ElementList(driver, "LROWS").size();
	System.out.println(rows);
	//int cols=BaseAction.ElementList(driver, "LCOLS").size();
	WebElement baseTable = driver.findElement(By.tagName("table")); 
	
	try
	{
	for(int i=1;i<=rows;i++)
	{
		for(int j=2;j<=4;j++)
		{
			    	
				    WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
				    WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				    System.out.println("Cell value is : " +cellIneed.getText());  
				    if(cellIneed.getText().contains(Item[k++]))
					{
				    Reusable.EleBound(driver, cellIneed);
					ItemStatus++;
					System.out.println(ItemStatus);
				
					
					}
				    
			    }
				if(i==rows)
					break;
		WebElement tableRow1 = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"+1]"));
	 	WebElement cellIneed1 = tableRow1.findElement(By.xpath("//table/tbody/tr["+i+"+1]/td[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed1);  
	
		
		
	
			 
		}

	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)"); 
	
	
	}
	
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:ItemValidation1()]/Exception in ItemValidation1())"+e.getMessage());
	}
	
	return ItemStatus;
	


}
public static int labelInfo(WebDriver driver,String TC)
{
int ItemStatus=0;
int k=0;
	String Data =ds.getData(TC);
	String Item[]=Data.split(":");
	int rows=BaseAction.ElementList(driver, "LROWS").size();
	System.out.println(rows);
//	int cols=BaseAction.ElementList(driver, "LCOLS").size();
	WebElement baseTable = driver.findElement(By.tagName("table")); 
	
	try
	{
	for(int i=1;i<=rows;i++)
	{
		for(int j=2;j<=3;j++)
		{

		    WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
		    WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
		    System.out.println("Cell value is : " +cellIneed.getText());  
		    if(cellIneed.getText().contains(Item[k++]))
			{
		    Reusable.EleBound(driver, cellIneed);
			ItemStatus++;
			}
		
		    } 
		WebElement qty=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]/form/input"));
	    if(qty.getAttribute("value").contains(Item[k++]))
	    {
	    Reusable.EleBound(driver, qty);
	    ItemStatus++;
	    }
		if(i==rows)
		break;
		WebElement tableRow1 = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"+1]"));
	 	WebElement cellIneed1 = tableRow1.findElement(By.xpath("//table/tbody/tr["+i+"+1]/td[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed1);  
	}

	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)"); 
	}
	
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:labelInfo()]/Exception in labelInfo())"+e.getMessage());
	}
	
	return ItemStatus;
	


}


public static String Length(WebDriver driver,String Type,String Data)

{
	String Title="";

	if(Type.equalsIgnoreCase("Title"))
	{
	int count=Data.length();
	int Titlesize=(47-count);
	Title = Integer.toString(Titlesize);
}

	if(Type.equalsIgnoreCase("Artist"))
	{
	int count=Data.length();
	int Titlesize=(24-count);
    Title = Integer.toString(Titlesize);
}

	return Title;
}

public static String IsDate()
{
	Date date = new Date();

    String strDateFormat = "HH:mm:ss a";
    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
    System.out.println(sdf.format(date));
	 

return sdf.format(date);
	}



public static ResultSet IsDbConnection(String Query,String Table) throws Exception
{
	
	
	  String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	  String DB_URL = "jdbc:oracle:thin:@dlocdb06:50000/t01sgumdl.world";
	  String PASS = new String(Base64.getDecoder().decode(OR.getMessages("DB_PWD").getBytes()));
	try
	{ 
		
		
		 
		  Class.forName(JDBC_DRIVER);
	      conn = DriverManager.getConnection(DB_URL,OR.getMessages("DB_USER"),PASS);
	      stmt = conn.createStatement();
	      rs= stmt.executeQuery(Query);
	
	  
	    
	    
	      
	  }
	
	catch(Exception e){
	   Log.error("[Class:Reusable]/Exception in [method:IsDbConnection()]"+e.getMessage());
	     throw(e);
	   }
	

	return rs;
	}

//end main
public static boolean IsSelectQuery(String Query,String Data,String Table) throws Exception
{
	
	boolean status=false;
	  int k=0;
	  String DT;
	  String Item[]=new String[10];
	try
	{
		rs=Reusable.IsDbConnection(Query, Table);
		boolean p=rs.next();
		
		switch(Table)
		{
		case "Select" :
		 if(!p)
		 {
			 System.out.println(p);
		status=true;
		 }
		 break;
		 case "DEVICECONFIG":
			  DT=ds.getData(Data);
			  Item=DT.split(":");
		   while(rs.next())
		    	 {
		    	if(rs.getString("SERIAL_NUM").equalsIgnoreCase(Item[k++])&&Integer.toString(rs.getInt("LOC_ID")).equalsIgnoreCase(Item[k++])&&rs.getString("EXTERNAL_ID").equalsIgnoreCase(Item[k++])&&rs.getString("TEMPLATE").equalsIgnoreCase(Item[k++]))
                status=true;
		        System.out.println(rs.getString("SERIAL_NUM"));
		        System.out.println(rs.getInt("LOC_ID"));
		        System.out.println(rs.getString("EXTERNAL_ID"));
		        System.out.println(rs.getString("TEMPLATE"));
		  }	
		   break;
		  }
	  rs.close();
	  stmt.close();
	  conn.close();	
	}
	
	catch(Exception e){
	   
		   Log.error("[Class:Reusable]/Exception in [method:IsSelectQuery()]"+e.getMessage());
		     throw(e);
	   }
	finally{
	      try{
	         if(stmt!=null)
	            stmt.close();
	         }
	      catch(SQLException se2){
	    	  Log.error("[Class:Reusable]/Exception in [method:IsSelectQuery()]"+se2.getMessage());
			     throw(se2);
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	    	  
	    	  Log.error("[Class:Reusable]/Exception in [method:IsSelectQuery()]"+se.getMessage());
			    throw(se);
	      }//end finally try
	   }//end try

	return status;
	}
public static boolean IsInsertQuery(String Query,String Table) throws Exception
{
	
	boolean status=false;
	try
	{
	rs=Reusable.IsDbConnection(Query, Table); 
    conn.setAutoCommit (true);
	if(rs.next())
		status=true;
	  rs.close();
	  stmt.close();
	  conn.close();	
	}
	
	catch(Exception e){
	   
		 Log.error("[Class:Reusable]/Exception in [method:IsInsertQuery()]"+e.getMessage());
	     throw(e);
	   }
	finally{
	      try{
	         if(stmt!=null)
	            stmt.close();
	         }
	      catch(SQLException se2){
	    	  Log.error("[Class:Reusable]/Exception in [method:IsInsertQuery()]"+se2.getMessage());
			     throw(se2);
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	    	  
	    	  Log.error("[Class:Reusable]/Exception in [method:IsInsertQuery()]"+se.getMessage());
			     throw(se);
	      }//end finally try
	   }//end try

	return status;
	}


//end main


public static void ESLStore(WebDriver driver,String Store) throws Exception
{
	try
	{
	
	  BaseAction.Enter_Text(driver, "LMStore", Store);
	  BaseAction.clickElement(driver, "LMSUbmit","Submit");
	  
	}
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:ESLStore()]/Exception in ESLStore())"+e.getMessage());
	}
}

public static int IsESLPlngrm(WebDriver driver,String TC)
{
int ItemStatus=0;
int k=0;
	String Data =ds.getData(TC);
	String Item[]=Data.split(":");
	int rows=BaseAction.ElementList(driver, "LROWS").size();
	int cols=BaseAction.ElementList(driver, "LCOLS").size();
	WebElement baseTable = driver.findElement(By.tagName("table")); 
	
	try
	{
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=cols;j++)
		{
			    	
				    WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
				    WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed);
				    System.out.println(cellIneed.getText());
				    if(cellIneed.getText().contains(Item[k++]))
					{
				    	
				    Reusable.EleBound(driver, cellIneed);
					ItemStatus++;
					}
				    
			    }
	}
	
	
	}
	
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:IsESLPlngrm()]/Exception in IsESLPlngrm())"+e.getMessage());
	}
	
	return ItemStatus;
	


}
public static int IsDownStock(WebDriver driver)
{
int ItemStatus=0;

	int rows=BaseAction.ElementList(driver, "LROWS").size();
	int cols=BaseAction.ElementList(driver, "LCOLS").size();
	WebElement baseTable = driver.findElement(By.tagName("table")); 
	
	try
	{
	for(int i=rows;i>=1;i--)
	{
		for(int j=1;j<=cols;j++)
		{
			    	
				    WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr["+i+"]"));
				    WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  cellIneed); 
				    
				    System.out.println(cellIneed.getText());
				    if(cellIneed.getText().contains("Complete"))
				    {
				    	
				    Reusable.EleBound(driver, cellIneed);
				   WebElement e= driver.findElement(By.xpath("//esl-downstock-page/main/div/div[4]/div/div/div/div[1]/table/tbody/tr["+i+"]/td["+j+"]/button"));
				   e.click();
				    Thread.sleep(2000);
				 
					ItemStatus++;
					}
			
			
			    }
	}
	
	
	}
	
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:IsDownStock()]/Exception in IsDownStock())"+e.getMessage());
	}
	
	return ItemStatus;
	


}
public static boolean IsESLPOS(WebDriver driver,String POS,String TC)
{
	int count=0;
	boolean flag=false;
	int po=Integer.parseInt(POS);
	try
	{
	for(int i=1;i<=po;i++)
		{
	  Assert.assertEquals(BaseAction.read_Text(driver, "ESLPLNGRMPOSTXT"), OR.getMessages("ESLPLNGRMPOSTXT"));
	  Reporter.log(OR.getMessages("ESLPLNGRMPOSTXT")+" Label text is displayed");
	  Assert.assertEquals(BaseAction.read_Text(driver, "ESLPLNGRMPOS"), ds.getData(TC+"POS"));
	  Reporter.log(ds.getData(TC+"POS")+" position is displayed");
	  Assert.assertEquals(BaseAction.read_Text(driver, "ESLPLNGRMSUBPOS"), "("+i+" of "+POS+")");
	  Reporter.log("(1 of"+ i+")"+" sub position is displayed");
	  Assert.assertEquals(BaseAction.read_Text(driver, "ESLPLNGRMDESC"), ds.getData(TC+"DESC"));
	  Reporter.log(ds.getData(TC+"DESC")+" description is displayed");
	  Assert.assertTrue(BaseAction.VerifyText(driver, "ESLPLNGRMSKU", ds.getData(TC+"SKU")));
	  Assert.assertTrue(BaseAction.VerifyText(driver, "ESLPLNGRMSIGN", ds.getData(TC+"SIGN")));
	  Assert.assertTrue(Reusable.IsDisplayed(driver, "ESLPRV"));
	  Assert.assertTrue(Reusable.IsDisplayed(driver, "ESLNXT"));
	  BaseAction.clickElement(driver, "ESLNXT", OR.getMessages("ESLNXT"));

	  count++;

		}
	if(count==po)
		flag=true;
	}
	catch(Exception e)
	{
		Log.error("[CLASS:Reusable]/[Method:IsESLPOS()]/Exception in IsESLPOS())"+e.getMessage());
		throw(e);
	
		
	}
	return flag;
	
}

}




	
	





	    	  







