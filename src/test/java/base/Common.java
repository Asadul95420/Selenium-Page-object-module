package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Common {
    @Test
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\IdeaProjects\\Selenium(May-08)\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        //driver.close();
    }
}