package main.java.org.fruit;

public class Apple extends Fruits{
    String taste;
    Apple(int price,String madeIn,String color){
        super(price,madeIn,color);
        this.taste=taste;
    }
    @Override
    String getDetail(){
        return"これはリンゴで生産値は:"+this.madeIn+"色:"+this.color;
    }

}
