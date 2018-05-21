package PracticeSel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://jsbin.com/usidix/1");
	d.manage().window().maximize();
	
	d.findElement(By.xpath("/html/body/input")).click();
	Alert alert=d.switchTo().alert();
	String alrtmsg=d.switchTo().alert().getText();
	System.out.println(alrtmsg);
	alert.accept();
	
}
}
