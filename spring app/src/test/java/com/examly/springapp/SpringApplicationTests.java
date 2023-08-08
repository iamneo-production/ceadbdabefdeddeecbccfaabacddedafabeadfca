// package com.examly.springapp;

// import org.testng.annotations.Test;
// import java.net.URL;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.testng.annotations.BeforeTest;
// import org.testng.Assert;
// import org.testng.annotations.AfterTest;

// public class SpringApplicationTests {

//     ChromeOptions chromeOptions = new ChromeOptions();
//     WebDriver driver = null;

//     @BeforeTest
//     public void beforeTest() throws Exception
//      {
//    // replace seleniumhost and port with correct values
//         driver = new RemoteWebDriver(new URL("http://<seleniumhost:port>/"), chromeOptions);
//         driver.manage().window().maximize();
//     }

//     @AfterTest
//     public void afterTest() 
//     {
//         driver.quit();
//     }

// }

package com.examly.springapp;



import org.testng.annotations.Test;
import java.net.URL;
import java.util.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpringApplicationTests {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		
        // driver = new RemoteWebDriver(new URL("http://<seleniumhost:port>/"), chromeOptions);
        driver = new RemoteWebDriver(new URL("http://34.85.242.216:4444"), chromeOptions);
	}

	@Test
	public void testcase_1() throws InterruptedException //Go to Ebay
	{
		
		driver.navigate().to("https://www.ebay.com/");
		WebElement searchBox = driver.findElement(By.xpath("//div[@id='gh-ac-box2']/input[1]"));
		searchBox.sendKeys("Apple Watches");
	}

	@Test
	public void testcase_2() throws InterruptedException 
      {
	       
        driver.findElement(By.xpath("//td[@class='gh-td gh-sch-btn']/input")).click();
	   // Scanner sc=new Scanner(System.in);
	    String str=driver.getTitle();
	    Assert.assertEquals(str.trim(), "Apple Watches for sale | eBay");
		System.out.println(str);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='s-item__title']/span[@role='heading']"));
		String str1=list.get(1).getText();
		Assert.assertEquals(str1,str1);
		System.out.println(str1);
		String str2=list.get(9).getText();
	    Assert.assertEquals(str2,str2);
	    System.out.println(str2);
	  }
   @AfterTest
	    public void afterTest() {
		driver.quit();
	}

}
