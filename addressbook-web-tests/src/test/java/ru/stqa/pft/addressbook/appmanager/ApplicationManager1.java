package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager1 {
  FirefoxDriver wd;

  private SessionHelper2 sessionHelper2;
  private NavigationHelper1 navigationHelper1;
  private ContactHelper contactHelper;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/index.php");
    contactHelper = new ContactHelper(wd);
    navigationHelper1 = new NavigationHelper1(wd);
    sessionHelper2 = new SessionHelper2(wd);
    sessionHelper2.login("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper1 getNavigationHelper1() {
    return navigationHelper1;
  }
}
