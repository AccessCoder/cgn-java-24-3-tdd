package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz_shouldReturnFizz_whenCalledWith3(){
        //GIVEN
        String expected = "Fizz";
        //WHEN
        String actual = Main.playFizzBuzz(3);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturnFizz_whenCalledWith6(){
        //GIVEN
        String expected = "Fizz";
        //WHEN
        String actual = Main.playFizzBuzz(6);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturnBuzz_whenCalledWith5(){
        //GIVEN
        String expected = "Buzz";
        //WHEN
        String actual = Main.playFizzBuzz(5);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturnBuzz_whenCalledWith10(){
        //GIVEN
        String expected = "Buzz";
        //WHEN
        String actual = Main.playFizzBuzz(10);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturnFizzBuzz_whenCalledWith15(){
        //GIVEN
        String expected = "FizzBuzz";
        //WHEN
        String actual = Main.playFizzBuzz(15);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturn4_whenCalledWith4(){
        //GIVEN
        String expected = "4";
        //WHEN
        String actual = Main.playFizzBuzz(4);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturnFizzBuzz_whenCalledWith0(){
        //GIVEN
        String expected = "FizzBuzz";
        //WHEN
        String actual = Main.playFizzBuzz(0);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void fizzbuzz_shouldReturnFizz_whenCalledWithMinus3(){
        //GIVEN
        String expected = "Fizz";
        //WHEN
        String actual = Main.playFizzBuzz(-3);
        //THEN
        assertEquals(expected, actual);
    }

}