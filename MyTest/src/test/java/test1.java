import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;


public class test1 {
    private WebDriver driver;
    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //Maximise browser window
        driver.manage().window().maximize();
    }
    @Test
    public void wbe(){
        //Enter url into browser
        driver.get("https://www.admlucid.com/Home/WebElements");
        //Find element by ID
        /*driver.findElement(By.id("Button1")).isEnabled();
        driver.findElement(By.id("Button1")).click();
        driver.switchTo().alert().accept();*/

        //Enter text in text box
        //driver.findElement(By.className("Text3")).clear();
        //driver.findElement(By.className("Text3")).sendKeys("Hello Welcome");

        //Enter text in text are
        //driver.findElement(By.name("TextArea2")).clear();
        //driver.findElement(By.name("TextArea2")).sendKeys("Web Elements and Locators Web Elements");

        //Get page title
        //System.out.println("Get Title" + driver.getTitle());

        //if check box 1 is not selected, check it; if it is selected, ignore the operation
        /*

        if(driver.findElement(By.id("Checkbox1")).isSelected())
        {
            driver.findElement(By.id("Checkbox1")).click();
        }
        else
        {
            System.out.println("The checkbox has benn selected");
        }

        */

        /*
        //Assert condition and if condition is true to do operation if button is button 1, click on it
        if(driver.findElement(By.id("Button1")).getAttribute("Value").contains("button 1"))
        {
            driver.findElement(By.id("Button1")).click();
            driver.switchTo().alert().accept();
        }
        else
        {
            System.out.println("Couldn't find the button");
        }

        */

        //Comparing senKeys and JavascriptExecutor to enter long text in text area
        /*iver.findElement(By.className("TextArea3")).clear();
          driver.findElement(By.className("TextArea3")).sendKeys(text1);

        WebElement enterText = driver.findElement(By.className("TextArea3"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        enterText.clear();
        jsExecutor.executeScript("arguments[0].value=arguments[1];", enterText,text1);
        String text = (String) jsExecutor.executeScript("return arguments[0].value", enterText);*/

        //driver.findElement(By.id("File1")).sendKeys("C:\\Users\\BendJo\\Desktop\\Vjezbam\\FileZaVj.png");
        //driver.findElement(By.name("File2")).sendKeys("C:\\Users\\BendJo\\Desktop\\Vjezbam\\FileZaVj2.jpg");

        //Selenium works on drop down list
        //Select dropdownAge1 = new Select(driver.findElement(By.name("age")));
        //dropdownAge1.selectByVisibleText("12");

        //Submit Form
        /*
        driver.findElement(By.name("Name")).clear();
        driver.findElement(By.name("Name")).sendKeys("John Smith");
        driver.findElement(By.name("EMail")).clear();
        driver.findElement(By.name("EMail")).sendKeys("jsmith@admlucid.com");
        driver.findElement(By.name("Telephone")).clear();
        driver.findElement(By.name("Telephone")).sendKeys("1 8005872778");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        try{Thread.sleep(1000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("/html/body/div/main/form/p[4]/input[1]")).click();
        Select drpAge = new Select(driver.findElement(By.name("age")));
        drpAge.selectByVisibleText("8");
        Select drpService = new Select(driver.findElement(By.name("Service2")));
        drpService.selectByVisibleText("Preschool");
        try{Thread.sleep(2000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("/html/body/div/main/form/p[7]/input[1]")).click();
        try{Thread.sleep(1000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
        //End of submit form
        */

         /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        try{Thread.sleep(2000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("Wait45")).click();

        try{Thread.sleep(20000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    System.out.println("***Button status isEnabled***" + driver.findElement(By.id("Wait45")).isEnabled());
       */

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        try{Thread.sleep(2000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("Wait45")).click();*/

        //getWindowHandles, open a new tab and work on it, import ArrayList
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Albertafirebans.ca")));
        driver.findElement(By.linkText("Albertafirebans.ca")).click();        System.out.println("*** Window Name *** "+driver.getWindowHandles());
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        try{Thread.sleep(3000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver.getCurrentUrl().equals("https://albertafirebans.ca/"))
        {
            driver.findElement(By.className("searchInput")).sendKeys("Calgary");
            driver.findElement(By.className("searchInput")).sendKeys(Keys.RETURN);
        }
        try{Thread.sleep(5000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().window(tab.get(0));
        try{Thread.sleep(3000);}catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(By.linkText("Staff directory")).click();
*/

    }
    @After
    public void teardown(){
        //driver.quit();
    }
}
