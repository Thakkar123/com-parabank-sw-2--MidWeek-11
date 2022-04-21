package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    // for opening Chrome browser
    public void openBrowser(String baseUrl)
    {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // launch the url
        driver.get(baseUrl);
        // maximise the window
        driver.manage().window().maximize();
        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    // for closing browser

    public void closeBrowser()
    {
        driver.quit();
    }

}
