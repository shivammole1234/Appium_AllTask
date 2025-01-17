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

public class Emulator {

    DesiredCapabilities caps = new DesiredCapabilities();

    public AndroidDriver driver;

    @BeforeTest
    public void setUp()throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "my-device-01");

        capabilities.setCapability("platformVersion", "10");

        capabilities.setCapability("platformName","Android");

        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        System.out.println("Start automation...");



    }

    @Test
    public void Search() throws InterruptedException {
        WebElement gs = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Search\"]"));
        gs.click();
        Thread.sleep(3000);


        WebElement si = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.EditText"));
        Thread.sleep(3000);
        si.sendKeys("selenium");

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));


    }
}
