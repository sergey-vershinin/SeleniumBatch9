package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver", "/Users/rocketpower/Users/rocketpower/intelligent-workspace/IdeaProjects/SeleniumJavaBatch9/drivers/chromedriver");
            WebDriver driver =new ChromeDriver();
            driver.get("https://www.amazon.com");
            String url=driver.getCurrentUrl();
            System.out.println(url);
            String title = driver.getTitle();
            System.out.println(driver);
            //driver.quit();
        }
    }


