import junit.framework.*;

public class JUNITTest extends TestCase {
   protected String test1;
   
   // assigning the values
   protected void setUp(){
      test1 = "The bluebird is blue.";
   }


   // test method to add two values
   public void stringReplace(){
      String result = "The redbird is red.";
      assertTrue(result == test1);
   }
}

//javac JUNITTest.java TestRunner.java
// %CLASSPATH%;%JUNIT_HOME%/*;.;
// %CLASSPATH%;%JUNIT_HOME%\junit-4.13-beta-2.jar;%JUNIT_HOME%\hamcrest-core-2.1.jar;.;