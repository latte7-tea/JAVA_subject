package main.java.org.fruit;

import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        Fruits apple=new Apple(100,"Japan","赤");
        System.out.println(apple.price);
        System.out.println(apple.madeIn);
        System.out.println(apple.isMadeInJapan());
        System.out.println(apple.getDetail());
        Fruits f=new Fruits(100,"Canada","赤");
        System.out.println(f);
        System.out.println(apple);

        Pair<String> p=new  Pair<>("test1","test2");
        System.out.println(p);

        Pair2<String, Integer>p2=new Pair2<>("test1",100);
        System.out.println(p2);

        Pair<String> pair1=new Pair<>("test1","test2");
        Pair<String> pair2=new Pair<>("test3","test4");
        Pair<Pair<String>>pairPair=new Pair<>(pair1,pair2);
        Quadruple q=Quadruple.getQuadrupleBy(pairPair);
        System.out.println(q);
        Fruits f1= new Fruits(199,"japan","赤");
        Fruits f2 = new Fruits(199,"japan","赤");
        Apple ap1 = new Apple(199,"japan","赤");
        Apple ap2 = new Apple(199,"japan","赤");
        System.out.println(f1.equals(f2));
        HashSet<Fruits>hf1 = new HashSet<>();
        hf1.add(f1);
        HashSet<Fruits>hf2 = new HashSet<>();
        hf2.add(f2);
        System.out.println(hf1.equals(hf2));
        System.out.println(ap1.getClass());
        FruitsPair<Fruits> fruitr = new FruitsPair<>(f1,f2);
        FruitsPair<Apple> appair = new FruitsPair<>(ap1,ap2);

    }
}
