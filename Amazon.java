package Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
//		
//		driver.findElement(By.id("ap_email")).sendKeys("krishsrivatsav");
//		
//		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\']/a/span")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("mar201992");
//		
//		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone xr 128");
		
		driver.findElement(By.xpath("//*[@id=\'nav-search\']/form/div[2]/div/input")).click();
		
		//driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		
		driver.findElement(By.linkText("Apple iPhone XR (128GB) - Yellow")).click();
		
		
		//switching from parent to child window
		
		//Switching from Parent window to child window for that i am using set datastructure
		
		Set<String> ids=driver.getWindowHandles(); //becoz two windows
		
		//Iterators will point out to the location based on index..
		
		Iterator<String>  it= ids.iterator();
		
		String parentWindowId = it.next(); //it.next will move from parent to child..now it will grab the parent window id
		
		String childWindowId =it.next(); //now it will grab the child window id
		
		driver.switchTo().window(childWindowId); //now it is in child window id
		
		System.out.println(driver.getTitle());
		
		//select by visible text..
		
//		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'quantity\']"));
//		dropdown.click();
//		Select sel= new Select(dropdown);
//		sel.selectByVisibleText("3");
		
		//Blue color
		
		driver.findElement(By.xpath("//*[@id='a-autoid-9-announce']/div/div[1]/img")).click();
		
		//Again back to same gold color..
		
		driver.findElement(By.xpath("//*[@id=\'a-autoid-10-announce\']/div/div[1]/img")).click();
		
		
		//Add to cart
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		
		

	}

}
