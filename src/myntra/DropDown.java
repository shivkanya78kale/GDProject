package myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	
	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			 ChromeDriver chrome = new ChromeDriver();
		 chrome.get("https://testingshastra.com/");
		 chrome.manage().window().maximize();
		 Thread.sleep(3000);
		 chrome.findElement(By.xpath("//a[text()='Assignments']")).click();
		 Thread.sleep(3000);
		 chrome.findElement(By.xpath("//div[@id=\"collapseOne\"]//a[@href='/assignments/drop-down']")).click();
	// 		
	}
	
	
}
