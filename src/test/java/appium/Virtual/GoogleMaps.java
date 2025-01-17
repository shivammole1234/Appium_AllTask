package appium.Virtual;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","14");
        capabilities.setCapability("deviceName", "Pixel 6a");
        capabilities.setCapability("appPackage","com.google.android.apps.maps");
        capabilities.setCapability("appActivity","com.google.android.maps.MapsActivity");
        capabilities.setCapability("udid","27251JEGR18511");

        capabilities.setCapability("adbExecTimeout", 120000); // 120 seconds
        capabilities.setCapability("newCommandTimeout", 180); // 3 minutes

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }
//    @Test
//    public void
}
