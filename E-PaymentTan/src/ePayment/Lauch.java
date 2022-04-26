package ePayment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlineservices.tin.egov-nsdl.com/etaxnew/tdsnontds.jsp");
		driver.manage().window().maximize();
		driver.close();

	}

}
