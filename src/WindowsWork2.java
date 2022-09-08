import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WindowsWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");

        driver.manage().window().maximize();//maximize window

        Thread.sleep(1500);
        WebElement loginportal = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]"));//to go login portal
        loginportal.click();//clicks login button

        Thread.sleep(1500);
        ArrayList<String>tab = new ArrayList<String>(driver.getWindowHandles());//to go another tab
        driver.switchTo().window(tab.get(1));//takes to newly opened tab

        Thread.sleep(1000);
        WebElement username = driver.findElement(By.id("text"));//
        username.sendKeys("webdriver");

        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("webdriver123");

        Thread.sleep(1500);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        Thread.sleep(1500);
        driver.switchTo().alert().accept();//will accept alert box message

        Thread.sleep(2000);

        driver.switchTo().window(tab.get(0));//takes back to first tab

        Thread.sleep(1000);

        WebElement contactus = driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]"));
        contactus.click();

        Thread.sleep(1000);

        ArrayList<String>newtab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newtab.get(2));

        WebElement firstname = driver.findElement(By.name("first_name"));
        firstname.sendKeys("Sudeep");

        Thread.sleep(1000);

        WebElement Lastname = driver.findElement(By.name("last_name"));
        Lastname.sendKeys("Baniya");

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("deep@gmail.com");

        Thread.sleep(1000);

        WebElement comments = driver.findElement(By.name("message"));
        comments.sendKeys("Hellowwwwwww");

        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();


    }
}
