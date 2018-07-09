import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class HandlingSikuli {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe"); // initialize Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		//WebElement Username = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		
		Pattern Username=new Pattern("C:\\Users\\Admin\\Pictures\\Username.png");
		Pattern Password=new Pattern("C:\\Users\\Admin\\Pictures\\Password.png");
		Pattern Login=new Pattern("C:\\Users\\Admin\\Pictures\\Login.png");
		Screen a=new Screen();
		a.type(Username,"Tester");
		a.type(Password,"test");
		a.click(Login);
		
		
		driver.close();
		driver.quit();
	}

}
