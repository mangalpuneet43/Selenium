package StoreUITestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonUtility.BaseAction;
import CommonUtility.ConstantClass;
import CommonUtility.OR;
import CommonUtility.TestDataReader;
import ReusableClass.Reusable;

public class Home {
	
TestDataReader ds;
WebDriver driver;

	
@BeforeMethod
public void TC_Store_PRE() throws Exception
{
	  DOMConfigurator.configure("log4j.xml");
	  ds= new TestDataReader();	
	  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);	

}
	
 //Home Page Validation
 @Test
 public void TC_59407() throws  Exception {

 Reusable.StorePage(driver);
 System.out.println(OR.getMessages("WELCOMESTORE"));
 System.out.println(OR.getObject("DSKUBATCH"));
 Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
 Reporter.log(OR.getMessages("WELCOMESTORE")+" "+ds.getData("StoreNumber")+" Home Page is displayed");
 Assert.assertTrue(Reusable.IsDisplayed(driver,"DHBBYLOGO"));
 Reporter.log("BestBuy Logo & SIGNSYSTEM header is displayed");
 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLOGOUT"));
 Reporter.log("Logout link is displayed");
 Assert.assertTrue(Reusable.IsDisplayed(driver, "DFACTTAG"));
 Reporter.log("FACT TAG ISSUE FORM link is displayed");
 BaseAction.clickElement(driver, "DFACTTAG", OR.getMessages("FACTTAG"));
 Assert.assertEquals(Reusable.WindowSwitch(driver),OR.getMessages("FACTATGFORM"));
 Reporter.log(OR.getMessages("FACTATGFORM")+ "is displayed and opened");
 Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
 Reporter.log(OR.getMessages("WELCOMESTORE")+" "+ds.getData("StoreNumber")+" Home Page is displayed");
// Assert.assertTrue(BaseAction.VerifyText(driver, "DCORPMSG","error There are 8 unprinted corporate batches. View Now."));
 Reporter.log("There are 11 unprinted corporate batches. Message is dispalyed");
 BaseAction.clickElement(driver, "DVIEWNOW",OR.getMessages("VIEWNOW"));
 Reporter.log(OR.getMessages("VIEWNOW")+" is clicked");
 Assert.assertEquals(BaseAction.read_Text(driver,"DCORPPAGE"),OR.getMessages("CORPPAGE"));
 Reporter.log(OR.getMessages("CORPPAGE")+" Page is displayed");
 BaseAction.clickElement(driver, "DHBBYLOGO","");
 Reporter.log("Home Page is displayed");
 Assert.assertEquals(BaseAction.read_Text(driver,"DVIEW"),OR.getMessages("VIEW"));
 Reporter.log(OR.getMessages("VIEW")+" Menu text is displayed");
 Assert.assertTrue(Reusable.IsEnabled(driver,"DCORP",OR.getMessages("CORPMENU")));
 Reporter.log(OR.getMessages("CORPMENU")+" is displayed and enabled");
 BaseAction.waitFor();
 Assert.assertTrue(Reusable.IsEnabled(driver,"DEMP",OR.getMessages("EMPMENU")));
 Reporter.log(OR.getMessages("EMPMENU")+" is displayed and enabled");
 Assert.assertEquals(BaseAction.read_Text(driver,"DCREATE"),OR.getMessages("CREATE"));
 Reporter.log(OR.getMessages("CREATE")+" Menu text is displayed");
 Assert.assertTrue(Reusable.IsEnabled(driver,"DSKUBATCH",OR.getMessages("SKUBATCH")));
 Reporter.log(OR.getMessages("SKUBATCH")+" is displayed and enabled");
 Assert.assertTrue(Reusable.IsEnabled(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM")));
 Reporter.log(OR.getMessages("BYPLANOGRAM")+" is displayed and enabled");
 Assert.assertTrue(Reusable.IsEnabled(driver,"DPKGBATCH",OR.getMessages("PKGBATCH")));
 Reporter.log(OR.getMessages("PKGBATCH")+" is displayed and enabled");
 Assert.assertTrue(Reusable.IsEnabled(driver,"DLBLMAKER",OR.getMessages("LABELMAKER")));
 Reporter.log(OR.getMessages("LABELMAKER")+" Batch is displayed and enabled");
 Reusable.IsWindowsHandle(driver, "Stay", "TC59407_1");
 Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
 Reporter.log(OR.getMessages("WELCOMESTORE")+" "+ds.getData("StoreNumber")+" Home Page is displayed");
 Reusable.IsWindowsHandle(driver, "Stay", "TC59407_2");

  
	  
 }
 
 


	  
	  
 @AfterMethod
 public void close()
	  {
		BaseAction.closeBrowser(driver);  
	  }	  

}
