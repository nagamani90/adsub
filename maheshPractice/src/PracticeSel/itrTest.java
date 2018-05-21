package PracticeSel;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itrTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte207_mahesh\\Desktop\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://jqueryui.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	List<WebElement> links=d.findElements(By.xpath("//*[@id='menu-top']/li"));
	System.out.println("total links are:"+links.size());
	
	Iterator<WebElement> itr=links.iterator();
	while(itr.hasNext())
	{
		WebElement ele=itr.next();
		String ele1=ele.getText();
		System.out.println("elements names:"+ele1);
	}
	
}
}
