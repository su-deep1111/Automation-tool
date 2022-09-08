import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstname =  driver.findElement(By.name("first_name"));
        WebElement lastname =  driver.findElement(By.name("last_name"));
        WebElement email =  driver.findElement(By.name("email"));
        WebElement comments =  driver.findElement(By.name("message"));
        WebElement submit =  driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));

        firstname.sendKeys("sudeep");

        lastname.sendKeys("baniya");

        email.sendKeys("sudeep@gmail.com");

        comments.sendKeys("hello");

        Thread.sleep(2000);
        submit.click();
    }

}
