package appium.Virtual;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class ChromeTest {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","15");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage","com.android.chrome");
        capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");

        capabilities.setCapability("adbExecTimeout", 120000); // 120 seconds
        capabilities.setCapability("newCommandTimeout", 180); // 3 minutes

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
    @Test
    public void getStarted(){
        WebElement getStartedBtn=driver.findElement(By.id("com.android.chrome:id/signin_fre_continue_button"));
        getStartedBtn.click();
        WebElement syncBtn=driver.findElement(By.id("com.android.chrome:id/button_secondary"));
        syncBtn.click();
        WebElement gotItBtn=driver.findElement(By.id("com.android.chrome:id/ack_button"));
        gotItBtn.click();
    }
    @Test
    public void openChrome() throws InterruptedException {
        WebElement openAmazonBtn=driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Navigate: Amazon.com: www.flipkart.com\"]"));
        openAmazonBtn.click();

        WebElement searchBtn=driver.findElement(By.id("com.android.chrome:id/url_bar"));
        searchBtn.click();
        searchBtn.sendKeys("Do epic shit book");

        WebElement suggestionBtn=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"));
        suggestionBtn.click();

        WebElement shoppingBtn=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Shopping\"]"));
        shoppingBtn.click();
        WebElement clickOnBookBtn=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button"));
        clickOnBookBtn.click();

        WebElement chooseBookBtn=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Amazon.in Current price is ₹207. Do Epic Sh#t Journal: The Ultimate Guide to Overcoming Laziness, Boosting Productivity & Mastering Time Management – Inspired by Ankur Warikoo’s In stock online ₹40 delivery\"]"));
        chooseBookBtn.click();
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

