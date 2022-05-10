package ePayment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lauch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlineservices.tin.egov-nsdl.com/etaxnew/tdsnontds.jsp");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"selectform\"]/div[1]/div[1]/section/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("0020")).click();
		driver.findElement(By.id("400")).click();
		Select NatureofPayment = new Select(driver.findElement(By.xpath("//*[@id=\"div_nature_error\"]/div/select")));
		List<WebElement> l = NatureofPayment.getOptions();
		System.out.println("Number of items: " + l.size());
		NatureofPayment.selectByIndex(3);
	}
}
 