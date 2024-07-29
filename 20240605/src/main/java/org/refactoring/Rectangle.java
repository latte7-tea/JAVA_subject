package main.java.org.refactoring;

import java.awt.*;

public class Rectangle{//問題5
private double height ;
    private double width;
    private double x;
    private double y;

    public Rectangle(double width,double height,double x,double y){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
    }
    public static void main (String[] args){
        Rectangle rectangle=new Rectangle(3,5,0,0);
        Point p=new Point(2,3);
        boolean isOverX=p.x>=rectangle.x;
        boolean isMinusX=p.x<=rectangle.x+rectangle.width;
        boolean isOverY=p.y>=rectangle.y;
        boolean isMinusY=p.y<=rectangle.y+rectangle.height;
        if(isOverX && isMinusX && isOverY && isMinusY){
            System.out.println("InSide");
        }
        else{
            System.out.println("OutSide");
        }
    }
}
class Point {
    public double x;
    public double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
}
