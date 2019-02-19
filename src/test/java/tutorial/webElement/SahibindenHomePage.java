package tutorial.webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SahibindenHomePage {

    public SahibindenHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "searchText")
    public WebElement searchBox;
}
