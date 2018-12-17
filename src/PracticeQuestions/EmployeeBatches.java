package StoreUITestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import CommonUtility.BaseAction;
import CommonUtility.ConstantClass;
import CommonUtility.TestDataReader;

public class EmployeeBatches {
	
	TestDataReader ds;
	WebDriver driver;

	@BeforeMethod
	public void TC_Store_PRE() throws Exception
	{
		  DOMConfigurator.configure("log4j.xml");
		  ds= new TestDataReader();		
		  driver=BaseAction.openBrowser("IE",ConstantClass.SURL);	

	}

}
