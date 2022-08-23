package com.LeetCode.test.problems;

import java.util.*;


public class Anagram {


    public boolean anagram(String a, String b){
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        int lengthA = a.length() -1;
        int lengthB = b.length() -1;
        for (int i = 0 ; i <= lengthA ; i++){
            int count = 0;
            String iChar= String.valueOf(a.charAt(i)).toLowerCase();
            for (int j = 0 ; j <=lengthA ; j++){
                String jChar= String.valueOf(a.charAt(j)).toLowerCase();
                if(iChar.equals(jChar) ){
                    count++;
                }
            }
            if (i == 0 && iChar.equals(String.valueOf(a.charAt(i+1)).toLowerCase()) ){
                String c = iChar + " " + count;
                listA.add(c);
            }
            if (i == 0 && !iChar.equals(String.valueOf(a.charAt(i+1)).toLowerCase())){
                String c = iChar + " " + count;
                listA.add(c);
            }
            if (i != 0 && !String.valueOf(a.charAt(i - 1)).toLowerCase().equals(iChar)){
                String c = iChar + " " + count;
                listA.add(c);
            }

        }
        for (int l = 0 ; l <= lengthB ; l++){
            int count = 0;
            String lChar = String.valueOf(b.charAt(l)).toLowerCase();
            for (int k = 0 ; k <=lengthB ; k++){
                if(lChar.equals(String.valueOf(b.charAt(k)).toLowerCase()) ){
                    count++;
                }
            }
            if (l == 0 && lChar.equals(String.valueOf(b.charAt(l+1)).toLowerCase()) ){
                String c =lChar + " " + count;
                listB.add(c);
            }
            if (l == 0 && !lChar.equals(String.valueOf(b.charAt(l+1)).toLowerCase())){
                String c = lChar + " " + count;
                listB.add(c);
            }
            if (l != 0 && !String.valueOf(b.charAt(l - 1)).toLowerCase().equals(lChar)){
                String c = lChar + " " + count;
                listB.add(c);
            }
        }
        boolean result = false;
        for (String temp :
                listA  ) {

            for (String str :
                    listB) {
                if (temp.equals(str)){
                    result = true;
                    break;
                }else{
                    result = false;
                }
            }

        }
        return result;

    }

    public boolean anagram2(String a, String b){
        int lengthA = a.length() -1 ;
        int lengthB = b.length() -1 ;
        char [] A = a.toLowerCase().toCharArray();
        char [] B = b.toLowerCase().toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        if(lengthA != lengthB) return false;
        if(Arrays.equals(A,B)) return true;
        else return false;


    }


}
