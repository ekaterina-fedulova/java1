package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper2 extends HelperBase1{

  public SessionHelper2(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"), password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

}
