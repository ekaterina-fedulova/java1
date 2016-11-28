package ru.stqa.pft.sandbox;

public class Zad2 {

    public static void main(String[] args) {

      Point11 p1 = new Point11(5,2);
      Point22 p2 = new Point22(4,6);

      System.out.println("answer =  " + distance4(p1, p2));

    }

    public static double distance1(Point11 p1, Point22 p2) {
      return (p2.x2 - p1.x1) * (p2.x2 - p1.x1);
    }

    public static double distance2(Point11 p1, Point22 p2) {
      return (p2.y2 - p1.y1) * (p2.y2 - p1.y1);
    }

    public static double distance3(Point11 p1, Point22 p2) {
      return distance1(p1, p2) + distance2(p1, p2);
    }

    public static double distance4(Point11 p1, Point22 p2) {
      return Math.sqrt(distance3(p1, p2));
    }

  }

