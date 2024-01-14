package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoWebShop {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public DemoWebShop(WebDriver driver) {
        this.driver=driver;
    }

    //Locator for web element
    By Sort = By.name("products-orderby");

    public void DropdownListSort(){
        Select drpSort = new Select(driver.findElement(Sort));
        drpSort.selectByVisibleText("Name: A to Z");
    }

    public void CheckIfSorted(){
// Locate the elements containing the results
        List<WebElement> results = driver.findElements(By.cssSelector(".product-grid .product-item .product-title"));
// Retrieve the text of each element and store it in a list
        List<String> resultTexts = new ArrayList<>();
        for (WebElement result : results) {
            resultTexts.add(result.getText());
        }

// Sort the list of results in A-Z order
        Collections.sort(resultTexts);

// Retrieve the text of each element again
// Moram tako jer ne mogu uspoređivati kasnije sa results, budući da je to lista web elemenata, a ja trebam text usporediti
        List<String> sortedResultTexts = new ArrayList<>();
        for (WebElement result : results) {
            sortedResultTexts.add(result.getText());
        }

// Verify that the results are in the correct order
        assert resultTexts.equals(sortedResultTexts) : "Poruka o pogrešci ako nisu jednaki";    }
}
