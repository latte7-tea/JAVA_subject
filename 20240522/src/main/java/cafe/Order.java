package main.java.cafe;

import java.util.Date;
import java.util.List;

public class Order {
    public int tableNum;
    public int guestNum;
    public int orderId;
    List <Integer>menuIds;
    Date date;
    public Order(int orderId,List<Integer>menuIds,int tableNum,int guestNum,int date){
        this.orderId=orderId;
        this.menuIds=menuIds;
        this.tableNum=tableNum;
        this.guestNum=guestNum;
        this.date=new Date();
    }

    public int getTotalAmount(){
        int amount=0;
        for(int i=0;i<menuIds.size();i++){
            amount = amount + MenuManeger.getMenuById(menuIds.get(i)).price;
        }
        return amount;
    }
    @Override
    public String toString(){
        String str="";
        str+=this.orderId+"\n";
        str+=this.date+"\n";
        for(int i=0;i<this.menuIds.size();i++){
            str+=MenuManeger.getMenuById(this.menuIds.get(i));
        }
        str+=this.tableNum;
        str+=this.guestNum;
        str+=this.getTotalAmount();
        return str;
    }
}
