import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://es.wikipedia.org");
            Thread.sleep(1000);
            driver.findElement(By.id("n-portal")).click();
            //System.out.println(driver.findElement(By.id("firstHeading")).getText());
            WebElement Titulo = driver.findElement(By.id("firstHeading"));
            Thread.sleep(2000);
            assertEquals("Portal:Comunidad", Titulo.getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    @Test
    public void C1(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://es.wikipedia.org");

    }

}