package PracticeSel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectreposTest {
public static void main(String[] args) throws Exception {
	FileInputStream fip=new FileInputStream("D:\\maheshPractice\\OR.properties");
	Properties p1=new Properties();
	p1.load(fip);                    
	System.out.println("property class loded");
	String username=p1.getProperty("username");
	String Next=p1.getProperty("Next");
	String password=p1.getProperty("password");
	String SignIn=p1.getProperty("Signin");
	System.out.println("gmail un xpath is:"+username);
	System.out.println("gmail next xpath is:"+Next);
	System.out.println("gmail password xpath is:"+password);
	System.out.println("gmail signin xpath is:"+SignIn);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.gmail.com");
	
	Thread.sleep(4000);
	d.findElement(By.xpath(p1.getProperty("username.xpath"))).sendKeys("mahesh.selenium");
	Thread.sleep(3000);
	d.findElement(By.xpath(p1.getProperty("Next.xpath"))).click();
	Thread.sleep(4000);
	d.findElement(By.xpath(p1.getProperty("password.xpath"))).sendKeys("123456");
	Thread.sleep(3000);
	d.findElement(By.xpath(p1.getProperty("Signin.xpath"))).click();
	
}
}
