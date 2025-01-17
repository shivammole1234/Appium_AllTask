package appium.Google;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RealDevice {

    DesiredCapabilities caps = new DesiredCapabilities();

    AndroidDriver driver;

    @BeforeTest
    public void setUp()throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("deviceName", "Thomos's");
        caps.setCapability("udid", "HU75DYU4QKS475J7");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        System.out.println("Start automation...");



    }
    @Test
    public void Search() throws InterruptedException {
        WebElement gs = driver.findElement(By.xpath("//android.appwidget.AppWidgetHostView[@content-desc=\"Search\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]"));
        gs.click();
        Thread.sleep(3000);


                WebElement si = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText"));
        Thread.sleep(3000);
        si.sendKeys("Appium");

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));


    }


}
