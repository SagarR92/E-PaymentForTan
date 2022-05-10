package ePayment;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TSTD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlineservices.tin.egov-nsdl.com/etaxnew/tdsnontds.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"selectform\"]/div[1]/div[1]/section/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("0020")).click();
		driver.findElement(By.id("400")).click();
//		driver.findElement(By.name("NaturePayment")).click();
//		Thread.sleep(3000);
		Select NatureofPayment = new Select(driver.findElement(By.xpath("//*[@id=\"div_nature_error\"]/div/select")));
		NatureofPayment.selectByIndex(3);
		Select BankName = new Select(driver.findElement(By.id("NetBank_Name_c")));
		BankName.selectByIndex(3);
		driver.findElement(By.xpath("//*[@id=\"div_tan_error\"]/div/input")).sendKeys("ABCDE1234A");
		Select AssessmentYear = new Select(
				driver.findElement(By.xpath("//*[@id=\"div_assessment_error\"]/div/select")));
		AssessmentYear.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"div_add_line5_error\"]/div/input")).sendKeys("Indore");
		Select State = new Select(driver.findElement(By.xpath("//*[@id=\"div_state_error\"]/div/select")));
		State.selectByIndex(10);
		driver.findElement(By.xpath("//*[@id=\"div_pincode_error\"]/div/input")).sendKeys("454774");
		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		driver.findElement(By.xpath("//*[@id=\"div_captcha_error\"]/div/input")).sendKeys(captchaVal);
		driver.findElement(By.id("Submit")).click();
	}
}
