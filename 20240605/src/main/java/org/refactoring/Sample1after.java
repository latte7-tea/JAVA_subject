package main.java.org.refactoring;

import java.util.List;

public class Sample1after {
    public static void main(String[]args){
        List<Integer> list1=List.of(3,2,1);
        List <Integer>list2=List.of(3,2,11);
        List<Integer>list3=List.of(3,21,11);
        List<Integer>Listsum=List.of(addList(list1),addList(list2),addList(list3));
        System.out.println(Listsum);
    }
    public static int addList(List<Integer>list){
       int sum=0;
        for(Integer e:list){
            sum+=e;
        }
        return sum;
    }
}
