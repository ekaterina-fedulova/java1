package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() {

    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      final GroupData test1 = new GroupData("test1", null, null);
      app.getGroupHelper().createGroup(test1);
    }
    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().DeleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
