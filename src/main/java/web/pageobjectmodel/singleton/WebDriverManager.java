package web.pageobjectmodel.singleton;

import org.openqa.selenium.WebDriver;

public class WebDriverManager {

  private static volatile WebDriverManager instance;
  private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

}
