package Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditonalAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//*[@id=\'nav-signin-tooltip\']/a/span")).click();
////		
//		driver.findElement(By.id("ap_email")).sendKeys("krishsrivatsav@gmail.com");
////		
//		driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
////		
//		driver.findElement(By.id("ap_password")).sendKeys("vaalukrish");
////		
//		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
//		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone xr 128");
		
		driver.findElement(By.xpath("//*[@id=\'nav-search\']/form/div[2]/div/input")).click();
		
		//driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		
		driver.findElement(By.linkText("Apple iPhone XR (128GB) - White")).click();
		
		
		//switching from parent to child window
		
		//Switching from Parent window to child window for that i am using set datastructure
		
		Set<String> ids=driver.getWindowHandles(); //becoz two windows
		
		//Iterators will point out to the location based on index..
		
		Iterator<String>  it= ids.iterator();
		
		String parentWindowId = it.next(); //it.next will move from parent to child..now it will grab the parent window id
		
		String childWindowId =it.next(); //now it will grab the child window id
		
		driver.switchTo().window(childWindowId); //now it is in child window id
		
		System.out.println(driver.getTitle());
		
		//Open a Video
		
		driver.findElement(By.xpath("//*[@id=\'altImages\']/ul/li[5]/span[1]")).click();
		Thread.sleep(2000);
		
		//Close Video
		driver.findElement(By.xpath("//*[@id='a-popover-2']/div/header/button")).click();
		

		//Show More
		
		driver.findElement(By.xpath("//*[@id=\'feature-bullets\']/div/a/span")).click();
		
		//Stars For Ratings 
		
//		driver.findElement(By.id("averageCustomerReviews")).click();
//		driver.findElement(By.xpath("//*[@id=\'histogramTable\']/tbody/tr[1]/td[1]/span[1]/a")).click();
		

		//youtube navigation
		
		driver.navigate().to("https://www.youtube.com/watch?v=NW4699nOnsI");
		Thread.sleep(20000);
			
		driver.navigate().back();
//		
//		//Ratings
//		
		driver.findElement(By.id("acrCustomerReviewText")).click();
		Thread.sleep(2000);
		
		//Email Me or notify me..
		
//		driver.findElement(By.id("a-autoid-0-announce")).click();
		
//		
//		//Add to whishlist..
//		
		driver.findElement(By.xpath("//*[@id=\'wishListMainButton-announce\']")).click();
//		
//	
//		
////		
//		
		
		
		

	}

}
