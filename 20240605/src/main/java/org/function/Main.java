package main.java.org.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main (String[]args){
        //1問目　関数型(Function)を使ってみよう
        Function<Integer,Integer> f= x->x%2;
        System.out.println("5divide"+f.apply(5));

        //2問目　文字列strを”こんにちはstrさん"に変換する関数greetを作ってみよう
        Function<String,String>greet=x->"こんにちは"+x+"さん";
        System.out.println(greet.apply("human"));

        //3問目 関数型(Predicateを使ってみよう)
        Predicate<String>validate=str->str.length()>10;
        System.out.println(validate.test("abcd"));
        System.out.println(validate.test("abcdefghijk"));

        //4問目　配列に含まれる10より大きい数だけ抽出してみよう
        Predicate<Integer> greaterThanTen=i->i>10;
        List<Integer> ls=List.of(1,2,10,11);
        System.out.println(ls.stream().filter(greaterThanTen).toList());

        //5問目　関数型(Predicate)を使って文字列の長さが10未満の要素だけを抽出してみよう
        List<String> stringList = List.of(
                "abcd","abcdefghijkl","opqrstuvwx"
        );
        List<String> lessThanTen = stringList.stream().filter(validate).toList();
        System.out.println(lessThanTen);

        //6問目　引数を2つ取り、1つの出力を返すBinaryOperatorを使ってみよう
        BinaryOperator<Integer> bo=(x, y)-> {
            return x + y * 2;
        };
        Integer result = bo.apply(3,2);
        System.out.println(result);

        //7問目　BinaryOperatorを使ってリストの和演算を表す変数を作ってみよう
        BinaryOperator<List<Integer>> add =(list1,list2)-> {
            List<Integer>list = new ArrayList<>();
            List<Integer>longl = new ArrayList<>();
            List<Integer>shortl = new ArrayList<>();
            if(list1.size()<list2.size()) {
                shortl=list1;
                longl=list2;
            }else {
                shortl=list2;
                longl=list1;
            }
            for(int i=0;i<shortl.size();i++) {
                list.add(shortl.get(i)+longl.get(i));
            }
            for(int i=shortl.size();i<longl.size();i++){
                list.add(longl.get(i));
            }
            return list;
        };
        List<Integer> result1=add.apply(List.of(1,2,3,5,7), List.of(3,5,9));
        System.out.println(result1);

        //8問目　sortを指定した文字列の長さの順序で行ってみよう
        List<String> strList = new ArrayList<>(List.of("aaa","bb","c"));
        Collections.sort(strList);
        System.out.println(strList);
        Comparator<String> c = (s1, s2) -> Integer.compare(s1.length(),s2.length());
        Collections.sort(strList,c);
        System.out.println(strList);

        //9問目　リストとFunctionを引数に取るメソッド「map」を作ってみよう
        List<Integer> l= List.of(1,3,5);
        Function<Integer,Integer> h= x -> x*x;
        
        List<Integer> result3 = Main.map(l,h);
        System.out.println(l);
        System.out.println(result3);
    }

    private static List<Integer> map(List<Integer> list, Function<Integer, Integer> f) {
        List<Integer> result = new ArrayList<>();
        for(Integer e:list){
            result.add(f.apply(e));
        }
        return result;
    }
}

