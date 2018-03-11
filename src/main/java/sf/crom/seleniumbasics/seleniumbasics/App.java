package sf.crom.seleniumbasics.seleniumbasics;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String webDriverKey = "webdriver.chrome.driver";
        String webDriverValue = System.getProperty("user.dir") +
                "/target/tmp_webdrivers/chromedriver-windows-32bit.exe";
        System.setProperty(webDriverKey, webDriverValue);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
