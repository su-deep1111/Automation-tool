import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PriceCompare {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement search = driver.findElement(By.name("keyword"));
        search.sendKeys("rich dad poor dad");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span"));
        button.click();

        ArrayList<String> nexttab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(nexttab.get(1));
        driver.get("https://www.flipkart.com/");



    }
}
