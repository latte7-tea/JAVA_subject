public class Main {
    public static void main(String[] args) {
        person p1=new person("服部",25);
        person per=new person("山本",19);
        System.out.println(p1.getNumber());
        System.out.println(p1.getName());
        System.out.println(per.getAge());
    }
}