import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WindowsWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");

        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement contactus = driver.findElement(By.id("contact-us"));
        contactus.click();

        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement firstname = driver.findElement(By.name("first_name"));
        WebElement lastname = driver.findElement(By.name("last_name"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement comments = driver.findElement(By.name("message"));
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));

        firstname.sendKeys("sudeep");
        Thread.sleep(1000);
        lastname.sendKeys("baniya");
        Thread.sleep(1000);
        email.sendKeys("sudeep@gmail.com");
        Thread.sleep(1000);
        comments.sendKeys("Hi there");
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(tabs.get(0));
        Thread.sleep(1000);
        WebElement loginportal = driver.findElement(By.id("login-portal"));
        loginportal.click();

        ArrayList<String>tab1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab1.get(1));

        WebElement username = driver.findElement(By.id("text"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        username.sendKeys("webdriver");
        Thread.sleep(2000);
        password.sendKeys("webdriver123");
        Thread.sleep(2000);

        login.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.quit();






    }
}
