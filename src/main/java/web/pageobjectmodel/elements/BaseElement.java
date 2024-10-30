package web.pageobjectmodel.elements;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class BaseElement implements WebElement {

  protected final Logger logger = LogManager.getLogger(this.getClass().getSimpleName());

  @Override
  public void click() {
    this.click();
  }

  @Override
  public void submit() {
    this.submit();
  }

  @Override
  public void sendKeys(CharSequence... keysToSend) {
    this.sendKeys(keysToSend);
  }

  @Override
  public void clear() {
    this.clear();
  }

  @Override
  public String getTagName() {
    return null;
  }

  @Override
  public @Nullable String getDomProperty(String name) {
    return WebElement.super.getDomProperty(name);
  }

  @Override
  public @Nullable String getDomAttribute(String name) {
    return WebElement.super.getDomAttribute(name);
  }

  @Override
  public @Nullable String getAttribute(String name) {
    return null;
  }

  @Override
  public @Nullable String getAriaRole() {
    return WebElement.super.getAriaRole();
  }

  @Override
  public @Nullable String getAccessibleName() {
    return WebElement.super.getAccessibleName();
  }

  @Override
  public boolean isSelected() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }

  @Override
  public String getText() {
    return null;
  }

  @Override
  public List<WebElement> findElements(By by) {
    return null;
  }

  @Override
  public WebElement findElement(By by) {
    return null;
  }

  @Override
  public SearchContext getShadowRoot() {
    return WebElement.super.getShadowRoot();
  }

  @Override
  public boolean isDisplayed() {
    return false;
  }

  @Override
  public Point getLocation() {
    return null;
  }

  @Override
  public Dimension getSize() {
    return null;
  }

  @Override
  public Rectangle getRect() {
    return null;
  }

  @Override
  public String getCssValue(String propertyName) {
    return null;
  }

  @Override
  public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
    return null;
  }
}
