package selenium.Virtual;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DialPadTest {
    public AppiumDriver driver ;

    @Test
    public void DialNumber() throws MalformedURLException {

        DesiredCapabilities cap=new DesiredCapabilities();
        //emulator capabilities
        cap.setCapability("deviceName","my-device-01");
        cap.setCapability("uiid","emulator-5554 ");
        cap.setCapability("platformName","android");
        cap.setCapability("platformVersion","10");

        // applicatoin capailities
        cap.setCapability("appPackage","com.maccia.contacts.dialer");
        cap.setCapability("appActivity","com.maccia.contacts.dialer.activities.MainActivity");

        URL url= new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver(url,cap);
        System.out.println("app is started");
    }
}
