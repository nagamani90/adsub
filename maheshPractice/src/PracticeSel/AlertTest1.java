package PracticeSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.get("http://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		
		//d.findElement(By.id("cusid")).click();
		d.findElement(By.name("cusid")).sendKeys("89890");
		Thread.sleep(3000);
	    d.findElement(By.name("submit")).submit();
	    
	    //switching to alert
	    Alert alert=d.switchTo().alert();
	    
	    String alertmsg=d.switchTo().alert().getText();
	    
	    System.out.println(alertmsg);
	    
	    alert.accept();
	
    }
	}


	


