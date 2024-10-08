package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class activity_4 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void open(){

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("http://alchemy.hguy.co/crm");

    }

    @Test
    public void log_into_site(){
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/nav/div/div[5]/ul/li[5]/button/span[1]")));
        String user = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[5]/ul/li[5]/button/span[2]")).getText();
        System.out.println("Logged in as : " + user);
        Assert.assertEquals(user, "admin");
    }

    @AfterClass
    public void close(){
        driver.close();
    }
}