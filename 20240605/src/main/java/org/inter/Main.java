package main.java.org.inter;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static Triangle t3;
    public static Rectangle r1;
    public static void main(String[] args){

        Drawable h=new Hero();
        h.draw();
        Triangle t1=new Triangle(
                new Point(3,2),
                new Point(1,3),
                new Point(1,1));
            t1.draw();
            t1.parallelMove();
            t1.rotate();
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        Drawable t2 =new Triangle(new Point(3,2),new Point(1,3),new Point(1,1));
        Drawable h1=new Hero();
        List<Drawable> list=List.of(t2,h);
        for(Drawable e:list){
            e.draw();

        //GUI画面作成
        JFrame frame=new JFrame();
        frame.setVisible(true);
        Main.t3= new Triangle(
                new Point(100,30),
                new Point(150,100),
                new Point(50,100));

        Main.r1 = new Rectangle(
                new Point(100,230),
                new Point(50,260),
                new Point(50,300),
                new Point(200,300)
        );
        }
    }
}
class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Main.t3.draw();
        Main.r1.draw();
    }
}
