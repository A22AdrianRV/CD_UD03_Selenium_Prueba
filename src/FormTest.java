
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

public class FormTest{
    WebDriver driver;

    @Before
    public void setUp(){
    System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22adrianrv/Escritorio/CD_UD03_Selenium/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testCombo(){
        try {
            driver.get("file:///home/sanclemente.local/a22adrianrv/Escritorio/CD_UD03_Selenium/src/index.html");
            Thread.sleep(1000);
            WebElement checkboxPinha = driver.findElement(By.name("pinha"));
            WebElement checkboxSinPinha = driver.findElement(By.name("sin_pinha"));
            
            checkboxPinha.click();
            checkboxSinPinha.click();

            assertEquals(true,checkboxSinPinha.isSelected());
            assertEquals(false,checkboxPinha.isSelected());

            driver.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        

    }

    @Test
    public void testRadio(){
        try {
        driver.get("file:///home/sanclemente.local/a22adrianrv/Escritorio/CD_UD03_Selenium/src/index.html");
        /*WebElement masaGruesa = driver.findElement(By.cssSelector("name='boton' value='1']"));
        WebElement masaFina= driver.findElement(By.xpath("//input[@name='boton' value='2']"));
        masaGruesa.click();
        masaFina.click();
        */
        Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.close();

    }

    @Test
    public void testComo(){
        try {
            driver.get("file:///home/sanclemente.local/a22adrianrv/Escritorio/CD_UD03_Selenium/src/index.html");
            Select menu = new Select(driver.findElement(By.name("menu")));
            menu.selectByIndex(0);
            menu.selectByValue("2");
            menu.selectByVisibleText("Tres");
            driver.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}