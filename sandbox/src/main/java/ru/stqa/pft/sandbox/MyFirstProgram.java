package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point1 p1 = new Point1(5,2);
    Point2 p2 = new Point2(4,6);

    System.out.println("answer =  " + distance4(p1, p2));

  }

  public static double distance1(Point1 p1, Point2 p2) {
    return (p2.x2 - p1.x1) * (p2.x2 - p1.x1);
  }

  public static double distance2(Point1 p1, Point2 p2) {
    return (p2.y2 - p1.y1) * (p2.y2 - p1.y1);
  }

  public static double distance3(Point1 p1, Point2 p2) {
    return distance1(p1, p2) + distance2(p1, p2);
  }

  public static double distance4(Point1 p1, Point2 p2) {
    return Math.sqrt(distance3(p1, p2));
  }

}