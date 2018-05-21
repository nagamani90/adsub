package link;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\chromedriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		 WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.navigate().refresh();
		d.get("https://www.bharatmatrimony.com/");
		d.findElement(By.xpath(".//*[@id='REGISTERED_BY']")).click();
		
		 Select s=new Select(d.findElement(By.xpath(".//*[@id='REGISTERED_BY']")));
		  
		 // Listlist =s.getOptions();
		  List<WebElement> list = s.getOptions();
		  
		  
		  for(int i=0;i<list.size();i++)
		  {
		
		  String a=list.get(i).getText();
		
		  if(!a.equals("Son") && !a.equals("Brother")){
		  System.out.println(a);
		  
			  
		  }
		  }
	}
}
	


