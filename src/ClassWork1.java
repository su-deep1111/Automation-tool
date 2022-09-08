import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

       WebElement e =  driver.findElement(By.name("q"));
       e.sendKeys("Dart Tutorial");
       e.submit();





        





    }
}

