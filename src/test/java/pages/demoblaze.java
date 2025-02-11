package pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;





public class demoblaze {
    
    private WebDriver driver;

    @BeforeMethod
    public void  setUp()
    { 
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test 
    public void goToDemoblaze(){
                         
        driver.get("https://demoblaze.com/");
    }
      
    @AfterMethod
    public void tearDown(){
    
        if(driver != null){
            driver.quit();
        }
    }

}
