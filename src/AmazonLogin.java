import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        WebElement signin = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        signin.click();

        Thread.sleep(1500);

        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("sudeep@gmail.com");

        Thread.sleep(1500);

        WebElement cont = driver.findElement(By.id("continue"));
        cont.click();



    }
}
