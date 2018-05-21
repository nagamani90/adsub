package PracticeSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	d.findElement(By.linkText("Electronics")).click();
	WebElement electronics=d.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[1]"));
	List<WebElement> ele=electronics.findElements(By.tagName("a"));
	System.out.println("total frames are:"+ele.size());
	
}
}
