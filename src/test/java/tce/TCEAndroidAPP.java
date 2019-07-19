package tce;
/*
 * 
 * 
 * @Author Sapna Mishra
 * 
 * 
 */

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCEAndroidAPP {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "Lenovo TB-X304L");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", "/Users/sapnamishra/Documents/Appium/ApkFiles/tce_1.0_snapshot_debug.apk");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("autoGrantPermissions", "true");
		URL hostUrl = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new RemoteWebDriver(hostUrl, capabilities);
	}

	@Test(priority = 1, description = "Test case 1: Verify login'")
	public void LoginInvalid() {
		driver.findElement(By.id("com.app.tce:id/edt_sign_in_user_name")).sendKeys("sapna@mishra");

		driver.findElement(By.id("com.app.tce:id/edt_sign_in_password")).sendKeys("sapna@123");

		WebElement loginBtn = driver.findElement(By.id("com.app.tce:id/btn_sign_in"));
		loginBtn.click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
