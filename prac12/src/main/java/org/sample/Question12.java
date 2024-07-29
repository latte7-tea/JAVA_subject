package main.java.org.sample;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Question12 {
    public static boolean isWeekDay(String yyyymmdd)throws ParseException {
        final Calendar calendar=getCalendarfor(yyyymmdd);
        final int MONDAY_CODE=2;
        final int FRIDAY_CODE=6;
        final int dayOfWeekCode=calendar.get(Calendar.DAY_OF_WEEK);
        if(MONDAY_CODE <= dayOfWeekCode && dayOfWeekCode <= FRIDAY_CODE ){
            return true;
        }
        else{
            return false;
        }
    }
}
