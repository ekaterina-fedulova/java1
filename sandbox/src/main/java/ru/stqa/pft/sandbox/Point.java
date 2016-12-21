package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p) {
    double pX;
    double pY;

    pX = this.x - p.x;
    pY = this.y - p.y;
    return Math.sqrt(Math.pow(pX, 2) + Math.pow(pY, 2));
  }
}

