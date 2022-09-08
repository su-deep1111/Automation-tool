import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AmazonPagePractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement books = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]"));
        books.click();
        Thread.sleep(1500);

        WebElement bestbookofmonth = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[2]/div[1]/div/div[1]/ul[1]/li[4]/a"));
        bestbookofmonth.click();
        Thread.sleep(1500);

        WebElement taylorjenkins = driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img"));
        taylorjenkins.click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"a-autoid-8-announce\"]")).click();
        Thread.sleep(1500);

        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"comparison-lite-modal-0593158687\"]/input")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//*[@id=\"a-popover-content-2\"]/div/div/div/table/tbody/tr[4]/td[1]/span/a")).click();
        Thread.sleep(2000);

        ArrayList<String>nexttab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(nexttab.get(1));
        Thread.sleep(2000);

        driver.findElement(By.name("proceedToCheckout")).click();










    }
}