package document;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
	
   String message = "Hello World1";	
   MessageUtil messageUtil = new MessageUtil(message);
   

   @Test
   public void testPrintMessage() {
      assertEquals("abc1",messageUtil.printMessage());
   }
   
   @Test
   public void testPrintMessage2() {
      assertEquals("abc", messageUtil.printMessage());
   }
   

   
}