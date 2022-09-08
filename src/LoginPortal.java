import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");

        WebElement username = driver.findElement(By.id("text"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        username.sendKeys("webdriver");
        Thread.sleep(2000);
        password.sendKeys("webdriver123");
        Thread.sleep(2000);

        login.click();
        String message = driver.switchTo().alert().getText();
        System.out.println(message);

        if (message.equals("validation succeeded")) {
                System.out.println("Test passed");
            }else{
                System.out.println("Test failed");
            }
            driver.switchTo().alert().accept();
            driver.quit();

        }
    }
