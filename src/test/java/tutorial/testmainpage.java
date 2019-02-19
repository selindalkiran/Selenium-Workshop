package tutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tutorial.webElement.ApsiyonHomePage;
import tutorial.webElement.SahibindenHomePage;
import tutorial.webElement.TrendyolMainPage;
import tutorial.webElement.practisePage;

import javax.swing.*;

public class testmainpage extends base
{

    practisePage practisePage;
    TrendyolMainPage trendyolMainPage;
    ApsiyonHomePage apsiyonHomePage;
    SahibindenHomePage sahibindenHomePage;


    @Before
    public void setup(){
        practisePage= new practisePage(driver);
        trendyolMainPage = new TrendyolMainPage(driver);
        apsiyonHomePage = new ApsiyonHomePage(driver);
        sahibindenHomePage = new SahibindenHomePage(driver);
    }

    @Test
    public void testmainpageApsiyon() throws InterruptedException{
        //1.action: navigate to url
       // driver.get("https://www.apsiyon.com/");

        //2.action: güncel url alır
        //String currentUrl = driver.getCurrentUrl();

        //System.out.println(currentUrl);

        //3.action DOM element click
        //WebElement featureMenu = driver.findElement(By.cssSelector(".main-navigation [href='/ozellikler']"));
        //featureMenu.click();

       /*
        //4.action: selectbox element seçme
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        new Select(driver.findElement(By.id("carselect"))).selectByIndex(1);
        new Select(driver.findElement(By.id("carselect"))).selectByValue("honda");
        new Select(driver.findElement(By.id("carselect"))).selectByVisibleText("Honda");
         */

       /*
        //5.action : SendKeys
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.id("name")).sendKeys("selenium tutorial");
        Thread.sleep(10000);
        */

       /*
       //6.action : isDisplayed
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        Boolean elementIsVisible = driver.findElement(By.id("opentab")).isDisplayed();
        System.out.println(elementIsVisible);
        */

       /*
       //7.action: clear
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.id("name")).sendKeys("Selenium Tutorial");
        Thread.sleep(3);
        driver.findElement(By.id("name")).clear();
        Thread.sleep(3);
        */

       //8.action : get attribute
        driver.navigate().to("https://learn.letskodeit.com/p/practice");

        practisePage.hideTextbox.click();
        String displayedTextGetStyle = practisePage.displayedText.getAttribute( "style");
        System.out.println(displayedTextGetStyle);
        Assert.assertEquals("displayed: none", displayedTextGetStyle);


       // practisePage.nameInput.getAttribute("");



    }

    public void executeScript (String js) {
        ((JavascriptExecutor) driver).executeScript(js);
    }
    @Test
    public void testExecuteScript() {
        driver.navigate().to("https://learn.letskodeit.com/p/practice");
        executeScript("window.open('https://learn.letskodeit.com/p/practice')");
    }
    @Test
    public void testMouseOver() throws InterruptedException {

        driver.navigate().to("https://www.trendyol.com");
        trendyolMainPage.announcementCloseButton.click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(trendyolMainPage.manMenu).perform();
        Thread.sleep(2000);

    }
    @Test
    public void testWaitElementClickable(){

        driver.navigate().to("https://www.apsiyon.com/");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(apsiyonHomePage.logo));
        apsiyonHomePage.logo.click();
    }

    @Test
    public void testWaitElementVisible(){
        driver.navigate().to("https://www.apsiyon.com/");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(apsiyonHomePage.logo));
        apsiyonHomePage.logo.click();
    }
    @Test
    public void KeysEnter() {
        driver.navigate().to("https://www.sahibinden.com/");
        sahibindenHomePage.searchBox.sendKeys( "Araba");
        sahibindenHomePage.searchBox.sendKeys(Keys.ENTER);

    }

    @Test
    public void scrollBottom(){
        driver.navigate().to("https://www.sahibinden.com/");
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");

    }
}
