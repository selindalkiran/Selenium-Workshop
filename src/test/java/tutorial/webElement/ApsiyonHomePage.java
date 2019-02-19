package tutorial.webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApsiyonHomePage {
    public ApsiyonHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#intercom-container .intercom-launcher")
    public WebElement intercomLauncher;

    @FindBy(name = "intercom-launcher-frame")
    public WebElement mainPageIFrame;

    @FindBy(name = "intercom-frame")
    public WebElement intercomFrame;

    @FindBy(id = "ApsiyonLogo")
    public WebElement logo;
}
