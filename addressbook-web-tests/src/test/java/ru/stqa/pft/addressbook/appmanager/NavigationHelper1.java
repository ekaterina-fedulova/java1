package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper1 {

  private FirefoxDriver wd;

  protected ContactHelper contactHelper;

  public NavigationHelper1(FirefoxDriver wd) {
    this.wd = wd;

  }

  public void gotoContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
