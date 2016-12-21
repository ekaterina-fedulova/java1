package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().gotoHomePage();

    if (! app.getContactHelper().isThereAContact() ) {
      app.getContactHelper().createContact(new ContactData("Katya", "Fedulova", "8952906", "ekaterina-fedulova@inbox.ru", "test1"));
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();

  }

}
