import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        driver.manage().window().maximize();
        Thread.sleep(1500);

        Select dropButton = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
        Thread.sleep(1500);
        dropButton.selectByVisibleText("JQuery");


        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]")).click();

    }
}
