package loc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rp {
	public void logic() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte241_nagamani\\Desktop\\jars\\chromedriver.exe");
		WebDriver naga=new ChromeDriver();
		naga.get("http://primusbank.qedgetech.com/");
		naga.findElement(loc.primusbank_username).sendKeys(Testdata.pusername);
		naga.findElement(loc.primusbank_password).sendKeys(Testdata.ppassword);
		naga.findElement(loc.primusbank_login).click();
		
	}

}
