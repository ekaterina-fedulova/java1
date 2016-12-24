package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
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
        GroupData group = new GroupData("test1", null, null);
        app.getGroupHelper().createGroup(group);
        //считаем ПОСЛЕ создания
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size()+ 1);

        int max = 0;
        for (GroupData g : after){
            if (g.getId() > max) {
                max = g.getId();
            }
        }
        group.setId(max);
        before.add (group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
