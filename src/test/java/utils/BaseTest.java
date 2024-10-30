package utils;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

  WebDriver driver;
  protected Logger logger = LogManager.getLogger(BaseTest.class);

  @BeforeMethod
  public void setUp() {
    logger.info("Set up driver");
    System.setProperty("webdriver.chrome.driver",
        "/Users/tarasdachkevych/Work/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.get("http://google.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void tearDown() {
    logger.info("Quite driver");
    driver.quit();
  }
}
