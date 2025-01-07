import org.testng.SkipException;
import org.testng.annotations.Test;
import utils.BaseTest;

public class MainTest extends BaseTest {

  @Test
  public void firstTest() {
    System.out.println("TEST DONE SUCCESS");

    throw new SkipException("SKIP test");
  }

}
