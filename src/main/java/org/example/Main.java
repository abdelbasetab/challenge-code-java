package org.example;

import java.util.Stack;

public class Main {


  
    public static boolean isValid(String s) {


        int i = 0;
        Stack<Character> stack = new Stack<>();//FIFO algorithme
       for (char c : s.toCharArray()){

           if(c == '(' || c == '[' || c == '{'){
               stack.push(c);
           } else if (c == ')' && !stack.empty() && stack.peek()=='(') {
               stack.pop();//delete the last character on the stack
           }else if (c == ']' && !stack.empty() && stack.peek()=='[') {
               stack.pop();
           }else if (c == '}' && !stack.empty() && stack.peek()=='{') {
               stack.pop();
           }else
               return  false;
       }
       return stack.empty();


    }


    public static void main(String[] args) {
        String strs = "()()" ;
        String[] strs1 = {"c","acc","ccc"};
        System.out.println( isValid(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        int longst_string = 0;
        int m = 0;
        int d = 0;
        for (int i = 1; i < strs.length; i++) {

            m = 0;
            if(strs[0].isBlank() ||strs[i].isBlank() ) return "";
            if(strs[0].charAt(0) != strs[i].charAt(0) ) return "";
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


}