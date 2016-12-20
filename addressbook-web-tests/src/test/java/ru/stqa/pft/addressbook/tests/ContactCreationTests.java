package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase1 {

    @Test
    public void testContactCreation() {

        app.getNavigationHelper1().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Katya", "Fedulova", "8952906", "ekaterina-fedulova@inbox.ru"));
        app.getContactHelper().Return();
    }


}
