package main.java.cafe;
import java.util.List;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) {
        Order order1=new Order(3,List.of(1,2,2,3),3,2,1);
        System.out.println(order1.toString());

    }
}
