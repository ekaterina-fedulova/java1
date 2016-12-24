package ru.stqa.pft.addressbook.appmanager;
// 10 задание

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void Return() {

    wd.findElement(By.id("content")).click();
    wd.findElement(By.linkText("home")).click();
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    wd.findElement(By.name("home")).click();
    type(By.name("mobile"), contactData.getPhone());
    type(By.name("email"), contactData.getMail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();

  }

  public void deleteSelectedContact() {
    wd.findElement(By.xpath("//div[@id='content']//form[2]//div[2]/input")).click();
    wd.switchTo().alert().accept(); // для закрытия диалогового окна
    wd.findElement(By.linkText("home")).click();
  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void gotoHomePage() {
    wd.findElement(By.linkText("home")).click();  // потому что контакты отображаются на home
  }

  public void initContactModification() {  // добавлен тест для модификации контакта
    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

  public void submitContactModification() {
    wd.findElement(By.name("update")).click();
  }

  public void createContact(ContactData contact) {
    fillContactForm(contact, true);
    Return();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("entry"));
      for (WebElement element : elements) {
        String firstName = element.getText();
        String lastName = element.getText();
        int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
        ContactData contact = new ContactData(id, firstName, lastName, null, null, null);
        contacts.add(contact);
      }
      return contacts;
  }
}
