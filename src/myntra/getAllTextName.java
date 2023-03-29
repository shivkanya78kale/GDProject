package myntra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllTextName {
	public static void main(String[] args) throws InterruptedException {
		int count=1;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(10000);
		List<WebElement> elements=driver.findElements(By.cssSelector("h4.product-product"));
		for (WebElement webElement:elements) {
			System.out.println(count + " " + webElement.getText());
			count++;
		}
	}

}
