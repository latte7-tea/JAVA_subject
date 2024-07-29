package main.java.org.fruit;

import java.util.Objects;

public class Fruits extends Food{
    //int price;
    //String madeIn;
    String color;
    Fruits(int price,String madeIn,String color){
        this.price=price;
        this.madeIn=madeIn;
        this.color=color;
    }
    boolean isMadeInJapan(){
        if(this.madeIn.equals("Japan")){
            return true;
        }
        else{
            return false;
        }
    }
    String getDetail(){
        return "生産地"+this.madeIn+"色"+this.color;
    }
    @Override
    public String toString(){
        return"果物の値段は"+this.price+"円です。";
    }
    @Override
    public boolean equals(Object o){
        if(this.getClass() != o.getClass()){
            return false;
        }else{
            Fruits f = (Fruits) o;
            if(this.color.equals(f.color)&&
            this.madeIn.equals(f.madeIn)&&
            this.price==(f.price)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(price,color,madeIn);
    }
}

