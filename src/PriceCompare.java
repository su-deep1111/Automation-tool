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
        Thread.sleep(2000);

        WebElement FirstPrice = driver.findElement(By.xpath("//*[@id=\"display-price-623405955519\"]"));
        String finalprice = FirstPrice.getText();
        System.out.println(finalprice);


        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(1500);

        WebElement search1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        search1.sendKeys("rich dad poor dad");
//      search1.submit();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
        Thread.sleep(2000);

        WebElement SecondPrice = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/a[3]/div[1]/div[1]"));
        String lastprice = SecondPrice.getText();
        System.out.println(lastprice);






    }
}
