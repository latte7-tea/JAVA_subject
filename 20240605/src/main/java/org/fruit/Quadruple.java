package main.java.org.fruit;

public class Quadruple<T> {
    private T first;
    private T second;
    private T third;
    private T fourth;
    Quadruple(T first,T second,T third,T fourth){
        this.first=first;
        this.second=second;
        this.third=third;
        this.fourth=fourth;
    }
    public static <T>Quadruple<T>getQuadrupleBy(Pair<Pair<T>>pairPair){
        return new Quadruple<T>(
        pairPair.first.first,pairPair.first.second,pairPair.second.first,pairPair.second.second);
    }
    @Override
    public String toString(){
        return "("+this.first+","+this.second+","+this.third+","+this.fourth+")";
    }

}
