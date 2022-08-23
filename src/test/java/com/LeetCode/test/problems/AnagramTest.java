package com.LeetCode.test.problems;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnagramTest {

    private Anagram anagram = new Anagram();


    @Test
    public void anagramTest(){

        String a = "asddas" ;
        String b = "saddas" ;

        boolean c = anagram.anagram(a,b);

        Assert.assertEquals(true,c);

    }

    @Test
    public void testAnagram(){
        String a = "Mustafa";
        String b = "Bugra";

        boolean c = anagram.anagram(a,b);

        Assert.assertEquals(false , c);
    }

    @Test
    public void testSameLetterAnagram(){
        String a = "Aabb";
        String b=  "BbAA";

        boolean c = anagram.anagram(a,b);

        Assert.assertEquals(true , c);
    }



    @Test
    public void anagramTest2(){

        String a = "hello";
        String b = "olleh";

        boolean c= anagram.anagram2(a,b);

        Assert.assertEquals(true , c);

    }

    @Test
    public void testNotSameLengthAnagram2(){
        String a = "true";
        String b = "false";

        boolean c= anagram.anagram2(a,b);

        Assert.assertEquals(false , c);
    }

    @Test
    public void testSameLengthAnagram2(){
        String a = "Same";
        String b = "test";

        boolean c= anagram.anagram2(a,b);

        Assert.assertEquals(false , c);
    }

}
