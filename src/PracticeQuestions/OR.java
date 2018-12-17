package CommonUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class OR  {

	
public static Properties pro;
public static Properties prop;
	
	
	public static By getObject(String locatorName)
	
	{
		
		By locator = null;
		try {
			
			File src=new File(ConstantClass.ObjectFilePath);
			
			FileInputStream fis=new FileInputStream(src);
			 
			pro=new Properties(System.getProperties());
			 
            pro.load(fis);
            Log.info("[CLASS:OR]/[Method:getObject()]/Property file Loaded");
            
            String locatorProperty = pro.getProperty(locatorName);
            Log.info("[CLASS:OR]/[Method:getObject()]/Locator property is extracted  :"+locatorProperty);
    		String locatorType = locatorProperty.split(":")[0];
    	
    		Log.info("[CLASS:OR]/[Method:getObject()]/Locator type is extracted  :"+locatorType);
    	    String locatorValue = locatorProperty.split(":")[1];
    	
    		
    		switch(locatorType)
    		{
    		case "Id":
    			locator = By.id(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is "+By.id(locatorValue));
    			break;
    		case "Name":
    			locator = By.name(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is :"+locator);
    			break;
    		case "CssSelector":
    			locator = By.cssSelector(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is :"+locator);
    			break;
    		case "LinkText":
    			locator = By.linkText(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is :"+locator);
    			break;
    		case "PartialLinkText":
    			locator = By.partialLinkText(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is :"+locator);
    			break;
    		case "TagName":
    			locator = By.tagName(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is :"+locator);
    			break;
    		case "Xpath":
    			locator = By.xpath(locatorValue);
    			Log.info("[CLASS:OR]/[Method:getObject()]/Switch() Case/Locator value is :"+locator);
    			
    			break;
    		}
    		
      } 
		
		catch (IOException e) {
			
		
			
			Log.error("[CLASS:OR]/[Method:getObject()]Exception:"+e.getMessage());
			
			
		} 
		 
		return locator;
	}
public static String getMessages(String Resource)
	
	{
	String Message = "";
	try {
		
		File src=new File(ConstantClass.ResourceFilePath);
		
		FileInputStream fis=new FileInputStream(src);
		 
		prop=new Properties(System.getProperties());
		 
        prop.load(fis);
        Log.info("[CLASS:OR]/[Method:getMessages()]/Property file Loaded");
        
       Message= prop.getProperty(Resource);
        
	}
	catch (IOException e) {
		
		
		
		Log.error("[CLASS:OR]/[Method:getMessages()]/Exception:"+e.getMessage());
		
		
	} 
	return Message;
	}
}
