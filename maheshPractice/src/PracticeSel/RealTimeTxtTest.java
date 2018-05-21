package PracticeSel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RealTimeTxtTest {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	d.get("https://www.flipkart.com");
	d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	WebElement electronics=d.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[1]/a/span"));
	Actions a=new Actions(d);
	a.moveToElement(electronics).build().perform();
	String electronicstxt=electronics.getText();
	File file=new File("C:\\Users\\arte207_mahesh\\Desktop\\flipkart.txt");
	boolean b=file.createNewFile();
	if(b)
	{
		System.out.println("file is created");
		
	}
	else
	{
		System.out.println("file is already existed");
	}
	FileWriter fw=new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(electronicstxt);
	bw.flush();
}
}
