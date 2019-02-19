package tutorial.webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.TreeMap;

public class TrendyolMainPage {
   public TrendyolMainPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
   }
   @FindBy(css = "[title='Kapat']")
    public WebElement announcementCloseButton;

   @FindBy(id = "item2")
    public WebElement manMenu;

}
