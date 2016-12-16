package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p = new Point(5,2,4,6);
    Assert.assertEquals(p.distance4(p), 3.605551275463989);
  }
}
