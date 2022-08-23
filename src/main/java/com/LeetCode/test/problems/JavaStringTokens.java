package com.LeetCode.test.problems;


public class JavaStringTokens {

    /*
        Bir String ifade Verilir. Bu String ifadeyi [ !,?._'@\s] bu belirteçlere göre böleriz.
        Önce Bölünen ifadelerin sayısını Yazdırırız.
        Sonra İfadeleri Yazdırırız.

     */



    public String[] javaStringTokens(String s){

        if(s.trim().isEmpty()){
            String arrS[] = {"0"};
            return arrS;
        }else {
            String arrB[] = s.trim().split("[ !,?._'@\\s]+");
            return arrB;
        }
    }


}
