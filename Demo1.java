import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shein.com/");
		Thread.sleep(2000);
		driver.get("https://www.clubfactory.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	}

}
