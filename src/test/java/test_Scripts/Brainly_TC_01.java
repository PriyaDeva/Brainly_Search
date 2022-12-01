package test_Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SearchBar;

    public class Brainly_TC_01 extends Base_Test{
	
	 @Test(dataProvider="testData")
	 public void testScript1(String search) throws InterruptedException
	  {
	
	   SearchBar Sb = new SearchBar(driver);
	 
	   Sb.enterLoginButton();
	 
	   Thread.sleep(6000);
	   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	    Sb.enterTextInSearch(search);
	    Sb.enterSearchButton1();
	    Thread.sleep(6000);
	    
	    
		Sb.clickAnswer1();
		Thread.sleep(12000);
		
		Sb.enterSeeAnswer();
		Actions action=new Actions(driver);  
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(12000);
        }
	
	@DataProvider(name="testData")
	    public Object[][] getTestData() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("Sheet2");
		return testdata;
	     }
        }


	