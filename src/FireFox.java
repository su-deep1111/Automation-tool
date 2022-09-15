import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class FireFox {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.target.com/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\sudee\\OneDrive\\Desktop\\sc\\screenshot.png"));

        Thread.sleep(2000);
        System.setProperty("webdriver.edge.driver", "C:/drivers/msedgedriver.exe");
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.target.com/");

        driver1.manage().window().maximize();
        Thread.sleep(1500);

        File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1,new File("C:\\Users\\sudee\\OneDrive\\Desktop\\sc\\screenshot.png"));



    }
}