package main.java.cafe;

public class Table {
    public int number;
    public boolean isUsing;
    int customerNum;
    private Table(int number){
        this.number=number;
        this.isUsing=false;
    }
}
