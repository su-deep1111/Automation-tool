import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement datepicker=driver.findElement(By.xpath("//*[@id=\"datepicker\"]/div/div[1]/h1"));
        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1500);

        js.executeScript("arguments[0].scrollIntoView(true)", datepicker);
        Thread.sleep(1500);

        datepicker.click();


        ArrayList<String> nexttab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(nexttab.get(1));

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]/span")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")).click();

        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]")).click();

        Thread.sleep(2000);
        driver.close();
        Thread.sleep(1500);
        driver.quit();





    }
}
