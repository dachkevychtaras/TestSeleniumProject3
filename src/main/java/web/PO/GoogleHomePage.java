package web.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage {

//  List<WebElement> plants = dri.findElements(By.tagName("li"));


  @FindBy(css = "dasd")
  private WebElement element;

  public void clickElement(){
    element.click();
  }
}
