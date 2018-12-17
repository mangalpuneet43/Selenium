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

public class CreateBatchByPlanogram  {
	

	TestDataReader ds;
	WebDriver driver;

	@BeforeMethod
	public void TC_Store_PRE() throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		  ds= new TestDataReader();		
		  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);		

	}

//Plano Gram Page validation
	@Test//(enabled=false)
    public void TC_59443() throws  Exception {       
         Reusable.StorePage(driver);     
         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));                          
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");      
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
         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");      
         Assert.assertTrue(BaseAction.read_Text(driver,"PLNCTGRYTXT").contains(OR.getMessages("PLNOBYCATGORY")));
         Assert.assertTrue(BaseAction.read_Text(driver, "PLNOCAT").contains("--"));
         Reporter.log(OR.getMessages("On default, nothing is selected in "+OR.getMessages("PLNOBYCATGORY")+" dropdown"));
         Assert.assertTrue(BaseAction.read_Text(driver,"PLNTITLETXT").contains(OR.getMessages("PLNOTITLE")));
         Assert.assertTrue(BaseAction.read_Text(driver, "PLNTITLE").contains("--"));
         Reporter.log(OR.getMessages("On default, nothing is selected in "+OR.getMessages("PLNOTITLE")+" dropdown"));
         Assert.assertFalse(Reusable.IsEnabled(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO")));
	     Reporter.log(OR.getMessages("VIEWPLANO")+" button is disabled");
	     Assert.assertFalse(Reusable.IsEnabled(driver, "DSELECT", OR.getMessages("SELECT")));
	     Reporter.log(OR.getMessages("SELECT")+ "button is disabled");
	     Assert.assertFalse(Reusable.IsEnabled(driver, "DADD", OR.getMessages("ADD")));
	     Reporter.log(OR.getMessages("ADD")+ "button is disabled");
	     Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59443#ITEMS")+" "+OR.getMessages("ITEMS"));
         Reusable.selectPlanogram(driver);
         BaseAction.waitFor();

	     
     }

	//ADD SKUs by Planogram
	@Test//(enabled=false)
    public void TC_59444() throws  Exception {       
         Reusable.StorePage(driver);     
         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));                          
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");                            
         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC2CTGRY2"),"DPLANOTTYP");
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),ds.getData("TC2CTGRY2"));
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC2TITLE2"),"DPLANOTTLTYP"); 
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),ds.getData("TC2TITLE2"));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
         Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
         Reusable.ItemValidation1(driver, "59444PLANOBATCH");
	     Reporter.log("All the SKUs are displayed in View Planogram List");
	     Assert.assertTrue(Reusable.IsEnabled(driver, "UNSELECTBTN", OR.getMessages("UNSELECT")));
	     Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
	     Assert.assertTrue(Reusable.IsEnabled(driver, "ADDBTN", OR.getMessages("ADD")));
	     Reporter.log(OR.getMessages("ADD")+" is enabled");
	     BaseAction.clickElement(driver, "UNSELECTBTN", OR.getMessages("UNSELECT"));	
	     Reporter.log(OR.getMessages("UNSELECT")+" button was clicked");
	     //Select the SKU's	     
	     Reusable.IsCheckBox(driver, "1");
	     Reporter.log("1 sku was selected");
	     BaseAction.clickElement(driver, "ADDBTN", OR.getMessages("ADD"));
	     Reporter.log(OR.getMessages("ADD")+" button was clicked");
	     BaseAction.waitUntil(driver, "SKUBATCH");
	     Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59444#ITEMS")+" "+OR.getMessages("ITEMS"));
	     Reporter.log("# of Items in Batch is"+ds.getData("59444#ITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
	     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"59444BATCH"),"3");
		 Reporter.log("Product information are verified in the added Batch"); 
		 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
		 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
		 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
		 Reusable.findBatch(driver, BatchName);	 	 
		 Reporter.log("Batch is created and available");
		 BaseAction.waitFor();
		 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"59444BATCH"),"3");
		 Reporter.log("Product information are verified inside the Employee Batch");
	     

	     
     }
//Add all SKUs in Batch by Planogram
	@Test//(enabled=false)
    public void TC_59445() throws  Exception {       
         Reusable.StorePage(driver);     
         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));                          
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");                            
         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC3CTGRY1"),"DPLANOTTYP");
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),ds.getData("TC3CTGRY1"));
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC3TITLE1"),"DPLANOTTLTYP"); 
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),ds.getData("TC3TITLE1"));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
         Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
         Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC3PLANO"),"24");
	     Reporter.log("All the SKUs are displayed in View Planogram List");
	     Assert.assertTrue(Reusable.IsEnabled(driver, "UNSELECTBTN", OR.getMessages("UNSELECT")));
	     Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
	     Assert.assertTrue(Reusable.IsEnabled(driver, "ADDBTN", OR.getMessages("ADD")));
	     Reporter.log(OR.getMessages("ADD")+" is enabled");
	     BaseAction.clickElement(driver, "UNSELECTBTN", OR.getMessages("UNSELECT"));	
	     Reporter.log(OR.getMessages("UNSELECT")+" button was clicked");
	     //Select the SKU's	     
	     BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));	
	     Reporter.log("All SKUs were selected");
	     BaseAction.clickElement(driver, "ADDBTN", OR.getMessages("ADD"));
	     Reporter.log(OR.getMessages("ADD")+" button was clicked");
	     BaseAction.waitUntil(driver, "SKUBATCH");
	     Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC3#PLANOITEMS")+" "+OR.getMessages("ITEMS"));
	     Reporter.log("# of Items in Batch is"+ds.getData("TC3#PLANOITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
	     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC3PLANOBATCH"),"24");
		 Reporter.log("Product information are verified in the added Batch"); 
		 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
		 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
		 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
		 Reusable.findBatch(driver, BatchName);	 	 
		 Reporter.log("Batch is created and available");
		 BaseAction.waitFor();
		 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC3PLANOBATCH"),"24");
		 Reporter.log("Product information are verified inside the Employee Batch");
	         
     }
//Create Batch of 100 SKUs by Planogram	
	@Test//(enabled=false)
    public void TC_59446() throws  Exception {       
         Reusable.StorePage(driver);     
         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));                          
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");                            
         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC4CTGRY1"),"DPLANOTTYP");
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),ds.getData("TC4CTGRY1"));
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC4TITLE1"),"DPLANOTTLTYP"); 
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),ds.getData("TC4TITLE1"));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
         Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");         
         Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver, "TC4PLANO1")),"243");
         Reporter.log("All the SKUs are displayed in View Planogram List");
         Assert.assertTrue(Reusable.IsEnabled(driver, "UNSELECTBTN", OR.getMessages("UNSELECT")));
         Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
         Assert.assertTrue(Reusable.IsEnabled(driver, "ADDBTN", OR.getMessages("ADD")));
         Reporter.log(OR.getMessages("ADD")+" is enabled");
         BaseAction.clickElement(driver, "UNSELECTBTN", OR.getMessages("UNSELECT"));     
         Reporter.log(OR.getMessages("UNSELECT")+" button was clicked");
            //Select the SKU's        
         BaseAction.clickElement(driver, "SELECTBTN", OR.getMessages("SELECT"));   
         Reporter.log("All SKUs were selected");
         BaseAction.clickElement(driver, "ADDBTN", OR.getMessages("ADD"));
         Reporter.log(OR.getMessages("ADD")+" button was clicked");        
         BaseAction.waitUntil(driver, "SKUBATCH");
         BaseAction.clickElement(driver, "PLANOTAB", " ");             
         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC4CTGRY2"),"DPLANOTTYP");
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),ds.getData("TC4CTGRY2"));
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC4TITLE2"),"DPLANOTTLTYP"); 
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),ds.getData("TC4TITLE2"));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
         Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
         Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver, "TC4PLANO2")),"15");
         Reporter.log("All the SKUs are displayed in View Planogram List");      
         BaseAction.clickElement(driver, "ADDBTN", OR.getMessages("ADD"));
         Reporter.log(OR.getMessages("ADD")+" button was clicked");
         BaseAction.waitUntil(driver, "SKUBATCH");
         BaseAction.clickElement(driver, "PLANOTAB", " ");
         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC4CTGRY3"),"DPLANOTTYP");
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),ds.getData("TC4CTGRY3"));
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC4TITLE3"),"DPLANOTTLTYP"); 
         Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),ds.getData("TC4TITLE3"));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
         Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
         Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver, "TC4PLANO3")),"39");
         Reporter.log("All the SKUs are displayed in View Planogram List");      
         BaseAction.clickElement(driver, "ADDBTN", OR.getMessages("ADD"));
         Reporter.log(OR.getMessages("ADD")+" button was clicked");        
         BaseAction.waitUntil(driver, "SKUBATCH");
         Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59446#ITEMS")+" "+OR.getMessages("ITEMS"));
         Reporter.log("# of Items in Batch is"+ds.getData("TC4#PLANOITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
         String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
         BaseAction.clickElement(driver, "DHBBYLOGO", " ");
         BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));      
         Reusable.findBatch(driver, BatchName);        
         Reporter.log("Batch is created and available");
         BaseAction.waitFor();
         Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59446#ITEMS")+" "+OR.getMessages("ITEMS"));
         Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver, "TC4PLANO4")),"303");
         Reporter.log("Product information are verified inside the Employee Batch");   
                       
     }
//Create Batch by different Department and Cateogry
	@Test//(enabled=false)
    public void TC_59447() throws  Exception {       
         Reusable.StorePage(driver);     
         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));                          
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");                            
         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC5CTGRY1"),"DPLANOTTYP");
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC5TITLE1"),"DPLANOTTLTYP");
         Assert.assertTrue(Reusable.IsEnabled(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO")));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
	     Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
	     Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver, "TC5PLANO1")),"12");
	     BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));	
	     BaseAction.waitFor();
	     String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
	     BaseAction.clickElement(driver, "PLANOTAB", "Planogram");
	     BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("TC5CTGRY2"),"DPLANOTTYP");
         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("TC5TITLE2"),"DPLANOTTLTYP");
         Assert.assertTrue(Reusable.IsEnabled(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO")));
         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
	     Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
	     Assert.assertEquals(Integer.toString(Reusable.ItemValidation1(driver, "TC5PLANO2")),"6");
	     BaseAction.clickElement(driver, "DADD", OR.getMessages("ADD"));
	     BaseAction.waitFor();
	     Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("TC5#PLANOITEMS")+" "+OR.getMessages("ITEMS")); 
	     Reporter.log("# of Items in Batch is"+ds.getData("TC5#PLANOITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
	     Assert.assertEquals(BaseAction.read_Text(driver, "DBATCHNM"), BatchName);
	     Reporter.log("SKUs are added in Same Batch");
	     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC5PLANOBATCH"),"18");
		 Reporter.log("Product information are verified in the added Batch"); 
		 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
		 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
		 Reusable.findBatch(driver, BatchName);	 	 
		 Reporter.log("Batch is created and available");
		 BaseAction.waitFor();
		 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC5PLANOBATCH"),"18");
		 Reporter.log("Product information are verified inside the Employee Batch");
         

	     
     }
	//Create Batch by different Department and Cateogry contains "/" &"_"
		@Test//(enabled=false)
	    public void TC_69448() throws  Exception {       
	         Reusable.StorePage(driver);     
	         BaseAction.clickElement(driver,"DBYPLANO",OR.getMessages("BYPLANOGRAM"));                          
	         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Link is clicked and enable.");
	         Assert.assertTrue(BaseAction.read_Text(driver, "PLANOTEXT").contains(OR.getMessages("BYPLANOGRAM")));
	         Reporter.log(OR.getMessages("BYPLANOGRAM")+" Page is displayed");                            
	         BaseAction.Select_ComboBox(driver,"DPLANOCATDRP",ds.getData("59448CATGRY"),"DPLANOTTYP");
	         Assert.assertEquals(BaseAction.read_Text(driver, "PLNOCAT"),ds.getData("59448CATGRY"));
	         BaseAction.Select_ComboBox(driver,"DPLANOTITLEDRP",ds.getData("59448TITLE"),"DPLANOTTLTYP");
	         Assert.assertEquals(BaseAction.read_Text(driver, "PLNTITLE"),ds.getData("59448TITLE"));
	         Assert.assertTrue(Reusable.IsEnabled(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO")));
	         BaseAction.clickElement(driver, "VIEWPLANO", OR.getMessages("VIEWPLANO"));
		     Reporter.log(OR.getMessages("VIEWPLANO")+" button was clicked");
		     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59448"),"6");
		     Reporter.log("All the SKUs are displayed in View Planogram List");
		     Assert.assertTrue(Reusable.IsEnabled(driver, "UNSELECTBTN", OR.getMessages("UNSELECT")));
		     Reporter.log(OR.getMessages("UNSELECT")+" is enabled");
		     Assert.assertTrue(Reusable.IsEnabled(driver, "ADDBTN", OR.getMessages("ADD")));
		     Reporter.log(OR.getMessages("ADD")+" is enabled");
		     BaseAction.clickElement(driver, "ADDBTN", OR.getMessages("ADD"));
		     Reporter.log(OR.getMessages("ADD")+" button was clicked");
		     BaseAction.waitUntil(driver, "SKUBATCH");
		     Assert.assertEquals(BaseAction.read_Text(driver, "DITEMS"), ds.getData("59448#ITEMS")+" "+OR.getMessages("ITEMS"));
		     Reporter.log("# of Items in Batch is"+ds.getData("59448#ITEMS")+" "+OR.getMessages("ITEMS"+" and is correct"));
		     Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59448BATCH"),"6");
			 Reporter.log("Product information are verified in the added Batch"); 
			 String BatchName=BaseAction.read_Text(driver, "DBATCHNM");
			 BaseAction.clickElement(driver, "DHBBYLOGO", " ");
			 BaseAction.clickElement(driver,"DEMP",OR.getMessages("EMPPAGE"));	
			 Reusable.findBatch(driver, BatchName);	 	 
			 Reporter.log("Batch is created and available");
			 BaseAction.waitFor();
			 Assert.assertEquals(""+Reusable.ItemValidation1(driver,"TC59448BATCH"),"6");
			 Reporter.log("Product information are verified inside the Employee Batch");
		     
		}
	
	 @AfterMethod
	 public void close()
		  {
			BaseAction.closeBrowser(driver);  
		  }	


}
