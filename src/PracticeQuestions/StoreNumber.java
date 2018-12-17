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

public class StoreNumber {
	
	
	TestDataReader ds;
	WebDriver driver;

	
	
	  @BeforeMethod
	  public void TC_Store_PRE() throws Exception
	  {
		  DOMConfigurator.configure("log4j.xml");
		  ds= new TestDataReader();		
		  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);	

	  }
	  
	
	  @Test
	  public void TC_59408() throws  Exception {
	
	  Reusable.LoginPage(driver);
	  Reporter.log("Store Number Page is displayed");
	  Assert.assertTrue(Reusable.IsDisplayed(driver,"DBBYLOGO"));
	  Reporter.log("'BestBuy' Logo & 'SIGN SYSTEM' header is displayed");
	  Assert.assertTrue(BaseAction.read_Text(driver, "DStoreNumber").contains(OR.getMessages("STORENUMBER")));
	  Reporter.log(OR.getMessages("STORENUMBER")+" text is displayed");
	  BaseAction.Enter_Text(driver, "DStoreInput", ds.getData("StoreNumber"));
	  Assert.assertEquals(BaseAction.read_Value(driver, "DStoreInput"), ds.getData("StoreNumber"));
	  Reporter.log("Store Number field is editable and displayed");
	  Reusable.Isclear(driver, "DStoreInput");	
	  Assert.assertFalse(Reusable.IsEnabled(driver, "DSetStore", OR.getMessages("SETSTORE"))); //Verify Set Store button enable
	  Reporter.log(OR.getMessages("SETSTORE") +" Button is displayed and InActive");
	  BaseAction.clickElement(driver, "DSetStore",OR.getMessages("SETSTORE"));
	  Reporter.log(OR.getMessages("SETSTORE") +"Button is not Clicked and InActive");
	  Assert.assertTrue(BaseAction.read_Text(driver, "DReqField").contains(OR.getMessages("REQFIELD")));//Required field text verification 
	  Reporter.log(OR.getMessages("REQFIELD") +" Message is displayed");
	  BaseAction.Enter_Text(driver, "DStoreInput", ds.getData("SPCLSYMBOL"));
	  Assert.assertTrue(Reusable.IsNumeric(driver, "DStoreInput"));//Checking value is numeric
	  Reporter.log("User cannot enter symbols and letters in the text box.");
	  
	  }
	  @Test(enabled=false)
	  public void TC_59409() throws  Exception {
		  
	  Reusable.LoginPage(driver);
	  BaseAction.Enter_Text(driver, "DStoreInput", ds.getData("IVStoreNumber"));
	  Reporter.log("Invalid Store Number is entered");
	  BaseAction.clickElement(driver, "DSetStore", OR.getMessages("SETSTORE"));
	  Reporter.log( OR.getMessages("SETSTORE")+" Button is Clicked");
	  Assert.assertTrue(BaseAction.read_Text(driver, "DInvalidStore").contains( OR.getMessages("INVALIDSTORE")));
	  Reporter.log(OR.getMessages("INVALIDSTORE")+" Message is displayed");
	  Reusable.clearAll(driver, "DStoreInput");	
	  Reporter.log(OR.getMessages("INVALIDSTORE") +"Number is cleared");
	  BaseAction.Enter_Text(driver, "DStoreInput", ds.getData("NONUSSTORE"));
	  Reporter.log("Invalid Store Number "+ds.getData("NONUSSTORE")+"is entered Starting With US Store Number");
	  BaseAction.clickElement(driver, "DSetStore",OR.getMessages("SETSTORE"));
	  Reporter.log(OR.getMessages("SETSTORE")+" Button is Clicked");
	  Assert.assertTrue(BaseAction.read_Text(driver, "DInvalidStore").contains(OR.getMessages("INVALIDSTORE")));
	  Reporter.log(OR.getMessages("INVALIDSTORE") +" Message is displayed");
	  
}

	  @Test(enabled=false)
	  public void TC_59410() throws  Exception {
		  
		 
		  Reusable.LoginPage(driver);//Login Successful
		  BaseAction.waitFor();
		  BaseAction.Enter_Text(driver, "DStoreInput", ds.getData("StoreNumber"));
		  Assert.assertEquals(BaseAction.read_Value(driver, "DStoreInput"), ds.getData("StoreNumber"));
		  Reporter.log(ds.getData("StoreNumber")+" Number is entered");
		  BaseAction.clickElement(driver, "DSetStore",OR.getMessages("SETSTORE"));
		  Reporter.log(OR.getMessages("SETSTORE")+" Button is Clicked");
		  Assert.assertTrue(Reusable.IsDisplayed(driver, "DHBBYLOGO"));//Home Page Logo verification
		  BaseAction.waitFor();
		  Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
		  Reporter.log(OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber")+" Home Page is displayed");
		 
			  
		  }
	
	 
	  
	  @AfterMethod
	  public void close()
	  {
		BaseAction.closeBrowser(driver);  
	  }
	 
	  
	
	

}
