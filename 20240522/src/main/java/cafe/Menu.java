package main.java.cafe;

public class Menu {
    public int id;
    public int price;
    public String name;
    Category category;
    public Menu(int id,int price,String name,Category category){
        this.id=id;
        this.price=price;
        this.name=name;
        this.category=category;
    }
}
