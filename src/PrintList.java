import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintList {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        WebElement list = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/h2"));
        Thread.sleep(1500);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1500);

        js.executeScript("arguments[0].scrollIntoView(true)", list);
        Thread.sleep(1500);

        WebElement content = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/ul[1]"));

        System.out.println(content.getText());

    }
}