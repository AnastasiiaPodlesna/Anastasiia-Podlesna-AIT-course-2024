package homework.primeNumber;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest
{
    @Test
    void testIsPrimeNumber()
    {
        assertFalse(PrimeNumber.isPrimeNumber(0), "0 is not prime number");
        assertFalse(PrimeNumber.isPrimeNumber(1), "1 is not prime number");
        assertTrue(PrimeNumber.isPrimeNumber(2), "2 is prime number");
        assertTrue(PrimeNumber.isPrimeNumber(3), "3 is prime number");
        assertFalse(PrimeNumber.isPrimeNumber(4), "4 is not prime number");
        assertTrue(PrimeNumber.isPrimeNumber(5), "5 is prime number");
        assertFalse(PrimeNumber.isPrimeNumber(-3), "Negative numbers is not prime numbers");
    }
}