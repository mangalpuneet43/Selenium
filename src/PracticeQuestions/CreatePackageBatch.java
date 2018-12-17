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

public class CreatePackageBatch  {
	
	public static TestDataReader ds;
	public static WebDriver driver;

	@BeforeMethod
	public void TC_Store_PRE() throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		  ds= new TestDataReader();		
		  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);	

	}
	//Package Batch UI validation.
	@Test//(enabled=false)
	 public void TC_59430() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 Assert.assertTrue(Reusable.IsDisplayed(driver,"DHBBYLOGO"));
	 Reporter.log("BestBuy Logo & SIGNSYSTEM header is displayed");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DHomePage"),OR.getMessages("WELCOMESTORE")+""+ds.getData("StoreNumber"));
	 Reporter.log(OR.getMessages("WELCOMESTORE")+" "+ds.getData("StoreNumber")+" Home Page is displayed");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertFalse(BaseAction.VerifyText(driver, "DPKGQTY", OR.getMessages("PKGQTY")));
	 Reporter.log(OR.getMessages("PKGQTY")+" text is not displayed");
	 Assert.assertFalse(BaseAction.VerifyText(driver, "DPKGID", OR.getMessages("PKGID")));
	 Reporter.log(OR.getMessages("PKGID")+" text is not displayed");
	 Assert.assertFalse(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log("Package Sign Images is not displayed");
	 Assert.assertFalse(Reusable.IsDisplayed(driver, "DENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is not displayed");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DSELECT", OR.getMessages("SELECT")));
	 Reporter.log(OR.getMessages("SELECT")+" is disabled");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" is disabled");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" is disabled");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" is disabled");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DLIBPAGE"),OR.getMessages("LIBTAB"));
	 Reporter.log(OR.getMessages("LIBTAB")+" Page is displayed and enabled");
	 BaseAction.clickElement(driver, "DPKGTAB", OR.getMessages("PKGTAB"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLBUNDLEIMG"));
	 Reporter.log(OR.getMessages("ULBUND3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UNONPRC3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DNONPRC3IMG"));
	 Reporter.log(OR.getMessages("UNONPRC3")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("UMAGNOLIA")+" Sign Image is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("ULMAGNOLIA")+" Sign Image is displayed");
	 Assert.assertTrue(BaseAction.VerifyText(driver, "DPKGQTY", OR.getMessages("PKGQTY")));
	 Reporter.log(OR.getMessages("PKGQTY")+" text is displayed");
	 Assert.assertTrue(BaseAction.VerifyText(driver, "DPKGID", OR.getMessages("PKGID")));
	 Reporter.log(OR.getMessages("PKGID")+" text is displayed");
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59430DEFQTY"));
	 Reporter.log("Default Quantity is displayed"+ds.getData("59430DEFQTY"));
	

	 
	 
	 }
	//create batch add invalid packages
	@Test//(enabled=false)
	 public void TC_59431() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59431INVPKG1"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59431INVPKG1"));
	 Reporter.log(ds.getData("59431INVPKG1")+" is entered");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.waitFor();
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "ITEMMISSING" ,"ITEMMISSING1", "COK"));
//
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Image is still selected");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLMAGNOLIAIMG"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59431INVPKG2"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59431INVPKG2"));
	 Reporter.log(ds.getData("59431INVPKG21")+" is entered");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.waitFor();
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DCOK", "ITEMMISSING" ,"ITEMMISSING1", "COK"));
//
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("ULMAGNOLIA")+" Sign Image is still selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59431VPKG"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59431VPKG"));
	 Reporter.log("Valid Package ID- "+ds.getData("59431VPKG")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59431PKGQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59431PKGQTY"));
	 Reporter.log(ds.getData("59431PKGQTY")+" is entered in Quantity box.");
	 Assert.assertNotEquals(BaseAction.read_Text(driver, "DPKGMODAL1"),OR.getMessages("QTYMODAL1") );
	 Reporter.log(OR.getMessages("QTYMODAL1")+" Message is not displayed");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59431MAXQTY"));
	 BaseAction.waitFor();
	 Assert.assertTrue(Reusable.IsModalPresent(driver, "DPKGMODAL1", "DPKGMODAL2", "DMODALOKs", "QTYMODAL1","QTYMODAL2","OKs"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59431DEFQTY"));
	 Reporter.log("Default Quantity is displayed"+ds.getData("59431DEFQTY"));
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 Assert.assertEquals(BaseAction.read_Value(driver,"DINNERQTY" ),"1");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DBATCHSTATUS"), OR.getMessages("BATCHSTATUS"));
	 Reporter.log("Batch Status is displayed as "+OR.getMessages("BATCHSTATUS"));
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver, "TC59431"),"3");
	 Reporter.log(ds.getData("TC59431")+" is added in Batch");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 BaseAction.clickElement(driver,"EDITBATCH", "");
	 Reporter.log("Edit Batch icon is clicked");
	 Reusable.clearAll(driver, "EDITFIELD");
	 BaseAction.Enter_Text(driver, "EDITFIELD", ds.getData("BATCHNAME"));
	 Assert.assertTrue(Reusable.IsEnabled(driver,"EDITCANCEL", OR.getMessages("CANCEL")));
	 Reporter.log(OR.getMessages("CANCEL")+" is displayed and enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver,"EDITSAVE", OR.getMessages("SAVE")));
	 Reporter.log(OR.getMessages("SAVE")+" is displayed and enabled");
	 BaseAction.clickElement(driver,"EDITSAVE", OR.getMessages("SAVE"));
	 Reporter.log(OR.getMessages("SAVE")+" is Clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DBATCHNM"),ds.getData("BATCHNAME"));
	 Reporter.log(ds.getData("BATCHNAME")+"is Saved");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59431#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59431#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" is enbaled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" is enabled");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, ds.getData("BATCHNAME")));
	 Reporter.log("Created Batch is available in Employee Batches");
	}
	//Create Package Batch Add Package
	@Test//(enabled=false)
	 public void TC_59432() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59432SBPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59432SBPKGID"));
	 Reporter.log(ds.getData("59432SBPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59432SQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59432SQTY"));
	 Reporter.log(ds.getData("59432SQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLBUNDLEIMG"));
	 Reporter.log(OR.getMessages("ULBUND3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59432LBPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59432LBPKGID"));
	 Reporter.log(ds.getData("59432LBPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59432LQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59432LQTY"));
	 Reporter.log(ds.getData("59432LQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UNONPRC3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DNONPRC3IMG"));
	 Reporter.log(OR.getMessages("UNONPRC3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59432NPPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59432NPPKGID"));
	 Reporter.log(ds.getData("59432NPPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59432NPQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59432NPQTY"));
	 Reporter.log(ds.getData("59432NPQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("UMAGNOLIA")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59432MGPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59432MGPKGID"));
	 Reporter.log(ds.getData("59432MGPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59432MGQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59432MGQTY"));
	 Reporter.log(ds.getData("59432MGQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("ULMAGNOLIA")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59432LMGPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59432LMGPKGID"));
	 Reporter.log(ds.getData("59432LMPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59432LMGQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59432LMGQTY"));
	 Reporter.log(ds.getData("59432LMGQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59432#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59432#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" is enbaled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" is enabled");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59432"),"15");
	 Reporter.log("Pacakge Batch is opened");
	 Reporter.log("Correct Pacakge Signs are added in Batch");
	 
	
	}
	//Package Library Validation
	@Test//(enabled=false)
	 public void TC_59433() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DDEPT"),OR.getMessages("LIBDEPT"));
	 Reporter.log(OR.getMessages("LIBDEPT")+" text is displayed");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DLIBSIGN"),OR.getMessages("LIBSIGN"));
	 Reporter.log(OR.getMessages("LIBDEPT")+" text is displayed");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), "--");
	 Reporter.log("Nothing Is selected in Department dropdown");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("UNONPRC"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("UNONPRC"));
	 Reporter.log(OR.getMessages("UNONPRC")+" is available in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("OTHER"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("OTHER"));
	 Reporter.log(OR.getMessages("OTHER")+" is available in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", "--", "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UBUND3"));
	 Reporter.log("By Default "+OR.getMessages("UBUND3")+" is selected");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UBUND3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UBUND3"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Type is available in Sign Type Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("ULBUND3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("ULBUND3"));
	 Reporter.log(OR.getMessages("ULBUND3")+" Sign Type is available in Sign Type Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UNONPRC3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UNONPRC3"));
	 Reporter.log(OR.getMessages("UNONPRC3")+" Sign Type is available in Sign Type Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UMAGNOLIA"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UMAGNOLIA"));
	 Reporter.log(OR.getMessages("UMAGNOLIA")+" Sign Type is available in Sign Type Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("ULMAGNOLIA"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("ULMAGNOLIA"));
	 Reporter.log(OR.getMessages("ULMAGNOLIA")+" Sign Type is available in Sign Type Dropdown");
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DVIEWPKG", OR.getMessages("VIEWPKG")));
	 Reporter.log(OR.getMessages("VIEWPKG")+" is disabled");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), "0"+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+"0"+" "+OR.getMessages("ITEMS"));
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DADD", OR.getMessages("ADD")));
	 Reporter.log(OR.getMessages("ADD")+" is disabled");
		 
	 
	}
	//Add Non Priced Packages from PKG Library.
	@Test//(enabled=false)
	 public void TC_59434() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("UNONPRC"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("UNONPRC"));
	 Reporter.log(OR.getMessages("UNONPRC")+" is selected");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UNONPRC3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UNONPRC3"));
	 Reporter.log(OR.getMessages("UNONPRC3")+" Sign Type is selected");
	 BaseAction.clickElement(driver, "DVIEWPKG", OR.getMessages("VIEWPKG"));
	 Assert.assertTrue(Reusable.IsEnabled(driver, "SELECTBTN", OR.getMessages("SELECT")));
	 Reporter.log(OR.getMessages("SELECT")+" is enabled");
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 Reporter.log("All Pacakges are selected");
	 BaseAction.clickElement(driver, "UNSELECTBTN", OR.getMessages("UNSELECT"));
	 Reporter.log("All Pacakges are unselected");
	 Reusable.IsCheckBox(driver, "2");
	 Reporter.log("Pacakge is selected from the available list of Packages");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 BaseAction.waitUntil(driver, "DPKGPAGE");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59434")),"6");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
		 
	 }
	
	//Add Standard Sideliner Packages from PKG Library.
	@Test//(enabled=false)
	 public void TC_59435() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("OTHER"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("OTHER"));
	 Reporter.log(OR.getMessages("OTHER")+" is selected in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UBUND3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UBUND3"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Type is selected in Sign Type Dropdown");
	 BaseAction.clickElement(driver, "DVIEWPKG", OR.getMessages("VIEWPKG"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59435LIB")),"18");
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 Reporter.log("All Pacakges are selected");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 BaseAction.waitUntil(driver, "DPKGPAGE");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59435#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59435#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59435BATCH")),"18");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct inside the Employee Batch");
	 
	 
	}
	//Add Mass Display Packages from PKG Library.
	@Test//(enabled=false)
	 public void TC_59436() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("OTHER"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("OTHER"));
	 Reporter.log(OR.getMessages("OTHER")+" is selected in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("ULBUND3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("ULBUND3"));
	 Reporter.log(OR.getMessages("ULBUND3")+" Sign Type is selected in Sign Type Dropdown");
	 BaseAction.clickElement(driver, "DVIEWPKG", OR.getMessages("VIEWPKG"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59436LIB")),"18");
	 Reusable.IsCheckBox(driver, "Even");
	 Reporter.log("Even Position Pacakges are selected");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 BaseAction.waitUntil(driver, "DPKGPAGE");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59436#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59436#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59436BATCH")),"9");
	 BaseAction.waitFor();
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
	 
	 
	}
	//Add Magnolia Bundle Tag Packages from PKG Library.
	@Test//(enabled=false)
	 public void TC_59437() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("OTHER"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("OTHER"));
	 Reporter.log(OR.getMessages("OTHER")+" is selected in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UMAGNOLIA"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UMAGNOLIA"));
	 Reporter.log(OR.getMessages("UMAGNOLIA")+" Sign Type is selected in Sign Type Dropdown");
	 BaseAction.clickElement(driver, "DVIEWPKG", OR.getMessages("VIEWPKG"));
	 Reusable.IsCheckBox(driver, "Odd");
	 BaseAction.clickElement(driver, "DPKGTAB", OR.getMessages("PKGTAB"));
	 BaseAction.waitUntil(driver, "DPKGPAGE");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59437LIB")),"18");
	 Reporter.log("Odd Position Pacakges are selected");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 BaseAction.waitUntil(driver, "DPKGPAGE");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59437#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59437#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59437BATCH")),"9");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 
	 
	}
	
	//Add Magnolia 8x11 Bundle Packages from PKG Library.
	@Test//(enabled=false)
	 public void TC_59438() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("OTHER"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("OTHER"));
	 Reporter.log(OR.getMessages("OTHER")+" is selected in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("ULMAGNOLIA"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("ULMAGNOLIA"));
	 Reporter.log(OR.getMessages("ULMAGNOLIA")+" Sign Type is selected in Sign Type Dropdown");
	 BaseAction.clickElement(driver, "DVIEWPKG", OR.getMessages("VIEWPKG"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59438LIB")),"18");
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 Reporter.log("All Pacakges are selected");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 BaseAction.waitUntil(driver, "DPKGPAGE");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59438#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59438#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"59438BATCH")),"18");
	 BaseAction.waitFor();
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
	 
	 
	}
	//Package Batch Print Preview Delete
	@Test//(enabled=false)
	 public void TC_59439() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59439SBPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59439SBPKGID"));
	 Reporter.log(ds.getData("59439SBPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59439SQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59439SQTY"));
	 Reporter.log(ds.getData("59432SQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.waitUntil(driver, "DBATCHNM");
	 Reusable.IsWindowsHandle(driver, "Preview", "TC59439SB");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLBUNDLEIMG"));
	 Reporter.log(OR.getMessages("ULBUND3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59439LBPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59439LBPKGID"));
	 Reporter.log(ds.getData("59439LBPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59439LQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59439LQTY"));
	 Reporter.log(ds.getData("59439LQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Reusable.IsCheckBox(driver, "1");
	 Reusable.IsWindowsHandle(driver, "Preview", "TC59439LB");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UNONPRC3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DNONPRC3IMG"));
	 Reporter.log(OR.getMessages("UNONPRC3")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59439NPPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59439NPPKGID"));
	 Reporter.log(ds.getData("59439NPPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59439NPQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59439NPQTY"));
	 Reporter.log(ds.getData("59439NPQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Reusable.IsCheckBox(driver, "1");
	 Reusable.IsWindowsHandle(driver, "Preview", "TC59439NP");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("UMAGNOLIA")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59439MGPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59439MGPKGID"));
	 Reporter.log(ds.getData("59439MGPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59439MGQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59439MGQTY"));
	 Reporter.log(ds.getData("59439MGQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Reusable.IsCheckBox(driver, "1");
	 Reusable.IsWindowsHandle(driver, "Preview", "TC59439MGB");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("ULMAGNOLIA")+" Sign Image is displayed");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59439LMGPKGID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59439LMGPKGID"));
	 Reporter.log(ds.getData("59439LMPKGID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59439LMGQTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59439LMGQTY"));
	 Reporter.log(ds.getData("59439LMGQTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Reusable.IsCheckBox(driver, "1");
	 Reusable.IsWindowsHandle(driver, "Preview", "TC59439LMGB");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59439#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59439#ITEMS")+" "+OR.getMessages("ITEMS"));
	
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" is enbaled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" is enabled");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59439_1")),"15");
	 Reporter.log("Correct Pacakge Signs are added in Batch");
	 BaseAction.clickElement(driver, "DUNSELECT", OR.getMessages("UNSELECT"));
	 Assert.assertFalse(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log("All The Packages are unselected");
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
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59439_2")),"9");
	 Reporter.log("Two Pacakges are deleted.");	
	}
	
	
	@Test//(enabled=false)
	 public void TC_59440() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DSBUNDLEIMG"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59440SSKUID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59440SSKUID"));
	 Reporter.log(ds.getData("59440SSKUID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59440QTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59440QTY"));
	 Reporter.log(ds.getData("59440QTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked"); 
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59440#ITEMS1")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59440#ITEMS1")+" "+OR.getMessages("ITEMS"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59440MSKUID"));
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 BaseAction.clickElement(driver, "DCANCEL", OR.getMessages("CANCEL"));
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59440MSKUID"));
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULMAGNOLIA"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLMAGNOLIAIMG"));
	 Reporter.log(OR.getMessages("DLMAGNOLIAIMG")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59440MGSKUID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59440MGSKUID"));
	 Reporter.log(ds.getData("59440MGSKUID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59440QTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59440QTY"));
	 Reporter.log(ds.getData("59440QTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLBUNDLEIMG"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59440MSKUID"));
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reusable.IsCheckBox(driver, "1");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59440#ITEMS2")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59440#ITEMS2")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59440")),"15");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Reporter.log(BatchName+" is opened");
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59440")),"15");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct in employee Batches");
	 
	 
	}
	
	@Test//(enabled=false)
	 public void TC_59441() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("ULBUND3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DLBUNDLEIMG"));
	 Reporter.log(OR.getMessages("ULBUND3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59441SKUID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59441SKUID"));
	 Reporter.log(ds.getData("59441SKUID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59441QTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59441QTY"));
	 Reporter.log(ds.getData("59441QTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 Reporter.log("All Pacakges are selected");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DCANCEL",OR.getMessages("CANCEL")));
	 Reporter.log(OR.getMessages("CANCEL")+" is displayed and enabled");
	 BaseAction.clickElement(driver, "DCANCEL",OR.getMessages("CANCEL"));
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59441SKUID"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59441SKUID"));
	 Reporter.log(ds.getData("59441SKUID")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59441QTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59441QTY"));
	 Reporter.log(ds.getData("59441QTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 Reporter.log("All Pacakges are selected");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59441#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59441#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59441")),"6");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DUNSELECT", OR.getMessages("UNSELECT")));
	 Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPREVIEW", OR.getMessages("PREVIEW")));
	 Reporter.log(OR.getMessages("PREVIEW")+" is enabled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DPRINT", OR.getMessages("PRINT")));
	 Reporter.log(OR.getMessages("PRINT")+" is enbaled");
	 Assert.assertTrue(Reusable.IsEnabled(driver, "DDELETE", OR.getMessages("DELETE")));
	 Reporter.log(OR.getMessages("DELETE")+" is enabled");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Reporter.log(BatchName+" is opened");
	 BaseAction.waitFor();
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59441")),"6");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct in employee Batches");
	 
	 
	}
	
	@Test//(enabled=false)
	 public void TC_59442() throws  Exception {
	 Reusable.StorePage(driver);
	 Reporter.log("User is in StoreUI Home Page");
	 BaseAction.clickElement(driver,"DPKGBATCH",OR.getMessages("PKGBATCH"));
	 Reporter.log(OR.getMessages("PKGBATCH")+ " is clicked");
	 BaseAction.clickElement(driver, "DLIBTAB", OR.getMessages("LIBTAB"));
	 Reporter.log("User is in Library Tab");
	 BaseAction.Select_ComboBox(driver, "DDEPTDRP", OR.getMessages("OTHER"), "DDEPTTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFDEPT"), OR.getMessages("OTHER"));
	 Reporter.log(OR.getMessages("OTHER")+" is selected in Department Dropdown");
	 BaseAction.Select_ComboBox(driver, "DLIBDRP", OR.getMessages("UBUND3"), "DLIBTYP");
	 Assert.assertEquals(BaseAction.read_Text(driver, "DDEFTLIB"), OR.getMessages("UBUND3"));
	 Reporter.log(OR.getMessages("UBUND3")+" Sign Type is selected in Sign Type Dropdown");
	 BaseAction.clickElement(driver, "DVIEWPKG", OR.getMessages("VIEWPKG"));
	 BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));
	 Reporter.log("All Pacakges are selected");
	 BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DPKGPAGE"), OR.getMessages("PKGPAGE"));
	 Reporter.log(OR.getMessages("PKGPAGE")+" is displayed");
	 BaseAction.Select_ComboBox(driver, "DPKGDRP", OR.getMessages("UNONPRC3"), "DPKGSIGNTYP");
	 Assert.assertTrue(Reusable.IsDisplayed(driver, "DNONPRC3IMG"));
	 Reporter.log(OR.getMessages("DNONPRC3")+" Sign Type is selected");
	 BaseAction.Enter_Text(driver, "DPKGINPUT", ds.getData("59442NPPKG"));
	 Assert.assertEquals(BaseAction.read_Value(driver, "DPKGINPUT"),ds.getData("59442NPPKG"));
	 Reporter.log(ds.getData("59442NPPKG")+" is entered");
	 Reusable.clearAll(driver, "DQTYINPUT");
	 BaseAction.Enter_Text(driver, "DQTYINPUT", ds.getData("59442QTY"));
	 Assert.assertEquals(BaseAction.read_Value(driver,"DQTYINPUT"), ds.getData("59442QTY"));
	 Reporter.log(ds.getData("59442QTY")+" is entered in Quantity box.");
	 BaseAction.clickElement(driver, "DENTER",OR.getMessages("ENTER"));
	 Reporter.log(OR.getMessages("ENTER")+" is clicked");
	 Assert.assertTrue(BaseAction.read_Text(driver,"DBATCHNM").contains(OR.getMessages("BATCHNAME")));
	 Reporter.log("Batch Name is generated as "+OR.getMessages("BATCHNAME"));
	 Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"),ds.getData("59442#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Reporter.log("# of Items in Batch is"+ds.getData("59442#ITEMS")+" "+OR.getMessages("ITEMS"));
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59442")),"21");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct.");
	 String BatchName=BaseAction.read_Text(driver,"DBATCHNM");
	 BaseAction.clickElement(driver, "DHBBYLOGO", "");
	 BaseAction.clickElement(driver, "DEMP", OR.getMessages("EMPMENU"));
	 Assert.assertEquals(BaseAction.read_Text(driver,"DEMPPAGE"),OR.getMessages("EMPPAGE"));
	 Reporter.log(OR.getMessages("EMPPAGE")+" Page is displayed");
	 Assert.assertTrue(Reusable.findBatch(driver, BatchName));
	 Reporter.log("Created Batch is available in Employee Batches");
	 Reporter.log(BatchName+" is opened");
	 BaseAction.waitFor();
	 Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver,"TC59442")),"21");
	 Reporter.log("Product Information:Pacakge Description,Pacakge ID,Start Date,End Date is displayed Correct in employee Batches");
	 
	 
	 
	 
	}
		 @AfterMethod
		 public void close()
			  {
				BaseAction.closeBrowser(driver);  
			  }	  
}	


