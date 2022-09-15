import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "C:/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.target.com/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\sudee\\OneDrive\\Desktop\\sc\\screenshot.png"));


    }
}
