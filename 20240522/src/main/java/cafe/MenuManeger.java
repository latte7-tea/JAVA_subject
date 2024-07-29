package main.java.cafe;
import java.util.*;
public abstract class MenuManeger {
    static List<Menu> allMenu=List.of(new Coffee(),new Cafe(),new Latte());
    public static Menu getMenuById(int id){
        for(int i=0;i<allMenu.size();i++){
            if(allMenu.get(i).id==id){
                return allMenu.get(i);
            }
        }
        throw new IllegalArgumentException("メニューなし");
    }
}
