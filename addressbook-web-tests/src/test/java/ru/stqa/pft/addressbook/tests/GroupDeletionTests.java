package ru.stqa.pft.addressbook.tests;
// 10 задание
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() {
    // заходим на страницу групп
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      final GroupData test1 = new GroupData("test1", null, null);
      app.getGroupHelper().createGroup(test1);
    }
    // считаем
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().SelectGroup(before.size() - 1);
    app.getGroupHelper().DeleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);
    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);
    }

}
