import org.testng.SkipException;
import org.testng.annotations.Test;

public class MainTest {

//  @DataProvider(name = "testProvider")
//  public Object[][] testProvider() {
//    return new Object[][]{{"Test 1"}, {"Test 2"}};
//
//  }

  @Test
  public void firstTest() {
    System.out.println(" TEST DONE SUCCESS");

    throw new SkipException("SKIP test");
  }

}
