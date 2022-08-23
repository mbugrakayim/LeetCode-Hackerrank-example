package com.LeetCode.test.problems;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    /*
    Verilen Sayıyı basamaklarının karelerinin toplamı il değiştirip Sayı 1'e eşit olana kadar işlemi tekrarla.
    Bu işlemde Sayı 1 'e eşit olursa true Sayı 1'e eşit olmaz sonsuz bir döngüye neden olursa false;

     */

    public boolean isHappy(int number){
        int result  = 0;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int dummy = 0;
        for (int i = 0 ; result == 0 ; i++){
            if (sum == 1 && number == 0){
                result = 1;
            } else if (number == 0) {
                if (list.contains(sum)) {
                    result = 2;
                }else {
                    list.add(sum);
                    number = sum;
                    sum = 0;
                }
            }else{
                dummy = number % 10;
                number = number / 10;
                sum += dummy * dummy;
            }
        }
        return result == 1 ? true : false;
    }


}

