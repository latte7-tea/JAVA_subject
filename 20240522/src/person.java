import java.text.ParseException;

public class person {
    private static int number;
    private String name;
    private int age;
    public person(String name,int age){
        this.name=name;
        this.age=age;
        number++;
    }
    public static int getNumber(){
        return number;
    }
    public String getName(){
       return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
