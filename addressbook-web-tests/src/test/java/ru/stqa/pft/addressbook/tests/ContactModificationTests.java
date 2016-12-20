package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase1{

  @Test
  public void testContactModification() {
    app.getContactHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Katya", "Fedulova", "8952906", "ekaterina-fedulova@inbox.ru"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().Return();

  }

}
