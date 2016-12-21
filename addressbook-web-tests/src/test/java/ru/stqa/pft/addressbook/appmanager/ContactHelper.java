package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void Return() {
    wd.findElement(By.id("content")).click();
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    wd.findElement(By.name("home")).click();
    type(By.name("mobile"), contactData.getPhone());
    type(By.name("email"), contactData.getMail());
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void deleteSelectedContact() {
    wd.findElement(By.xpath("//div[@id='content']//form[2]//div[2]/input")).click();
    wd.switchTo().alert().accept(); // для закрытия диалогового окна
  }

  public void selectContact() {
    wd.findElement(By.name("selected[]")).click();
  }

  public void gotoHomePage() {
    wd.findElement(By.linkText("home")).click();  // потому что контакты отображаются на home
  }

  public void initContactModification() {  // добавлен тест длямодификации контакта
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

  public void submitContactModification() {
    wd.findElement(By.name("update")).click();
  }
}
