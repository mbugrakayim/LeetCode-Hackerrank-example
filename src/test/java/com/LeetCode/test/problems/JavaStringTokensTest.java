package com.LeetCode.test.problems;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JavaStringTokensTest {


    private JavaStringTokens javaStringTokens = new JavaStringTokens();


    @Test
    public void testJavaStringTokens(){
        String s = "Bu , bir. test! amac'li yazilmis@ method mu?";

        String []result = javaStringTokens.javaStringTokens(s);
        String[] arr = new String[]{"Bu" , "bir" , "test", "amac" ,"li" , "yazilmis" ,"method" , "mu"};


        assertArrayEquals(arr , result);

    }

    @Test
    public  void testJavaStringToken(){

        String s = "            ";

        String result[] = javaStringTokens.javaStringTokens(s);

        String []arr = new String[]{"0"};
        assertArrayEquals(arr ,result);
    }




}
