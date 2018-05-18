package loc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class validation {
	@Test
	public void title() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\chromedriver.exe");
		WebDriver naga=new ChromeDriver();
		naga.get("http://primusbank.qedgetech.com/");
		System.out.println(naga.getTitle());
		
	}

}
