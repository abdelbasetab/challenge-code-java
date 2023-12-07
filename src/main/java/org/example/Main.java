package org.example;

public class Main {


    public static String longestCommonPrefix(String[] strs) {
        int longst_string = 0;
        int m = 0;
        int d = 0;
        for (int i = 1; i < strs.length; i++) {

            m = 0;
            while(( m < strs[0].length() && (m < strs[i].length())) && strs[0].charAt(m) == strs[i].charAt(m) ){

                if (longst_string <= m && longst_string != 0){
                    break;
                }
                m++;
            }
            d = m;// holder for m
            if (longst_string > d  || longst_string == 0){
                longst_string =d;
            }


        }
        return strs[0].substring(0,longst_string);
    }



    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"} ;
        String[] strs1 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));

    }
}