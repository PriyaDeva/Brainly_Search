package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SearchBar;

    public class Brainly_TC_02 extends Base_Test {
	@Test(dataProvider="testData")
	public void testScript1(String Search , String search ) throws InterruptedException
	  {
	
	SearchBar Sb = new SearchBar(driver);
	 
	Sb.enterLoginButton();
	 
	Sb.enterTextInSearch(Search);
	 
	Sb.enterSearchButton1();
	 Thread.sleep(1000);
	  
		  
     
		
	  Actions action=new Actions(driver);
	  Thread.sleep(1000);
	  
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  
	  Thread.sleep(1000);
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  
	  Thread.sleep(1000);
	  
      action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(1000);
	   
	   
	  Sb.Click_SearchTF2();
	  driver.findElement(By.xpath("//textarea[@name='task_content']")).clear();
	  
	  
	  Sb.enterTextInSearchbox1(search);
	  Thread.sleep(5000);
	  
    
       WebElement pickasubject= driver.findElement(By.xpath("//select[@class='sg-select__element']"));    
       pickasubject.click();
       Select select=new Select(pickasubject);

		
		
		WebElement sortBy=driver.findElement(By.name("subject_id"));
		Select sel=new Select(sortBy);
		sel.selectByVisibleText("Chemistry");
		
		
		Sb.ClickAnswerButton();
	     driver.close();
         
		  
}

   @DataProvider(name="testData")
   public Object[][] getTestData() throws IOException {
	Object[][] testdata = ReadExcel.getMultipleData("Sheet3");
	return testdata;
}
}


