package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test // проверка, что в p1.distance(p2) рассчитано то число, которое задано (6.082762530298219)
  public void distance() {
    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);
    assert p1.distance(p2) == 6.082762530298219;
  }

  @Test
  public void distance2() { // проверка как выше, но с использованием assertEquals
    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.distance(p2), 6.082762530298219);
  }

  @Test
  public void distance3() { // проверка, правильно ли задана координата x в первой точке (p1), с использованием assertEquals
    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.x, 8.0);
  }

  @Test
  public void distance4() { // проверка, правильно ли задана координата y в первой точке (p1), с использованием assertEquals
    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p1.y, 4.0);
  }

  @Test
  public void distance5() { // проверка, правильно ли задана координата x во второй точке (p2), с использованием assertEquals
    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p2.x, 2.0);
  }

  @Test
  public void distance6() { // проверка, правильно ли задана координата y во второй точке (p2), с использованием assertEquals
    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);
    Assert.assertEquals(p2.y, 3.0);
  }


}

