package ru.stqa.pft.addressbook.tests;
// 10 задание


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    //заходим на страницу со списком контактов, считаем
    List<ContactData> before = app.getContactHelper().getContactList();
    ContactData contact = new ContactData("Katya", "Fedulova", "8952906", "ekaterina-fedulova@inbox.ru", "test1");
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().createContact(contact);
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}

