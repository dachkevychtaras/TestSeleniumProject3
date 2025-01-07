package utils;

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

  FirefoxOptions firefoxOptions;
  ChromeOptions chromeOptions;
  SafariOptions safariOptions;

  AndroidDriver driver;
  protected Logger logger = LogManager.getLogger(BaseTest.class);

//  @BeforeMethod
//  public void setUp() {
//    logger.info("Set up driver");
//    driver = new ChromeDriver();
//    driver.get("http://google.com");
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//  }

  @BeforeMethod
  public void setUpAppium() {
    System.out.println("App launched");

    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability(CapabilityType.PLATFORM_NAME, "iOS");
    capabilities.setCapability("appium:platformVersion", "18");
//    capabilities.setCapability("appium:deviceName", "iPhone 12");
    capabilities.setCapability("appium:udid", "00008101-00017D9E2689001E");
    capabilities.setCapability("appium:app",
        "/Users/tarasdachkevych/Work/app/old/Aircall.ipa");
    capabilities.setCapability("appium:automationName", "XCUITest");
    try {
      driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
    } catch (Exception e) {
      System.out.println("--0-0-0-0-0-0-0-");
      System.out.println(e.getMessage());
      System.out.println("--0-0-0-0-0-0-0-");
      e.printStackTrace();
    }

    System.out.println("App launched");

  }

  @AfterMethod
  public void tearDown() {
    logger.info("Quite driver");
    driver.quit();
  }
}
