package ru.stqa.pft.sandbox;

public class DistancePoint {
  public static double distance(Point p1, Point p2) {

    double pX;
    double pY;

    pX = p1.x - p2.x;
    pY = p1.y - p2.y;
    return Math.sqrt(Math.pow(pX, 2) + Math.pow(pY, 2));

  }

  public static void main(String[] args) {

    Point p1 = new Point(8, 4);
    Point p2 = new Point(2, 3);

    // без метода
    System.out.println("Answer: (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") = " + distance(p1, p2));
    // с методом
    System.out.println("Answer: (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") = " + p1.distance(p2));

  }
}

