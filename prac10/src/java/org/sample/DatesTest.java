package java.org.sample;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatesTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void getDaysBetweenDates() throws ParseException {

        Date date1_1 = GetDate.validateAndParseDate("2023/03/04");
        Date date1_2 = GetDate.validateAndParseDate("2023/03/06");
        assertEquals(2,GetDate.getDaysBetweenDates(date1_1,date1_2));
        Date date2_1 = GetDate.validateAndParseDate("2023/03/30");
        Date date2_2 = GetDate.validateAndParseDate("2023/04/01");
        assertEquals(2,GetDate.getDaysBetweenDates(date2_1,date2_2));
    }
}