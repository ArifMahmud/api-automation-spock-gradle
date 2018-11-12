package Test;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;
 
public class cocoin {
	
public static void main(String[] args) throws InterruptedException {
	
		AppiumDriver<MobileElement> driver = null;
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		
		caps.setCapability("udid", "R7L4C15C17000529"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "4.4.2");
		caps.setCapability("appPackage", "com.nightonke.cocoin");
		caps.setCapability("appActivity", "com.nightonke.saver.activity.MainAcivity");
		caps.setCapability("appActivity", "com.nightonke.saver.activity.SplashActivity");
		
		//Instantiate Appium Driver
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		TimeUnit.SECONDS.sleep(5);
		
		Dimension dimensions = driver.manage().window().getSize();
		
		for(int i=1; i<5; i++)
		{
			Double screenHeightStart = dimensions.getWidth() * 0.9;

			int scrollStart = screenHeightStart.intValue();

			Double screenHeightEnd = dimensions.getWidth() * 0.1;

			int scrollEnd = screenHeightEnd.intValue();

			driver.swipe(scrollStart, 200, scrollEnd, 200, 2000);
		
			TimeUnit.SECONDS.sleep(1);
			
		}
		
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
		TimeUnit.SECONDS.sleep(1);
		
		
		String text = driver.findElement(By.xpath("//android.widget.TextView")).getText();
		if(text.equals("Breakfast")){
		
			}
		
		driver.findElement(By.id("com.nightonke.cocoin:id/icon")).click();
		TimeUnit.SECONDS.sleep(1);
		
		((AndroidDriver<MobileElement>) driver).pressKeyCode(66);
	}
}
