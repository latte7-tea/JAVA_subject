package main.java;
import java.util.ArrayList;
import java.text.ParseException;
//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
import java.text.SimpleDateFormat;
//https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
import java.util.Calendar;
//https://docs.oracle.com/javase/jp/8/docs/api/java/util/Date.html
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String today = addDay("2023/11/11",59);
        System.out.println(today);
    }
    public static int getPrime(int nth){
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2;

        while (count < nth) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }
        return number-1;
    }
    public static boolean isPrime(int number) {
        if(number < 1) {
            throw new IllegalArgumentException("入力された数は正でなければなりません。");
        }
        //1は素数ではない
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            //もっと計算効率を上げられるが最もわかりやすい処理を書いておく。
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String addDay(String yyyymmdd, int addDay) {
        //yyyy/mm/ddの形式を読み取るためのもの
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //カレンダー型のインスタンスを取得(実行時の日付になる)
        Calendar calendar = Calendar.getInstance();
        try {
            //yyyy/mm/dd形式のStringをDate型に変換
            Date d = sdf.parse(yyyymmdd);
            //Date型をCalendar型に変換
            calendar.setTime(d);
            //指定分の日数を加算
            calendar.add(Calendar.DAY_OF_MONTH, addDay);
        } catch (ParseException e) {
            //例外処理 (出力するように)
            e.printStackTrace();
        }
        //yyyy/mm/dd形式のString型でreturn
        return sdf.format(calendar.getTime());
    }

}
