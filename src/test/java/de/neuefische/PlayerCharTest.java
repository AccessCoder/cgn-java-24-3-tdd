package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharTest {

    @Test
    void getX_shouldReturn0_whenCalledInitially(){
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerChar.getX();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_shouldReturn0_whenCalledInitially(){
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerChar.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_(){
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerChar.getY();
        //THEN
        assertEquals(expected, actual);
    }

}