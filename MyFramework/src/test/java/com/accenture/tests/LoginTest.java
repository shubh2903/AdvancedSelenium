package com.accenture.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
  @Test
  public void LoginValid() {
	  String ER="Tested";
	  String AR="Tested";
	  Assert.assertEquals(AR, ER);
  }
  
  @Test
  public void LoginInvalid() {
  
	  String ER="Tested";
	  String AR="Tested";
	  Assert.assertEquals(AR, ER);
  }
}
