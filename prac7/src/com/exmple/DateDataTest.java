package com.exmple;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateDataTest {
    DateData dd;
    DateDataTest() {
        dd = new DateData();
    }
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void setDateData() {
        dd.setDateData(null);
        assertNull(dd.getDateData());
    }

    @org.junit.jupiter.api.Test
    void getDateData() {
        dd.setDateData("20200916");
        assertEquals("20200916", dd.getDateData());
    }

    @org.junit.jupiter.api.Test
    void getToday() {
        Calendar cal = Calendar.getInstance();
        String toDay = String.format("%02d", cal.get(Calendar.YEAR)) +
                String.format("%02d", cal.get(Calendar.MONTH)  ) +
                String.format("%02d", cal.get(Calendar.DAY_OF_MONTH));

        assertEquals(toDay, dd.getToday());
    }

    @org.junit.jupiter.api.Test
    void isToday() {
        assertEquals(true, dd.isToday(dd.getToday()));
    }

    @org.junit.jupiter.api.Test
    void isLeapYear() {
        assertEquals(true, dd.isLeapYear("20200916"));
        assertEquals(false, dd.isLeapYear("20210916"));
        assertEquals(true, dd.isLeapYear("20000916"));

        assertEquals(true, dd.isLeapYear(2020));
        assertEquals(false, dd.isLeapYear(2021));
        assertEquals(true, dd.isLeapYear(20000));
    }

    @Test
    void getDaysBetweenDates() throws ParseException {
        Date date1_1 = dd.getDateData("20230304");
        Date date1_2 = dd.getDateData("20230306");
        assertEquals(2,dd.getDaysBetweenDates(date1_1,date1_2));
        Date date2_1 = dd.getDateData("20230330");
        Date date2_2 = dd.getDateData("20230401");
        assertEquals(2,dd.getDaysBetweenDates(date2_1,date2_2));
    }
}