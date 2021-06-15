package smrl.mr.test;

import smrl.mr.language.Operations;

import smrl.mr.language.MR;

@SuppressWarnings("all")
public class TEST_INVALID_COOKIE_TAG extends MR{
  public boolean mr() {
    System.out.println(Operations.InvalidCookieTags());
    return true;
  }
}
