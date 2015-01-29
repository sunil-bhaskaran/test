package document;
import com.thoughtworks.selenium.*;
import org.junit.Test;

public class Seleniumtest extends SeleneseTestCase
{
	public void setUp() throws Exception
	{
		setUp("http://www.google.com/", "*iexplore");

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testNew() throws Exception {
		selenium.open("/");
        selenium.type("q", "selenium rc");
        selenium.click("btnG");
        //selenium.waitForPageToLoad("300");
        verifyTrue(selenium.isTextPresent("Selenium Remote-Control"));
        // These are the real test steps
  }

}