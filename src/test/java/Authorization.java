import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.yaposhka.kh.ua");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();


    }

}

