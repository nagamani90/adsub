package link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\chromedriver.exe");
		WebDriver sar=new ChromeDriver();
		sar.get("https://www.flipkart.com/");
		sar.manage().window().maximize();
		List<WebElement>links=sar.findElements(By.tagName("a"));
		System.out.println("no of links are"+links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			
		}
		
	}

}
