package main.java.org.inter;
import java.awt.*;
public class Triangle extends Shape implements Drawable,Mesurable,Movable{
    Point p1;
    Point p2;
    Point p3;
    Triangle(Point p1,Point p2,Point p3){
        this.size=1;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public void draw(){
        System.out.println("三角を描きました");

    }
    //面積
    public int getArea(){
        //return ((this.p2.x - this.p1.x) * (this.p3.y - this.p1.y) - (this.p2.y - this.p1.y) * (this.p3.x - this.p1.x)) / 2;
            double ab=(this.p1.distance(this.p2));
            double bc=(this.p2.distance(this.p3));
            double ac=(this.p3.distance(this.p1));
            double s = (ab+bc+ac)/2;
            double area = Math.sqrt(s*(s-ab)*(s-bc)*(s-ac));
            return (int)area;
        }

    //周りの長さ
    public int getPerimeter(){
        double ab=(this.p1.distance(this.p2));
        double bc=(this.p2.distance(this.p3));
        double ac=(this.p3.distance(this.p1));

        double s = (ab+bc+ac);
        return (int)s;
        //return (int)(this.p1.distance(this.p2) + this.p2.distance(this.p3) + this.p3.distance(this.p1));
    }
    public void parallelMove(){
        System.out.println("平行移動しました");
    }
    public void rotate(){
        System.out.println("回転しました");
    }
}
