import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class HelloSelenium {
    private static WebDriver driver;

    @Test
    public void IHGExample() throws Exception {
        driver.get("https://ihgrewardsclubdining.rewardsnetwork.com/Join");
        WebElement form = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/rn-enrollment-view/div/div/div[2]/rn-enrollment-main-step-user-info/form-builder/form"));
        WebElement fname = driver.findElement(By.name("firstName"));
        WebElement lname = driver.findElement(By.name("lastName"));
        WebElement zip = driver.findElement(By.name("zipCode"));
        WebElement ppN = driver.findElement(By.name("partnerProgramNumber"));
        WebElement email = driver.findElement(By.name("email"));



    }
    @Test
    public void googleSearchExample() throws Exception {
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("GGC");
        element.submit();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement nextPageElement = driver.findElement(By.id("rcnt"));
        assertTrue("Expected GGC in title", driver.getTitle().contains("GGG"));
    }

    @Test
    public void testSelenium() throws Exception {
        driver.get("http://tand.altervista.org/Activities/3-12.html");
        WebElement fname = driver.findElement(By.name("fname"));
        WebElement lname = driver.findElement(By.name("lname"));
        WebElement phone = driver.findElement(By.name("phone"));
        WebElement email = driver.findElement(By.name("email"));

        fname.sendKeys("Bob");
        lname.sendKeys("smith");
        phone.sendKeys("888-888-8888");
        email.sendKeys("bob@smith.com");
        driver.findElement(By.xpath("/html/body/form/input[4]")).click();
    }

    @Test
    public void ibottaExample() throws Exception {
        driver.get("https://ibotta.com/register");
        WebElement fname = driver.findElement(By.id("first-name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement passwd = driver.findElement(By.id("password"));
        WebElement bDate = driver.findElement(By.id("birth-date"));
        WebElement zip = driver.findElement(By.id("zip"));

       fname.sendKeys("Bob");
       passwd.sendKeys("1111");
       bDate.sendKeys("10/26/2021");
       email.sendKeys("bob@smith.com");
       zip.sendKeys("90002");
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/main/div[3]/form/button")).click();


    }
    @BeforeClass
    public static void setUpChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hshin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
