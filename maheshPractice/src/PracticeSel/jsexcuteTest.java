package PracticeSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexcuteTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	d.get("https://www.google.com");
	d.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)d;
	/*String title=js.executeScript("returndocument.title:").toString();
	System.out.println("title is:"+title);*/
	String domain=(String)js.executeScript("returndocument.domain");
}
}
