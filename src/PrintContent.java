import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Accordion/index.html");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement manual = driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
        Thread.sleep(5000);
        manual.click();

        WebElement content = driver.findElement(By.xpath("//*[@id=\"manual-testing-description\"]/p"));

        System.out.println(content.getText());

        System.out.println();
    }
}