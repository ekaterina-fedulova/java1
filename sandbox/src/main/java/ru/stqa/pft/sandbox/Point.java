package ru.stqa.pft.sandbox;

public class Point {

  public double x1;
  public double y1;
  public double x2;
  public double y2;

  public Point (double x1, double x2, double y1, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }


  public double distance1(Point p) {
    return (p.x2 - p.x1) * (p.x2 - p.x1);
  }

  public double distance2(Point p) {
    return (p.y2 - p.y1) * (p.y2 - p.y1);
  }

  public double distance3(Point p) {
    return this.distance1(p) + this.distance2(p);
  }

  public double distance4(Point p) {
    return Math.sqrt(distance3(p));
  }

}
