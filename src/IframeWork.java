import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");

        driver.manage().window().maximize();


                WebElement iframe = driver.findElement(By.xpath("//*[@id=\"ourframe\"]"));

        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a")).click();

        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        num1.sendKeys("10");
        num2.sendKeys("20");

        WebElement button = driver.findElement(By.xpath("/html/body/div/button"));
        button.click();


    }
}
