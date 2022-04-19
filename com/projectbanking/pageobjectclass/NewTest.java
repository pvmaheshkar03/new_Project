package com.projectbanking.pageobjectclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BMethod");
  }

  @AfterMethod
  public void afterMethod() { 
	  System.out.println("AMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Bclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Aclass");
  }

}
