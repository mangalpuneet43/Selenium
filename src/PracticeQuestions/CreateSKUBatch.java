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

public class CreateSKUBatch {
	

	TestDataReader ds;
	WebDriver driver;

	@BeforeMethod
	public void TC_Store_PRE() throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		  ds= new TestDataReader();		
		  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);	

	}
	
	@Test//(enabled=false)
	 public void TC_59411() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log("SKU Batch Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log("SKU Batch is displayed");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DHBBYLOGO"));
	 Reporter.log("BestBuy logo and SIGN SYSTEM header are displayed."); 
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 Reporter.log("BestBuy logo is clicked"); 
	 Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
	 Reporter.log(OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber")+" Home Page is displayed" );
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"DHBBYLOGO"));
	 Reporter.log("BestBuy Logo & SIGNSYSTEM header is displayed");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DLOGOUT",OR.getMessages("LOGOUT")));	 
	 Reporter.log(OR.getMessages("LOGOUT")+" link is displayed");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DFACTTAG",OR.getMessages("FACTTAG")));
	 Reporter.log(OR.getMessages("FACTTAG")+" link is displayed");
	 Reporter.log("Homepage is displayed"); 
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));	
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked.");	 
	 Assert.assertFalse(Reusable.IsDisplayed(driver, "SKUUPCMDL"));	
	 Assert.assertFalse(Reusable.IsDisplayed(driver, "DPKGQTY"));
	 Reporter.log(OR.getMessages("SKUUPCMDLTEXT")+" and "+OR.getMessages("PKGQTY")+" text field is not displayed.");
	 Assert.assertFalse(Reusable.IsDisplayed(driver, "SIGNIMG"));
	 Reporter.log("Sign Image is not displayed.");
	 Assert.assertFalse(Reusable.IsDisplayed(driver, "SKUADD"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+ "is not displayed");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DSELECT", OR.getMessages("SELECT")));
	 Reporter.log(OR.getMessages("SELECT")+ "button is disabled");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is disabled");	 
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is disabled");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is disabled");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "PLANOTAB"));
	 BaseAction.clickElement(driver, "PLANOTAB", OR.getMessages("PLANOGRAM"));
	 Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
	 Reporter.log(OR.getMessages("PLANOGRAM")+" Tab is available and enabled");
	 BaseAction.clickElement(driver, "SKUTAB", OR.getMessages("SKUTAB"));		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PEGIMG"));
	 Reporter.log(OR.getMessages("SKU_UPEGSHF3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UEXTOPT3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"EXTIMG"));
	 Reporter.log(OR.getMessages("SKU_UEXTOPT3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMUSMOV3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MMIMG"));
	 Reporter.log(OR.getMessages("SKU_UMUSMOV3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMASS3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MASSIMG"));
	 Reporter.log(OR.getMessages("SKU_UMASS3")+"Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(OR.getMessages("SKU_UPRCGRD3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLB"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGBIMG"));
	 Reporter.log(OR.getMessages("SKU_UMAGNOLB")+"Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLC"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGCIMG"));
	 Reporter.log(OR.getMessages("SKU_UMAGNOLC")+"Sign Image is displayed");
	 Assert.assertTrue(BaseAction.VerifyText(driver, "DPKGQTY", OR.getMessages("PKGQTY")));
	 Reporter.log(OR.getMessages("PKGQTY")+" text is displayed");
	 Assert.assertTrue(BaseAction.VerifyText(driver, "SKUUPCMDL", OR.getMessages("SKUUPCMDLTEXT")));
	 Reporter.log(OR.getMessages("SKUUPCMDLTEXT")+" text is displayed");	 
	 Assert.assertEquals(BaseAction.read_Value(driver, "DQTYINPUT"), "1");
	 Reporter.log(OR.getMessages("PKGQTY")+" text box is editable and defaulted to 1 when user select a Sign Type");	
	 
	  }
	
	@Test//(enabled=false)
	 public void TC_59412() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign Type is selected");	 	 
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59412IVSKU"));
	 Reporter.log(ds.getData("59412IVSKU")+" was enetered in the"+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" button is clicked");
	 BaseAction.waitFor();
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "ITEMMISSING" ,"ITEMMISSING1", "COK"));
	 BaseAction.waitFor();
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+"screen is displayed");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign Type is still selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59412VSKU"));	 
	 Reporter.log(ds.getData("59412VSKU")+" ID was enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59412QTY"));
	 Reporter.log(ds.getData("59412QTY")+" Quantity entered");
	 BaseAction.waitFor();
	 Assert.assertFalse(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DMODALOKs", "QTYMODAL1" ,"QTYMODAL2", "OKs"));	 
	 Reporter.log(OR.getMessages("QTYMODAL1")+" message is not displayed");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59412QTY1"));
	 Reporter.log(OR.getMessages("PKGQTY")+" entered was more than 20");
	 BaseAction.waitFor();
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DMODALOKs", "QTYMODAL1" ,"QTYMODAL2", "OKs"));
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59412QTY2"));
	 Reporter.log(OR.getMessages("PKGQTY")+" entered less than or equal to 8");	 
	 Assert.assertFalse(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DMODALOKs", "QTYMODAL1" ,"QTYMODAL2", "OKs"));
	 Reporter.log("No Error message is displayed");	 	 
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DBATCHSTATUS"), OR.getMessages("BATCHSTATUS"));
	 Reporter.log("Batch Status is displayed as "+OR.getMessages("BATCHSTATUS"));
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "EDITBATCH", " ");
	 Reusable.clearAll(driver,"EDITFIELD");
	 BaseAction.Enter_Text(driver, "EDITFIELD", ds.getData("EDITBATCH"));
	 Reporter.log("Batch name is edited");
	 Assert.assertTrue(Reusable.IsEnabled(driver,"EDITCANCEL", OR.getMessages("CANCEL")));
     Reporter.log(OR.getMessages("CANCEL")+" is displayed and enabled");
     Assert.assertTrue(Reusable.IsEnabled(driver,"EDITSAVE", OR.getMessages("SAVE")));
     Reporter.log(OR.getMessages("SAVE")+" is displayed and enabled");
	 BaseAction.clickElement(driver, "EDITCANCEL", OR.getMessages("CANCEL"));
	 Reporter.log(OR.getMessages("CANCEL")+ " Button is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DBATCHNM"), BatchName);
	 Reporter.log("Batch name was not changed");
	 BaseAction.clickElement(driver, "EDITBATCH", " ");
	 Reusable.clearAll(driver,"EDITFIELD");
	 BaseAction.Enter_Text(driver, "EDITFIELD", ds.getData("EDITBATCH"));
	 BaseAction.clickElement(driver, "EDITSAVE", OR.getMessages("SAVE"));
	 Reporter.log(OR.getMessages("SAVE")+ " Button is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DBATCHNM"),ds.getData("EDITBATCH"));
	 Reporter.log("Batch name was changed as"+ ds.getData("EDITBATCH"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59412VSKU2"));
	 BaseAction.Element(driver, "DPKGINPUT").sendKeys(Keys.ENTER);
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59412#ITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59412#ITEMS1")+" "+OR.getMessages("ITEMS"));	 
	 
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59412"),"6");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 Reusable.clearAll(driver,"DINNERQTY");
	 BaseAction.Enter_Text(driver, "DINNERQTY","0");
	 BaseAction.Element(driver, "DINNERQTY").sendKeys(Keys.ENTER);
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DMODALCANCEL", "DELMODAL1" ,"DELMODAL2", "CANCEL"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DINNERQTY" ),"1");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59412#ITEMS1")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("SKU is not deleted");
	 Reusable.clearAll(driver,"DINNERQTY");
	 BaseAction.Enter_Text(driver, "DINNERQTY","0");
	 BaseAction.Element(driver, "DINNERQTY").sendKeys(Keys.ENTER);
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "DELMODAL1" ,"DELMODAL2", "COK"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59412#ITEMS2")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("SKU is deleted");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Assert.assertTrue(Reusable.findBatch(driver, ds.getData("EDITBATCH")));
	 Reporter.log("Created Batch is available in Employee Batches");
	 
	 
	  }
	
	@Test//(enabled=false)
	 public void TC_59413() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59413SKUSTD"));	 
	 Reporter.log(ds.getData("VALIDSKU")+" SKU ID was enetered in the"+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59413QTY1"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");	
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59413QTY1"));
	 Reporter.log("SKU is added in the batch"); 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PEGIMG"));
	 Reporter.log(OR.getMessages("SKU_UPEGSHF3")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59413SKUPEG"));	 
	 Reporter.log(ds.getData("59413SKUPEG")+" SKU ID was enetered in the"+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59413QTY1")); 
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");	 
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59413QTY1"));
	 Reporter.log("SKU is added in the batch");
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UEXTOPT3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"EXTIMG"));
	 Reporter.log(OR.getMessages("SKU_UEXTOPT3")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59413SKUEXT"));	 
	 Reporter.log(ds.getData("59413SKUEXT")+" SKU ID was enetered in the SKU, UPC, or Model # text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59413QTY1")); 
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");	 
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59413QTY1"));
	 Reporter.log("SKU is added in the batch");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59413#ITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59413#ITEMS1")+" "+OR.getMessages("ITEMS"+" and is correct"));	 
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59413"),"9");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");		
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59413"),"9");
	 
	  }
	
	@Test//(enabled=false)
	 public void TC_59414() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Batch Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");	 	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59414VMULTISKU"));	 
	 Reporter.log(ds.getData("59414VMULTISKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59414QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59414QTY"));
	 Reporter.log(ds.getData("59414VMULTISKU")+" SKUs are added in the batch");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59414#ITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59414#ITEMS1")+" "+OR.getMessages("ITEMS"+" and is correct"));	 	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");	
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLB"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGBIMG"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59414IVMULTISKU"));	 
	 Reporter.log(ds.getData("59414IVMULTISKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59414QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");	
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59414#ITEMS2")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59414#ITEMS2")+" "+OR.getMessages("ITEMS"+" and is correct"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PEGIMG"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59414IVSKU"));	 
	 Reporter.log(ds.getData("59414IVSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59414QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");	
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "ITEMMISSING" ,"ITEMMISSING1", "COK"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59414#ITEMS2")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59414#ITEMS2")+" "+OR.getMessages("ITEMS"+" and is correct"));
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59414"),"15");
	 Reporter.log("Product information are verified inside the Employee Batch");	 
	 
	}
	@Test//(enabled=false)
	 public void TC_59415() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Batch Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");	 	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M1SKUs"));	 
	 Reporter.log(ds.getData("59415M1SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "MULTIITEMERROR" ,"MULTIITEM", "COK"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M2SKUs"));	 
	 Reporter.log(ds.getData("59415M2SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "MULTIITEMERROR" ,"MULTIITEM", "COK"));
     BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M3SKUs"));	 
	 Reporter.log(ds.getData("59415M3SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "MULTIITEMERROR" ,"MULTIITEM", "COK"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59415#ITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59415#ITEMS1")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59415_1"),"12");
     BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PEGIMG"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M1SKUs"));	 
	 Reporter.log(ds.getData("59415M1SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59415#ITEMS2")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59415#ITEMS2")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59415_2"),"24");
     BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M4SKUs"));	 
	 Reporter.log(ds.getData("59415M4SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "MULTIITEMERROR" ,"MULTIITEM", "COK"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M5SKUs"));	 
	 Reporter.log(ds.getData("59415M5SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "MULTIITEMERROR" ,"MULTIITEM", "COK"));
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59415#ITEMS3")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59415#ITEMS3")+" "+OR.getMessages("ITEMS"+" and is correct"));
     BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M6SKUs"));	 
	 Reporter.log(ds.getData("59415M5SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59415M7SKUs"));	 
	 Reporter.log(ds.getData("59415M5SKUs")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59415QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59415#ITEMS4")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59415#ITEMS4")+" "+OR.getMessages("ITEMS"+" and is correct"));
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59415_3"),"33");
	 Reporter.log("Product information are verified inside the Employee Batch");
	
	}
	
	@Test//(enabled=false)
	 public void TC_59416() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Batch Page is displayed");	 		  		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMUSMOV3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MMIMG"));
	 Reporter.log(OR.getMessages("SKU_UMUSMOV3")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59416UPCMM"));	 
	 Reporter.log(ds.getData("59416UPCMM")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59416QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59416QTY"));
	 Reporter.log("SKU is added in the batch");
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(ds.getData("SKU_UPRCGRD3")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59416UPCPRC"));	 
	 Reporter.log(ds.getData("59416UPCPRC")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59416QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59416QTY"));
	 Reporter.log("SKU is added in the batch");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59416#ITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59416#ITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));	 
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59416"),"6");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");				
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59416"),"6");
	 
	  }
	
	@Test//(enabled=false)
	 public void TC_59417() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLB"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGBIMG"));
	 Reporter.log(OR.getMessages("SKU_UMAGNOLB")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59417MDLMAGB"));	 
	 Reporter.log(ds.getData("59417MDLMAGB")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59417QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59417QTY"));
	 Reporter.log("SKU is added in the batch");
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLC"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGCIMG"));
	 Reporter.log(OR.getMessages("SKU_UMAGNOLC")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59417MDLMAGC"));	 
	 Reporter.log(ds.getData("59417MDLMAGC")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59417QTY"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59417QTY"));
	 Reporter.log("SKU is added in the batch");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59417#ITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59417#ITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));	 
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59417"),"6");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");	
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59417"),"6");
	 
	  }
	
	@Test//(enabled=false)
	 public void TC_59418() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PEGIMG"));
	 Reporter.log(OR.getMessages("SKU_UPEGSHF3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUPEG"));	 
	 Reporter.log(ds.getData("UNISKUPEG")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59418QTY1"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59418QTY1"));
	 Reporter.log("SKU is added in the batch");	
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMUSMOV3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MMIMG"));
	 Reporter.log(OR.getMessages("SKU_UMUSMOV3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUMM"));	 
	 Reporter.log(ds.getData("UNISKUMM")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59418QTY2"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59418QTY2"));
	 Reporter.log("SKU is added in the batch");	
	 
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMASS3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MASSIMG"));
	 Reporter.log(OR.getMessages("SKU_UMASS3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUMASS"));	 
	 Reporter.log(ds.getData("UNISKUMASS")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59418QTY3"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59418QTY3"));
	 Reporter.log("SKU is added in the batch");	
	 
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(ds.getData("SKU_UPRCGRD3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUPRC"));	 
	 Reporter.log(ds.getData("UNISKUPRC")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59418QTY4"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59418QTY4"));
	 Reporter.log("SKU is added in the batch");	
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLB"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGBIMG"));
	 Reporter.log(ds.getData("SKU_UMAGNOLB")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUMAGB"));	 
	 Reporter.log(ds.getData("UNISKUMAGB")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59418QTY5"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59418QTY5"));
	 Reporter.log("SKU is added in the batch");	
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLC"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGCIMG"));
	 Reporter.log(ds.getData("SKU_UMAGNOLC")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUMAGC"));	 
	 Reporter.log(ds.getData("UNISKUMAGC")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59418QTY6"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59418QTY6"));
	 Reporter.log("SKU is added in the batch");	
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59418#ITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59418#ITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));	 
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59418"),"18");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 //SIGNBATCH//
	 //SIGNITEM//
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59418"),"18");
	 
	  }
	
	@Test//(enabled=false)
	 public void TC_59419() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUSTD"));	 
	 Reporter.log(ds.getData("UNISKUSTD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY4"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "CARRIER1" ,"CARRIER2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUSTD"));
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY4"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "All", "DCOK","COK"),"U0U1U2U3");
	 Reporter.log(OR.getMessages("U0U1U2U3")+" carriers are selected");
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC9#ITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC9#ITEMS1")+" "+OR.getMessages("ITEMS"+" and is correct"));	
     
     BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UEXTOPT3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"EXTIMG"));
	 Reporter.log(OR.getMessages("SKU_UEXTOPT3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUEXT"));	 
	 Reporter.log(ds.getData("UNISKUEXT")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY4"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "CARRIER1" ,"CARRIER2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNISKUSTD"));
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY4"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "Verizon", "DCOK","COK"),"U1");
	 Reporter.log(OR.getMessages("U1")+" carrier is selected");
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC9#ITEMS2")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC9#ITEMS2")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC9SKUBATCH"),"15");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC9SKUBATCH"),"15");
	 }
	
	@Test//(enabled=false)
	 public void TC_59420() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNIUPCSTD"));	 
	 Reporter.log(ds.getData("UNIUPCSTD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY5"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "CARRIER1" ,"CARRIER2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNIUPCSTD"));
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY5"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "Sprint&Verizon", "DCOK","COK"),"U0U1");
	 Reporter.log(OR.getMessages("U0U1")+" carriers are selected");
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC10#ITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC10#ITEMS1")+" "+OR.getMessages("ITEMS"+" and is correct"));	
    
     BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UEXTOPT3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"EXTIMG"));
	 Reporter.log(OR.getMessages("SKU_UEXTOPT3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNIUPCEXT"));	 
	 Reporter.log(ds.getData("UNIUPCEXT")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY5"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "ATT&Verizon&HW", "DCOK","COK"),"U1U2U3");
	 Reporter.log(OR.getMessages("U2U1U3")+" carriers are selected"); 
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC10#ITEMS2")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC10#ITEMS2")+" "+OR.getMessages("ITEMS"+" and is correct"));
   
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC10SKUBATCH"),"15");
     Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 //SIGNBATCH//
	 //SIGNITEM//
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC10SKUBATCH"),"15");
	}
	 
	@Test//(enabled=false)
	 public void TC_59421() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNINSPRTSKU"));	 
	 Reporter.log(ds.getData("UNINSPRTSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY6"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "CARRIER1" ,"CARRIER2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("UNINSPRTSKU"));	 
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY6"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertNotEquals(Reusable.IsCarrierPresent(driver, "Sprint", "DCOK","COK"),"U0");
	 Reporter.log(OR.getMessages("U0")+" carrier is not setup for this universal"+ds.getData("UNINSPRTSKU"));
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "Verizon&ATT&HW", "DCOK","COK"),"U0U1U2");
	 Reporter.log(OR.getMessages("U2U1U3")+" carriers are selected"); 
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC11#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC11#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC11SKUBATCH"),"9");
     Reporter.log("Product information are verified");
     String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC11SKUBATCH"),"9");
	 Reporter.log("Batch is created and correct skus are addded in"+BatchName);
	 
	}	
	@Test//(enabled=false)
	 public void TC_59422() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PEGIMG"));
	 Reporter.log(OR.getMessages("SKU_UPEGSHF3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUPEG"));	 
	 Reporter.log(ds.getData("MOCKSKUPEG")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59422QTY1"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59422QTY1"));
	 Reporter.log("SKU is added in the batch");	
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMUSMOV3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MMIMG"));
	 Reporter.log(OR.getMessages("SKU_UMUSMOV3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUMM"));	 
	 Reporter.log(ds.getData("MOCKSKUMM")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59422QTY2"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59422QTY2"));
	 Reporter.log("SKU is added in the batch");	
	 
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMASS3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MASSIMG"));
	 Reporter.log(OR.getMessages("SKU_UMASS3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUMASS"));	 
	 Reporter.log(ds.getData("MOCKSKUMASS")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59422QTY3"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59422QTY3"));
	 Reporter.log("SKU is added in the batch");	
	 
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(ds.getData("SKU_UPRCGRD3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUPRC"));	 
	 Reporter.log(ds.getData("MOCKSKUPRC")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59422QTY4"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59422QTY4"));
	 Reporter.log("SKU is added in the batch");	
	 
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLB"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGBIMG"));
	 Reporter.log(ds.getData("SKU_UMAGNOLB")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUMAGB"));	 
	 Reporter.log(ds.getData("MOCKSKUMAGB")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59422QTY5"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59422QTY5"));
	 Reporter.log("SKU is added in the batch");	
	 
	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLC"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"MAGCIMG"));
	 Reporter.log(ds.getData("SKU_UMAGNOLC")+" is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUMAGC"));	 
	 Reporter.log(ds.getData("MOCKSKUMAGC")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59422QTY6"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");	
	 Assert.assertEquals(BaseAction.read_Value(driver, "DINNERQTY"),ds.getData("59422QTY6"));
	 Reporter.log("SKU is added in the batch");	
	 
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC12#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC12#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));	 
    
    
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC12SKUBATCH"),"18");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 //SIGNBATCH//
	 //SIGNITEM//
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC12SKUBATCH"),"18");
	 
	  }
	@Test//(enabled=false)
	 public void TC_59423() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 		 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"STDIMG"));
	 Reporter.log(OR.getMessages("SKU_USTDPRD3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUSTD"));	 
	 Reporter.log(ds.getData("MOCKSKUSTD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY8"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "CARRIER1" ,"CARRIER2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUSTD"));
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY8"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "All", "DCOK","COK"),"U0U1U2U3");
	 Reporter.log(OR.getMessages("U0U1U2U3")+" carriers are selected");
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC13#SKUITEMS1")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC13#SKUITEMS1")+" "+OR.getMessages("ITEMS"+" and is correct"));	
    
     BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UEXTOPT3"),"SKU_SIGN_TYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"EXTIMG"));
	 Reporter.log(OR.getMessages("SKU_UEXTOPT3")+"Sign is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUEXT"));	 
	 Reporter.log(ds.getData("MOCKSKUEXT")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY8"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "CARRIER1" ,"CARRIER2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("MOCKSKUEXT"));
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY8"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "ATT", "DCOK","COK"),"U2");
	 Reporter.log(OR.getMessages("U2")+" carrier is selected");
	 BaseAction.waitFor();
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC13#SKUITEMS2")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC13#SKUITEMS2")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC13SKUBATCH"),"15");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 //SIGNBATCH//
	 //SIGNITEM//
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC13SKUBATCH"),"15");
	 
}
	
	
	@Test//(enabled=false)
	 public void TC_59424() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(OR.getMessages("SKU_UPRCGRD3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("DRVSKUGRD"));	 
	 Reporter.log(ds.getData("DRVSKUGRD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY9"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertFalse(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "GRIDTEXT1" ,"GRIDTEXT2", "CANCEL"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC14#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC14#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC14SKUBATCH"),"3");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC14SKUBATCH"),"3");
	 Reporter.log("Product information are verified inside the Employee Batch");
	 
	 
	}
	@Test//(enabled=false)
	 public void TC_59425() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(OR.getMessages("SKU_UPRCGRD3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("NONDRVSKUGRD"));	 
	 Reporter.log(ds.getData("NONDRVSKUGRD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY9"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "GRIDTEXT1" ,"GRIDTEXT2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("NONDRVSKUGRD"));	
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY9"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "G0", "DCOK","COK"),"G0");
	 Reporter.log(ds.getData("G0")+"Pricing Grid is selected");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC15#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC15#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC15SKUBATCH"),"3");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC15SKUBATCH"),"3");
	 Reporter.log("Product information are verified inside the Employee Batch");
	 
	 
	}
		
	@Test//(enabled=false)
	 public void TC_59426() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(OR.getMessages("SKU_UPRCGRD3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("DRVMOCKSKUGRD"));	 
	 Reporter.log(ds.getData("DRVMOCKSKUGRD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY10"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertFalse(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "GRIDTEXT1" ,"GRIDTEXT2", "CANCEL"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC16#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC16#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC16SKUBATCH"),"3");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC16SKUBATCH"),"3");
	 Reporter.log("Product information are verified inside the Employee Batch");
	 
	 
	}
	@Test//(enabled=false)
	 public void TC_59427() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(OR.getMessages("SKU_UPRCGRD3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("NONDRVMOCKSKUGRD"));	 
	 Reporter.log(ds.getData("NONDRVMOCKSKUGRD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY9"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "GRIDTEXT1" ,"GRIDTEXT2", "CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("NONDRVMOCKSKUGRD"));	
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY9"));
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertEquals(Reusable.IsCarrierPresent(driver, "G0G1", "DCOK","COK"),"G0G1");
	 Reporter.log(ds.getData("G0G1")+"Pricing Grid is selected");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC17#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC17#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC17SKUBATCH"),"6");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC17SKUBATCH"),"6");
	 Reporter.log("Product information are verified inside the Employee Batch");
	 
	 
	}
	
	@Test//(enabled=false)
	 public void TC_59428() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"PRCIMG"));
	 Reporter.log(OR.getMessages("SKU_UPRCGRD3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("DRVUPCGRD"));	 
	 Reporter.log(ds.getData("DRVUPCGRD")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("QTY11"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Reporter.log(OR.getMessages("ADDBUTTON")+" is clicked");
	 Assert.assertFalse(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DCMODAL", "DMODALCANCEL", "GRIDTEXT1" ,"GRIDTEXT2", "CANCEL"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC18#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("TC18#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC18SKUBATCH"),"3");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
	 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
	 Reusable.findBatch(driver, BatchName);	 	 
	 Reporter.log("Batch is created and available");
	 BaseAction.waitFor();
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC18SKUBATCH"),"3");
	 Reporter.log("Product information are verified inside the Employee Batch");
	 
	 
	}
	
	@Test//(enabled=false)
	 public void TC_59429() throws  Exception {
	 Reusable.StorePage(driver);	
	 BaseAction.clickElement(driver,"DSKUBATCH",OR.getMessages("SKUBATCH"));		
	 Reporter.log(OR.getMessages("SKUBATCH")+" Link is clicked and enable.");
	 Assert.assertTrue(BaseAction.read_Text(driver, "SKUBATCH").contains(OR.getMessages("SKUBATCH")));
	 Reporter.log(OR.getMessages("SKUBATCH")+" Page is displayed");	 
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_USTDPRD3"),"SKU_SIGN_TYP");	 
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429STDSKU"));	 
	 Reporter.log(ds.getData("59429STDSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY1"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPEGSHF3"),"SKU_SIGN_TYP");	 
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429PEGSKU"));	 
	 Reporter.log(ds.getData("59429PEGSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY2"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UEXTOPT3"),"SKU_SIGN_TYP");	 
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429EXTSKU"));	 
	 Reporter.log(ds.getData("59429EXTSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY6"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMUSMOV3"),"SKU_SIGN_TYP");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429MMSKU"));	 
	 Reporter.log(ds.getData("59429MMSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY3"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMASS3"),"SKU_SIGN_TYP");	 
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429MASSSKU"));	 
	 Reporter.log(ds.getData("59429MASSSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY5"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UPRCGRD3"),"SKU_SIGN_TYP");	 
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429PRCSKU"));	 
	 Reporter.log(ds.getData("59429PRCSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY4"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLB"),"SKU_SIGN_TYP");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429MAGBSKU"));	 
	 Reporter.log(ds.getData("59429MAGBSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY7"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 BaseAction.Select_ComboBox(driver,"SKUDROP",OR.getMessages("SKU_UMAGNOLC"),"SKU_SIGN_TYP");
	 BaseAction.Enter_Text(driver, "DPKGINPUT",ds.getData("59429MAGCSKU"));	 
	 Reporter.log(ds.getData("59429MAGCSKU")+" SKU IDs were enetered in the "+OR.getMessages("SKUUPCMDLTEXT")+" text box");
	 Reusable.clearAll(driver,"DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT",ds.getData("59429QTY8"));
	 Reporter.log(OR.getMessages("QUANTITY")+" entered less than to 20");
	 BaseAction.clickElement(driver, "SKUADD", OR.getMessages("ADDBUTTON"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59429#SKUITEMS")+" "+OR.getMessages("ITEMS"));
     Reporter.log("# of Items in Batch is"+ds.getData("59429#SKUITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59429_1"),"24");
	 Reporter.log("Product information are verified");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" button is enabled");	 
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" button is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" button is enabled");
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log("All The SKUs are unselected");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 BaseAction.clickElement(driver, "DSELECT", OR.getMessages("SELECT"));
	// BaseAction.clickElement(driver, "DPREVIEW", OR.getMessages("PREVIEW"));
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Reusable.IsCheckBox(driver, "2");
	 BaseAction.clickElement(driver, "DDELETE", OR.getMessages("DELETE"));
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "DELMODAL1" ,"DELMODAL2", "COK"));
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59429_2"),"18");
	 Reporter.log("Two Pacakges are deleted.");	
	 
	}
	
		
	
	
	 
		
		 @AfterMethod
		 public void close()
			  {
			BaseAction.closeBrowser(driver);
			  }	  
}
