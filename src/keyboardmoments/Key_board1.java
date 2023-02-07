package keyboardmoments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Key_board1 {
	public static void main(String[] args) throws InterruptedException {
    WebDriver Driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\Chrome_driver_108");
	Driver.get("https://demoqa.com/text-box");
	Driver.manage().window().maximize();
	WebElement fullname = Driver.findElement(By.id("userName"));
	fullname.sendKeys("Pratiksha Khaparde");
	WebElement email = Driver.findElement(By.id("userEmail"));
	email.sendKeys("pratiksha.khaparde@yahoo.com");
	WebElement address = Driver.findElement(By.id("currentAddress"));
	address.sendKeys("Swavalambi Nagar, Nagpur");
	Thread.sleep(1000);
	address.sendKeys(Keys.chord(Keys.CONTROL,"A"));
	address.sendKeys(Keys.chord(Keys.CONTROL,"C"));
	address.sendKeys(Keys.TAB);
	Thread.sleep(1000);
	WebElement paddress = Driver.findElement(By.id("permanentAddress"));
	paddress.sendKeys(Keys.chord(Keys.CONTROL,"V"));
	Thread.sleep(1000);
	Driver.close();
	
	
	
	
	}
	
	
}
