import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjTest{
    WebDriver driver;


    @Before
    public void setUp(){
    System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22adrianrv/Escritorio/CD_UD03_Selenium/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void CPF1(){
        try {
            driver.get("https://www.game.es/");
            Thread.sleep(1000);
            driver.findElement(By.id("btnOverlayCookiesClose")).click();
            //WebElement barra = driver.findElement(By.cssSelector("input[aria-label='Buscar']"));
            WebElement barra = driver.findElement(By.id("searchinput"));
            barra.sendKeys("Nintendo");
            driver.findElement(By.id("submitsearch")).click();
            WebElement compra = driver.findElement(By.className("figure"));
            compra.click();
            Thread.sleep(1000);
            driver.close();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}