import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DemoWebShop {
    private static WebDriver driver;
    @Before
    public void setup(){
        //Start chrome web browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //Maximize browser window
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/desktops");
    }
    @Test
    public void sortby(){
        Pages.DemoWebShop dwb = new Pages.DemoWebShop(driver);
        dwb.DropdownListSort();
        dwb.CheckIfSorted();
    }
    @After
    public void teardown(){
        //Close browser
        //driver.quit();
    }
}
