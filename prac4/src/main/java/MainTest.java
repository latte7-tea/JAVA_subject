package main.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void getPrime() {
        assertEquals(7,Main.getPrime(4));
        assertEquals(11,Main.getPrime(5));
        assertEquals(17,Main.getPrime(7));
        assertEquals(23,Main.getPrime(9));
    }

    @Test
    void addDay() {
    }

    @Test
    void testMain() {
    }

    @Test
    void testGetPrime() {
    }

    @Test
    void isPrime() {
    }

    @Test
    void testAddDay() {
    }
}