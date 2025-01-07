package web.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage {


  @FindBy(css = "dasd")
  private WebElement element;

  public void clickElement(){
    element.click();
  }
}
