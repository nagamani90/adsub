package link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\chromedriver.exe");
		WebDriver link=new ChromeDriver();
		link.get("https://www.facebook.com/");
		link.manage().window().maximize();
		String obj=link.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[1]/td[1]/label")).getText();
		System.out.println(obj);
		String obj1=link.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[1]/td[2]/label")).getText();
		System.out.println(obj1);
	}
}


		
		
	
		
		
		

	

