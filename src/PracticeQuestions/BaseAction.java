package CommonUtility;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ReusableClass.Reusable;
 

public class BaseAction  {
	 public static WebDriver driver;
		public static void clickElement(WebDriver driver,String locatorName,String btnName)
		{
			 
		try
			{
			if(btnName.equalsIgnoreCase(" "))
			{
				WebElement element=driver.findElement(OR.getObject(locatorName));
				if(Exist(element))
				{
				Reusable.EleBound(driver, element);	
				element.click();
				Log.info("[CLASS:BaseAction]/[Method:clickElement()]/Clicked on element "+locatorName);
			
				}
			}
			
		else
		{
			List<WebElement> menuBtn= driver.findElements(OR.getObject(locatorName));
			for(int i=0;i<menuBtn.size();i++)
			{
				WebElement ele=menuBtn.get(i);
				
				if(ele.getText().contains(btnName))
				{
					Reusable.EleBound(driver, ele);	
					ele.click();
					Log.info("[CLASS:BaseAction]/[Method:clickElement()]/Clicked on element "+locatorName);
				    break;
				}
			
			
				
					
		}
		}
			}
			
			
			catch(Exception e)
		{
					
		  
			Log.error("[CLASS:BaseAction]/[Method:clickElement()]/Exception: in ClickElement()"+e.getMessage());
		
			
			}
			
		}
		
		public static List<WebElement> ElementList(WebDriver driver,String locatorName)
		{
			 List<WebElement> element=null;
		try
			{
				 element=driver.findElements(OR.getObject(locatorName));
				Log.info("[CLASS:BaseAction]/[Method:ElementList()]/Element: "+element);
			
				
			}
			
			
			catch(Exception e)
		{
					
		
			Log.error("[CLASS:BaseAction]/[Method:ElementList()]/Exception:" +e.getMessage());
		
			}
		
		return element;
			 
		}
		
		
		public static void Enter_Text(WebDriver driver,String locatorName, String data)
		{
			
			try
			{
				WebElement element=driver.findElement(OR.getObject(locatorName));
				if(Exist(element))
				{
				Reusable.EleBound(driver, element);		
				element.sendKeys(data);
				Log.info("[CLASS:BaseAction]/[Method:EnterText()]/"+data+" entered in "+element);
			
				}
			}
			
			
			catch(Exception e)
			{
		 
		Log.error("[CLASS:BaseAction]/[Method:EnterText()]/Exception:" +e.getMessage());
		
			}
		}
		
		public static WebElement Element(WebDriver driver,String locatorName)
		{
			  WebElement ele=null;
			  
			   try
			   {
				ele=driver.findElement(OR.getObject(locatorName));
				Reusable.EleBound(driver, ele);	
				Log.info("[CLASS:BaseAction]/[Method:Element()]/Element: "+ele);
		}
				catch(Exception e)
				{
			 
			Log.error("[CLASS:BaseAction]/[Method:Element()]/Exception:" +e.getMessage());
			
				}
				return ele;
			}
			
		
		
		public static String read_Text(WebDriver driver,String locatorName)
		{
			
			try
			{
				WebElement element=driver.findElement(OR.getObject(locatorName));
				if(Exist(element))
				{
					Reusable.EleBound(driver, element);	
					Log.info("[CLASS:BaseAction]/[Method:read_text()]"+locatorName+ ":" + element.getAttribute("innerHTML"));
					
				
					
				}	
				return element.getAttribute("innerHTML").trim();
					
		}
			catch(Exception e)
			{
		
			Log.error("[CLASS:BaseAction]/[Method:read_Text()]/Exception:" +e.getMessage());
		
			
			
			return " ";
			}
			
		}
			
			public static String read_Value(WebDriver driver,String locatorName)
			{
				
				try
				{
					WebElement element=driver.findElement(OR.getObject(locatorName));
					if(Exist(element))
					{
						Reusable.EleBound(driver, element);	
						Log.info("[CLASS:BaseAction]/[Method:read_Value()]"+locatorName+ ":" + element.getAttribute("value"));
						
					
					
					}	
					return element.getAttribute("value");
						
			}
				catch(Exception e)
				{
			
				Log.error("[CLASS:BaseAction]/[Method:read_Value()]/Exception:" +e.getMessage());
				
				
				return " ";
				}
			
		}
		
		
		
		public static boolean Select_ComboBox(WebDriver driver,String locatorName,String OptionValue,String Type) throws Exception
		{
			boolean IsSelected=false;
		
			try
			{
				driver.findElement(OR.getObject(locatorName)).click();
			    BaseAction.waitFor();
			  
			    List<WebElement> opt= driver.findElements(OR.getObject("DPKGSIGNOPTs"));
				List<WebElement> verifyOpt= driver.findElements(OR.getObject(Type));
				for(WebElement e: opt)
				{
				String inner=e.getAttribute("innerHTML");
				if(inner.contentEquals(OptionValue))
				{
				Reusable.EleBound(driver, e);		
				e.click();
				Log.info("[CLASS:BaseAction]/[Method:Select_ComboBox()]"+OptionValue+"is selected");
				IsSelected=true;
			
				for(WebElement e1:verifyOpt )
				{	String inner1=e1.getAttribute("innerHTML");
					if(inner1.contentEquals(OptionValue))
					{
						Reusable.EleBound(driver, e1);	
				
						break;
				    }
					
				}
				break;
				}
				}
				
			}
		
			catch(Exception e)
			{
		
		Log.error("[CLASS:BaseAction]/[Method:Select_ComboBox()]/Exception:" +e.getMessage());
		
		
			}
			return IsSelected;
		}
		
		
		
		
		public static boolean VerifyText(WebDriver driver,String locatorName,String ExpectedText)
		{
			boolean IsVerify=false;
			try
			{
				WebElement element=driver.findElement(OR.getObject(locatorName));
				if(Exist(element))
				{
					String eText=element.getText();
				System.out.println("Text is"+eText);
					if(eText.contains(ExpectedText))
						{
						    Reusable.EleBound(driver, element);	
							Log.info("[CLASS:BaseAction]/[Method:VerifyText()]"+ExpectedText+" is matched with Actual "+eText);
							IsVerify=true;
						
						
						}
					
					else
					{
						Log.info("[CLASS:BaseAction]/[Method:VerifyText()]"+ExpectedText+" is not matched with Actual "+eText);
						IsVerify=false;
					
		
				}
		
					}
				
				return IsVerify;
				
		
				
			}
			catch(Exception e)
			{
		 Log.error("[CLASS:BaseAction]/[Method:VerifyText()]/Exception:" +e.getMessage());
		
			
			return IsVerify;
			}
			
			
		}
		public static boolean Exist(WebElement element)
		{
			boolean status=false;
			try
			{
			if(element.isDisplayed())
			{
				Log.info("[CLASS:BaseAction]/[Method:Exist()]"+element+" is exist");
			   status=true;
			}
			
			else
			{ 	Log.info("[CLASS:BaseAction]/[Method:Exist()]"+element+" is not exist");
				status =false;
			}
			
			}
			catch(Exception e)
			{
				 Log.error("[CLASS:BaseAction]/[Method:Exist()]/Exception:" +e.getMessage());
				
				
			}
			
			return status;
		}
		
		public static WebDriver openBrowser(String browser,String URL)
		{
			try
			{
			
			if (browser.equals("firefox")) {
				driver = new FirefoxDriver();
				Log.info(browser+"Opened");
				
			} else if (browser.equals("IE")) {
				
				File IEDriver = new File(ConstantClass.DrvPath);
				System.setProperty("webdriver.ie.driver",IEDriver.getAbsolutePath());
				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				caps.setCapability("ignoreZoomSetting", true);
			    caps.setCapability("nativeEvents", false);
				driver = new InternetExplorerDriver(caps);
				Log.info("[CLASS:BaseAction]/[Method:openBrowser()]"+browser+"  Opened");
				
				driver.get(URL);
				Log.info("[CLASS:BaseAction]/[Method:openBrowser()]Navigate to" +URL);
               
				

			}
			else if (browser.equals("chrome")) {
				File ChromeDriver = new File(ConstantClass.Drv);
				System.setProperty("webdriver.chrome.driver",ChromeDriver.getAbsolutePath());

				driver = new ChromeDriver();
				Log.info(browser+"Opened");

				driver.get(URL);
				Log.info("Navigate to " +URL);

			   
				driver.manage().window().maximize();
				Log.info("Window maximized");
				
			}
		}
			
			
			catch(Throwable  e)
			{
				Log.error("[CLASS:BaseAction]/[Method:OpenBrowser()()]/Exception:" +e.getMessage());
				
			}
			return driver;

		}
		
		public static void waitFor() throws Exception{
			
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		}
		public static void waitUntil(WebDriver driver,String locatorName)
		{
			WebDriverWait wait = new WebDriverWait(driver, 5000);

			wait.until(ExpectedConditions.visibilityOf(BaseAction.Element(driver, locatorName)));
		}
		
		public static void closeBrowser(WebDriver driver)
		{
		
		try
			{
			driver.quit();
			Log.info("[CLASS:BaseAction]/[Method:closeBrowser()]/Browser Closed");
		
			}
			catch(Throwable  e)
			{
				Log.error("[CLASS:BaseAction]/[Method:closeBrowser()()]/Exception:" +e.getMessage());
				
			}
		}
		

}
