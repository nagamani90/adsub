package PracticeSel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://demo.guru99.com/popup.php");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	d.findElement(By.linkText("Click Here")).click();
	
	String firstwindow=d.getWindowHandle();
	System.out.println("firstwindow name is:"+firstwindow);
	//To handle all new opened window
	Set<String> s=d.getWindowHandles();
	
	Iterator<String> itr=s.iterator();
	
	while(itr.hasNext())
	{
		String secondwindow=itr.next();
		if(!firstwindow.equalsIgnoreCase(secondwindow))
		{
			//switching to secondwindow
			d.switchTo().window(secondwindow);
			System.out.println("secondwindow name is:"+secondwindow);
			
			d.findElement(By.name("emailid")).sendKeys("mahesh.m1993@gmail.com");
			
			d.findElement(By.name("btnLogin")).submit();
		}
		
	}
}
}
