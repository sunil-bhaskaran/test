package document;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(JunitTestSuite.class);
     
      FileCreation obj=new FileCreation();
      
      for (Failure failure : result.getFailures()) {
    	  
    	 obj.addText(failure.toString()); 
         System.out.println();
      }
      obj.endText();     
      System.out.println(result.wasSuccessful());
   }
} 