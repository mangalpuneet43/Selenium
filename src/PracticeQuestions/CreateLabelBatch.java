package StoreUITestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Keys;
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

public class CreateLabelBatch {
	
	TestDataReader ds;
	WebDriver driver;

		
	@BeforeMethod
	public void TC_Store_PRE() throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		  ds= new TestDataReader();		
		  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);	

	}
	@Test//(enabled=false)//Label Maker UI Validation
	 public void TC_59448() throws  Exception {
		
		 Reusable.StorePage(driver);	
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));		
		 Reporter.log(OR.getMessages("LABELMAKER")+" is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");	 	
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "DHBBYLOGO"));
		 Reporter.log("BestBuy logo and SIGN SYSTEM header are displayed."); 
		 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
		 Reporter.log("BestBuy logo is clicked");
		 Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
		 Reporter.log(OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber")+" Home Page is displayed" );
		 Assert.assertTrue(Reusable.IsDisplayed(driver,"DHBBYLOGO"));
		 Reporter.log("BestBuy Logo & SIGNSYSTEM header is displayed");
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLOGOUT"));	 
		 Reporter.log(OR.getMessages("LOGOUT")+" link is displayed");
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "DFACTTAG"));
		 Reporter.log(OR.getMessages("FACTTAG")+" is displayed");
		 Reporter.log("Homepage is displayed"); 
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));			
		 Reporter.log(OR.getMessages("LABELMAKER")+" Link is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "LBLIMG"));
		 Reporter.log(OR.getMessages("LABELMAKER")+" Sign image is displayed");
		 Assert.assertTrue(BaseAction.read_Text(driver, "TITLETXT").contains(OR.getMessages("TITLE")));
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "TITLEBOX"));
		 Reporter.log(OR.getMessages("TITLE")+" text box is available");
		 Assert.assertEquals(BaseAction.read_Value(driver, "TITLEBOX"),"");
		 Reporter.log("On default nothing is written in "+ OR.getMessages("TITLE"));
		 Assert.assertTrue(BaseAction.read_Text(driver, "TITLELIMIT").contains("47"));
		 Reporter.log("Character limit \"47\" is displayed below the" + OR.getMessages("TITLE")+ " text box");
		 Assert.assertTrue(BaseAction.read_Text(driver, "ARTISTTXT").contains(OR.getMessages("ARTIST")));
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "ARTISTBOX"));
		 Reporter.log(OR.getMessages("ARTIST")+ " text box is available");
		 Assert.assertEquals(BaseAction.read_Value(driver, "ARTISTBOX"),"");
		 Reporter.log("On default nothing is written in One / Title text box");
		 Assert.assertTrue(BaseAction.read_Text(driver, "ARTISTLIMIT").contains("24"));
		 Reporter.log("Character limit \"24\" is displayed below the "+ OR.getMessages("ARTIST"));
		 Assert.assertTrue(BaseAction.read_Text(driver, "SKUQTY").contains(OR.getMessages("QTY")));
		 Assert.assertTrue(Reusable.IsDisplayed(driver, "DQTYINPUT"));
		 Reporter.log(OR.getMessages("QTY")+" text box is displayed");
		 Assert.assertEquals(BaseAction.read_Value(driver, "DQTYINPUT"),"1");
         Reporter.log("On default the quantity in "+OR.getMessages("QTY")+" text box is 1");
         Assert.assertFalse(Reusable.IsEnabled(driver, "ADDLBLTOBATCH", OR.getMessages("ADDLBLBATCH")));
         Reporter.log(OR.getMessages("ADDLBLBATCH")+ " button is disabled");
         Assert.assertFalse(Reusable.IsEnabled(driver, "DSELECT", OR.getMessages("SELECT")));
   	     Reporter.log(OR.getMessages("SELECT")+ "button is disabled");
   	     Assert.assertFalse(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
   	     Reporter.log(OR.getMessages("PREVIEW")+" button is disabled");	 
   	     Assert.assertFalse(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
   	     Reporter.log(OR.getMessages("PRINT")+" button is disabled");
   	     Assert.assertFalse(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
   	     Reporter.log(OR.getMessages("DELETE")+" button is disabled");
     
	  }
	
	@Test//(enabled=false)//Label Maker Negative functionality validation
	 public void TC_59449() throws  Exception {
		
		 Reusable.StorePage(driver);	
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));		
		 Reporter.log(OR.getMessages("LABELMAKER")+" Link is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");	 
		 BaseAction.Enter_Text(driver, "TITLEBOX",ds.getData("LBLTITLE>47"));
		 Reporter.log("Title Name was enetered in "+OR.getMessages("TITLE")+" text box with more than 47 characters.");	
		 Assert.assertEquals(BaseAction.read_Value(driver, "TITLEBOX"), ds.getData("LBLTITLE>47"));
		 Reporter.log("Number of Title name characters count is displayed as entered in previous step.");	 
		 Assert.assertEquals(BaseAction.read_Text(driver, "TITLELIMIT"),Reusable.Length(driver, "Title",ds.getData("LBLTITLE>47")));
		 Reporter.log(OR.getMessages("TITLE")+" text box  has turned red and negative count gets displayed at character counts");
		 Assert.assertFalse(Reusable.IsEnabled(driver, "ADDLBLTOBATCH", OR.getMessages("ADDLBLBATCH")));
		 Reporter.log(OR.getMessages("ADDLBLBATCH")+" button was disabled");		 
		 BaseAction.Enter_Text(driver, "ARTISTBOX",ds.getData("LBLARTIST>24"));
		 Reporter.log(ds.getData("LBLARTIST>24")+" Name was enetered in "+ OR.getMessages("ARTIST")+" box with more than 24 characters.");
		 BaseAction.waitFor();
		 Assert.assertEquals(BaseAction.read_Value(driver, "ARTISTBOX"), ds.getData("LBLARTIST>24"));
		 Reporter.log("Number of Title name characters count is displayed as entered in previous step.");
		 Assert.assertEquals(BaseAction.read_Text(driver, "ARTISTLIMIT"),Reusable.Length(driver, "Artist",ds.getData("LBLARTIST>24")));
		 Reporter.log("Line Two / Artist  text box  has turned red and negative count gets displayed at character counts");
		 Assert.assertFalse(Reusable.IsEnabled(driver, "ADDLBLTOBATCH", OR.getMessages("ADDLBLBATCH")));
		 Reporter.log(OR.getMessages("ADDLBLBATCH")+" was disabled");
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("QTY>20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered more than to 20");
		 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DMODALOKs", "QTYMODAL1" ,"QTYMODAL2", "OKs"));
		 Reporter.log("Error message is displayed "+OR.getMessages("DPKGMODAL2"));
		 BaseAction.Enter_Text(driver, "TITLEBOX",ds.getData("LBLTITLE<=47"));
		 Reporter.log("Valid" +ds.getData("LBLTITLE<=47")+" Name in "+OR.getMessages("TITLE")+" text box was entered");
		 BaseAction.Enter_Text(driver, "ARTISTBOX",ds.getData("LBLARTIST<=24"));
		 Reporter.log("Valid"+ ds.getData("LBLARTIST<=24")+" Name in "+OR.getMessages("ARTIST")+" text box was entered");
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("QTY<=20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered less  than to 20");
		 BaseAction.clickElement(driver, "ADDLBLTOBATCH", "Add Label to Batch");
		 
		 Reusable.clearAll(driver,"DINNERQTY");
		 BaseAction.Enter_Text(driver, "DINNERQTY",ds.getData("TC59449#ITEMS2"));
		 Reporter.log("Quantity was changed to 0");
		 BaseAction.Element(driver, "DINNERQTY").sendKeys(Keys.ENTER);
		 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCANCEL", "DELMODAL1" ,"DELMODAL2", "CANCEL"));
		 Reporter.log("Pop-up message "+OR.getMessages("DELMODAL1")+ " is displayed");
		 Reporter.log(OR.getMessages("CANCEL")+ " button is clicked");
		 BaseAction.waitFor();
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC59449#ITEMS1")+" "+OR.getMessages("ITEMS"));
		 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("QTY<=20") );
		 Reporter.log(OR.getMessages("QUANTITY")+" is remain Same");
		 Reusable.clearAll(driver,"DINNERQTY");
		 BaseAction.Enter_Text(driver, "DINNERQTY",ds.getData("TC59449#ITEMS2"));
		 BaseAction.Element(driver, "DINNERQTY").sendKeys(Keys.ENTER);
		 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "DELMODAL1" ,"DELMODAL2", "COK"));
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC59449#ITEMS2")+" "+OR.getMessages("ITEMS"));
		 Reporter.log("CD Divider Label is deleted");
		 	
    
	  }
	
	@Test//(enabled=false)//Label Maker add title and verify print preview
	 public void TC_59450() throws  Exception {
		
		 Reusable.StorePage(driver);	
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));		
		 Reporter.log(OR.getMessages("LABELMAKER")+" Link is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");	 		 	
		 BaseAction.Enter_Text(driver, "TITLEBOX",ds.getData("59450TITLE1<=47"));
		 Reporter.log(ds.getData("59450TITLE1<=47")+" Name was enetered in "+OR.getMessages("TITLE")+" text box");	
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59450QTY1<=20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
		 BaseAction.clickElement(driver, "ADDLBLTOBATCH", "Add Label to Batch");
		 Reporter.log("Label Information is displayed in Label Batch");
		// Reusable.IsWindowsHandle(driver,OR.getMessages("PREVIEW"),"TC59450");
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59450");
		 Reporter.log("Manual Paper Popup is displayed and Label Was Printed Correctly");
		 BaseAction.waitFor();
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59450");
		 Assert.assertEquals(BaseAction.read_Text(driver, "ICON"),OR.getMessages("PRINTED"));
		 BaseAction.Enter_Text(driver, "TITLEBOX",ds.getData("59450TITLE2<=47"));
		 Reporter.log(ds.getData("59450TITLE<=47")+" Name was enetered in "+OR.getMessages("TITLE")+" text box");	
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59450QTY2<=20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
		 BaseAction.clickElement(driver, "ADDLBLTOBATCH", "Add Label to Batch");
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59450#ITEMS")+" "+OR.getMessages("ITEMS"));
		 Reporter.log("Label Information is displayed in Label Batch");
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59450");
		 Reporter.log("Manual Paper Popup is displayed and Label Was Printed Correctly");
		 Assert.assertEquals(BaseAction.read_Text(driver, "ICON"),OR.getMessages("PRINTED"));
		 Assert.assertEquals(""+Reusable.labelInfo(driver, "TC59450"),"6");
		 Reporter.log("Printed Icon is displayed for the Label Batch");
		 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
		 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
		 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
		 Reusable.findBatch(driver, BatchName);	 	 
		 Reporter.log("Batch is created and available");
		 BaseAction.waitFor();
		 Assert.assertEquals(""+Reusable.labelInfo(driver, "TC59450"),"6");
		 Reporter.log("Label information are verified inside the Employee Batch");
        
		 
	}
	@Test//(enabled=false)//Label Add Artist and verify print preview
	 public void TC_59451() throws  Exception {
		
		 Reusable.StorePage(driver);	
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));		
		 Reporter.log(OR.getMessages("LABELMAKER")+" Link is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");	 		 	
		 BaseAction.Enter_Text(driver, "ARTISTBOX",ds.getData("59451ARTIST1<=24"));
		 Reporter.log("Valid"+ ds.getData("59451ARTIST1<=24")+" Name in "+OR.getMessages("ARTIST") +" text box was entered");
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59451QTY1<=20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
		 BaseAction.clickElement(driver, "ADDLBLTOBATCH", "Add Label to Batch");
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59451");
		 Reporter.log("Preview is displayed");
		 BaseAction.waitFor();
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59451");
		 Reporter.log("Manual Paper Popup is displayed and Label Was Printed Correctly");
		 Assert.assertEquals(BaseAction.read_Text(driver, "ICON"),OR.getMessages("PRINTED"));
		 Reporter.log("Printed Icon is displayed for the Label Batch");
		 BaseAction.Enter_Text(driver, "ARTISTBOX",ds.getData("59451ARTIST2<=24"));
		 Reporter.log("Valid"+ ds.getData("59451ARTIST2<=24")+" Name in "+OR.getMessages("ARTIST") +" text box was entered");
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59451QTY2<=20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
		 BaseAction.clickElement(driver, "ADDLBLTOBATCH", "Add Label to Batch");
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59451");
		 Reporter.log("Preview is displayed");
		 BaseAction.waitFor();
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59451");
		 Reporter.log("Manual Paper Popup is displayed and Label Was Printed Correctly");
		 Assert.assertEquals(BaseAction.read_Text(driver, "ICON"),OR.getMessages("PRINTED"));
		 Reporter.log("Printed Icon is displayed for the Label Batch");
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59451#ITEMS")+" "+OR.getMessages("ITEMS"));
		 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
		 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
		 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
		 Reusable.findBatch(driver, BatchName);	 	 
		 Reporter.log("Batch is created and available");
		 BaseAction.waitFor();
		 Assert.assertEquals(""+Reusable.labelInfo(driver, "TC59451"),"6");
		 Reporter.log("Label information are verified inside the Employee Batch");
        
         
		 
	}
	//Add Artist and Title and delete
	@Test//(enabled=false)
	 public void TC_59452() throws  Exception {
		
		 Reusable.StorePage(driver);	
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));		
		 Reporter.log(OR.getMessages("LABELMAKER")+" Link is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");	 		 	
		 BaseAction.Enter_Text(driver, "TITLEBOX",ds.getData("59452TITLE<=47"));
		 Reporter.log("Valid"+ ds.getData("59452TITLE<=47")+" Name in "+OR.getMessages("TITLE")+" text box was entered");
		 BaseAction.waitFor();
		 System.out.println(ds.getData("59452ARTIST<=24"));
		 BaseAction.Enter_Text(driver, "ARTISTBOX",ds.getData("59452ARTIST<=24"));
		 Reporter.log("Valid"+ ds.getData("59452ARTIST<=24")+" Name in "+OR.getMessages("ARTIST") +" text box was entered");
		 Reusable.clearAll(driver, "DQTYINPUT");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59452QTY<=20"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
		 BaseAction.clickElement(driver, "ADDLBLTOBATCH", "Add Label to Batch");
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59452");
		 Reporter.log("Preview is displayed");
		 BaseAction.waitFor();
		 Reusable.IsWindowsHandle(driver,OR.getMessages("PRINT"),"TC59452");
		 Reporter.log("Manual Paper Popup is displayed and Label Was Printed Correctly");
		 Assert.assertEquals(BaseAction.read_Text(driver, "ICON"),OR.getMessages("PRINTED"));
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59452#ITEMS1")+" "+OR.getMessages("ITEMS"));
		 Reporter.log("Label is created");
		 Assert.assertEquals(""+Reusable.labelInfo(driver, "TC59452"),"3");
		 Reporter.log("Label Information is displayed in Label Batch");
		 Reporter.log("Printed Icon is displayed for the Label Batch");
		 BaseAction.clickElement(driver, "DDELETE", OR.getMessages("DELETE"));
		 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCANCEL", "DELMODAL1" ,"DELMODAL2", "CANCEL"));
		 Reporter.log("Pop-up message "+OR.getMessages("DELMODAL1")+ " is displayed");
		 Reporter.log(OR.getMessages("CANCEL")+ " button is clicked");
		 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("QTY<=20") );
		 Reporter.log("Quantity remains "+ ds.getData("QTY<=20"));
		 Reusable.clearAll(driver,"DINNERQTY");
		 BaseAction.Enter_Text(driver, "DINNERQTY",ds.getData("59452#ITEMS2"));
		 Reporter.log("Quantity was changed to 0");
		 BaseAction.Element(driver, "DINNERQTY").sendKeys(Keys.ENTER);
		 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "DELMODAL1" ,"DELMODAL2", "COK"));
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59452#ITEMS2")+" "+OR.getMessages("ITEMS"));
		 Reporter.log("CD Divider Label is deleted");
		 	
   
	  }
	//Artist and Title not added in batch when limit exceeds
	@Test//(enabled=false)
	 public void TC_59453() throws  Exception {
		
		 Reusable.StorePage(driver);	
		 BaseAction.clickElement(driver,"DLBLMAKER",OR.getMessages("LABELMAKER"));		
		 Reporter.log(OR.getMessages("LABELMAKER")+" Link is clicked and enable.");
		 Assert.assertTrue(BaseAction.read_Text(driver, "LABLMKRTXT").contains(OR.getMessages("LABELMAKER")));
		 Reporter.log(OR.getMessages("LABELMAKER")+" page is displayed");	 
		 BaseAction.Enter_Text(driver, "TITLEBOX",ds.getData("59453TITLE>47"));
		 Reporter.log("Title Name was enetered in "+OR.getMessages("TITLE")+" text box with more than 47 characters.");	
		 Assert.assertEquals(BaseAction.read_Value(driver, "TITLEBOX"), ds.getData("59453TITLE>47"));
		 Reporter.log("Number of Title name characters count is displayed as entered in previous step.");	
		 BaseAction.Element(driver, "TITLEBOX").sendKeys(Keys.ENTER);
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59453#ITEMS")+" "+OR.getMessages("ITEMS"));
		 Reporter.log(ds.getData("59453TITLE>47")+"is not added in Batch.");
		 Assert.assertFalse(Reusable.IsEnabled(driver, "ADDLBLTOBATCH", OR.getMessages("ADDLBLBATCH")));
		 Reporter.log(OR.getMessages("ADDLBLBATCH")+" button was disabled");
		 Reusable.clearAll(driver,"TITLEBOX");
		 BaseAction.Enter_Text(driver, "ARTISTBOX",ds.getData("59453ARTIST>24"));
		 Reporter.log(ds.getData("59453ARTIST>24")+" Name was enetered in "+ OR.getMessages("ARTIST")+" box with more than 24 characters.");
		 BaseAction.waitFor();
		 Assert.assertEquals(BaseAction.read_Value(driver, "ARTISTBOX"), ds.getData("59453ARTIST>24"));
		 Reporter.log("Number of Title name characters count is displayed as entered in previous step.");
		 BaseAction.Element(driver, "TITLEBOX").sendKeys(Keys.ENTER);
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59453#ITEMS")+" "+OR.getMessages("ITEMS"));
		 Reporter.log(ds.getData("59453ARTIST>24")+"is not added in Batch.");
		 Assert.assertFalse(Reusable.IsEnabled(driver, "ADDLBLTOBATCH", OR.getMessages("ADDLBLBATCH")));
		 Reporter.log(OR.getMessages("ADDLBLBATCH")+" was disabled");
		 Reusable.clearAll(driver,"ARTISTBOX");
		 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59453QTY"));
		 Reporter.log(OR.getMessages("QUANTITY")+" entered Zero");
		 BaseAction.Element(driver, "DQTYINPUT").sendKeys(Keys.ENTER);
		 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59453#ITEMS")+" "+OR.getMessages("ITEMS"));
		 Reporter.log(ds.getData("59453#ITEMS1")+"is not added in Batch.");
		
		 
		
   
	  }
	
			
				
		
	 @AfterMethod
	 public void close()
		  {
			BaseAction.closeBrowser(driver);  
		  }	  

			

}
