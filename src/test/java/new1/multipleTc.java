package new1;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class multipleTc {
  @Test(priority=0)
  public void login() {
	  Assert.assertEquals("aaa","aaa");
	  System.out.println("login");
	  
  }
  @Test(priority=1, dependsOnMethods= {"login"})
  public void search() {
	  Assert.assertEquals("333", "bbb");
	  System.out.println("search");
  }
  //@Test(priority=2, dependsOnMethods= {"login"})
  @Test(priority=2,dependsOnMethods= {"search"},alwaysRun=true)
  public void logout() {
	  Assert.assertEquals("111", "111");
	  System.out.println("logout");
  }
}
