import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

class ExitAuthorizationUser {
    public static void scrollPages (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");//
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.yaposhka.kh.ua");

        WebElement enter = driver.findElement(By.xpath("(//*[@class='not-logged-in'])[2]"));
        enter.click();

        WebElement login = driver.findElement(By.xpath("//*[@name='login[username]']"));
        login.sendKeys("+380661418400");

        WebElement pass = driver.findElement(By.xpath("//*[@name='login[password]']"));
        pass.sendKeys("123123qwe", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



    }
}
