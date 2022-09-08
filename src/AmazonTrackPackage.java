import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AmazonTrackPackage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        Thread.sleep(1500);
        WebElement customerservice = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
        customerservice.click();

        Thread.sleep(1500);
        WebElement mystuff = driver.findElement(By.xpath("//*[@id=\"hub-gateway-app-unauth\"]/div[2]/div/div/div[1]/ul/li[2]/label"));
        mystuff.click();

        Thread.sleep(1500);
        WebElement trackpackage = driver.findElement(By.xpath("//*[@id=\"hub-gateway-app-unauth\"]/div[2]/div/div/div[2]/div[2]/div[1]/div"));
        trackpackage.click();

        ArrayList<String>nexttab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(nexttab.get(1));

        Thread.sleep(1500);

        WebElement yourorder = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
        yourorder.click();





    }
}
