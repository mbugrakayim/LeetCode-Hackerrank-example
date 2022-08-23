package com.LeetCode.test.problems;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        Pascal pascal = new Pascal();
        pascal.generate(5);
    }

    public List<List<Integer>> generate(int numRows){

        List<List<Integer>> list2 = new ArrayList<>();

        for (int i = 0 ; i <= numRows; i++ ){
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0 ; j <=i ; j++){
                if (j == 0 || j == i){
                    list1.add(1);
                }else {
                    list1.add(list2.get(i - 1).get(j - 1) + list2.get(i - 1).get(j));
                }
            }

            list2.add(list1);
        }
        return list2;
    }
}
