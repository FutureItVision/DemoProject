package BasicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestOne {

    public RemoteWebDriver driver;
	@Test
	public void firstTest(){

    ChromeOptions options = new ChromeOptions();
                        options.addArguments("--disable-dev-shm-usage");
                        options.addArguments("--no-sandbox");
                        options.setAcceptInsecureCerts(true);
                        options.setHeadless(true);

    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://automationpractice.com/index.php");
    driver.findElementByXPath(".//*[@id='header_logo']/a/img").isDisplayed();
//        driver = new RemoteWebDriver(new URL("http://localhost:80/wd/hub"), chromeCapabilities);
//        driver.get("http://automationpractice.com/index.php");
//        driver.findElementByXPath(".//*[@id='header_logo']/a/img").isDisplayed();
    driver.close();
				
	}
}


