package main.java.org.sample;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class Question12Test {

    @Test
    void isWeekDay()throws ParseException {
        assertEquals(false,Question12.isWeekDay("2023/05/14"));
        assertEquals(true,Question12.isWeekDay("2023/05/15"));
        assertEquals(true,Question12.isWeekDay("2023/05/16"));
        assertEquals(true,Question12.isWeekDay("2023/05/17"));
        assertEquals(true,Question12.isWeekDay("2023/05/18"));
        assertEquals(true,Question12.isWeekDay("2023/05/19"));
        assertEquals(false,Question12.isWeekDay("2023/05/20"));
        assertEquals(false,Question12.isWeekDay("2023/05/21"));
        assertEquals(true,Question12.isWeekDay("2023/05/22"));
        assertEquals(true,Question12.isWeekDay("2023/05/23"));
        assertEquals(false,Question12.isWeekDay("2023/05/27"));
        assertEquals(false,Question12.isWeekDay("2023/05/28"));
    }
}