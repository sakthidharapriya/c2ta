package com.Testng;

import org.testng.annotations.Test;

public class PriorityTestCase {
	@Test(priority=2)
	  public void Testcase1() {
		  System.out.println("Testcase1");
	  }
	  @Test(priority=3)
	  public void Testcase2() {
		  System.out.println("Testcase2");
	  }
	  @Test(priority=1)
	  public void Testcase3() {
		  System.out.println("Testcase3");
	  }

}
