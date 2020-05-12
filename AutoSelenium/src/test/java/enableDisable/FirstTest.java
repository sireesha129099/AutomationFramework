package enableDisable;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test (enabled=false)
  public void test1() {
	  System.out.println("This is Test1 method");
  }
  @Test
  public void test2() {
	  System.out.println("This is Test2 method");
  }

  @Test (enabled=true)
  public void test3() {
	  System.out.println("This is Test3 method");
  }

}
