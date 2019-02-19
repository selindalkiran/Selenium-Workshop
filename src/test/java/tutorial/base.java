package tutorial;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
    public WebDriver driver;
    public WebDriverWait wait;


    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                "\\src\\test\\java\\driver\\chromedriver.exe");


        //drive nesnesi oluşturur.
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);


    }
    @Test
    public void test1(){

        driver.get("https://www.apsiyon.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Apsiyon - Apartman Yönetim Programı, Site Yönetim Yazılımı", driver.getTitle());
        Assert.assertEquals("degerler esıt degıl","Apsiyon - Apartman Yönetim Programı, Site Yönetim Yazılımı123", driver.getTitle());

    }
    @After
    public void tearDown(){
        driver.close(); //Browser kapatır.
        driver.quit(); // Session kill eder. servis sonlandırır.
    }
}
