package keyboardmoments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class key_board_actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"\\src\\keyboardmoments\\chromedriver_108.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		action.sendKeys("A").build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.SPACE);
		Thread.sleep(1000);
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_textarea");
		driver.manage().window().maximize();
	
		driver.switchTo().frame((WebElement) By.id("iframeResult"));
		driver.findElement(By.xpath("//textarea][@id='w3review']")).click();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("A");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("C");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.DELETE);
		action.build().perform();
		//Thread.sleep(2000);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.build().perform();
		// hellow how are you
	}	
	}
		
