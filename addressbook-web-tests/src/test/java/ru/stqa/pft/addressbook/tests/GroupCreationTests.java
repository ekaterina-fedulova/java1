package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreationTests() {
        app.getNavigationHelper().gotoGroupPage();
        //заходим на страницу групп (иначе будем считать количество контактов)
        // потому что страница входа браузера в ApplicationManager это wd.get.("http://localhost/addressbook/index.php")
        //затем считаем уже количество групп ДО
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        //считаем ПОСЛЕ создания
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()+ 1);
    }
}
