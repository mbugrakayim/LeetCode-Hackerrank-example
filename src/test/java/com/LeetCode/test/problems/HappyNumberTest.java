package com.LeetCode.test.problems;


import org.junit.Before;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static  org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class HappyNumberTest {

    private HappyNumber happyNumber = new HappyNumber();



    @Test
    public void testNumberIsHappy(){
        int number = 19;
        boolean result = happyNumber.isHappy(number);
        assertEquals(true,result);
    }

    @Test
    public void testNumberNotIsHappy(){
        int number = 20;
        boolean result = happyNumber.isHappy(number);
        assertEquals(false, result);
    }

}
