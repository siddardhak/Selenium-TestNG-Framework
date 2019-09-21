import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String driverPath= System.getProperty("user.dir");
		System.out.println(driverPath);
		
		System.setProperty("webdriver.chrome.driver", driverPath+"/drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=L4auw2m9W-w&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=2");
		driver.close();

	}

}
