package main.java.cafe;
import java.text.ParseException;
import java.util.List;

public class questioncafe {
    public class Table{
        private static int tableNum;
        private int useTable;
        private int guestNum;
        public Table(int tableNum){
            this.tableNum=tableNum;
            this.useTable= useTable;
        }
    }
    public class Menu{
        private String menuname;
        private int price;
        public Menu(int price,String menuname){
            this.price=price;
            this.menuname=menuname;
        }
    }
    public class Order{
        List<Integer> menuList;
        private static int tablenum;
        private int customer;
        private String menuname;
        private int price;

        public Order(int tablenum,String menuname,int customer){
            this.tablenum=tablenum;
            this.menuname=menuname;
            this.customer=customer;
        }

    }
}
