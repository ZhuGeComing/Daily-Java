package com.zf.java.codemonk;
//https://www.hackerearth.com/practice/algorithms/string-algorithm/string-searching/practice-problems/algorithm/little-monk-and-good-string/

import java.util.Arrays;
import java.util.Scanner;

class GoodString {
    public static void main(String args[]) throws Exception {

//        Scanner s = new Scanner(System.in);
//        String input = s.next();
        String input = "aaayyrreeu";
//        System.out.println(Arrays.stream(input.replaceAll("[^aeiou]+", "#").split("#")).mapToInt(x -> x.length()).max().orElse(0));
        System.out.println(Arrays.stream(input.replaceAll("[^aeiou]+", "#").split("#")).mapToInt(x -> x.length()).max());
        String[] strarr = {"abc", "defg", "vwxyz"};
        int iSum = Arrays.stream(strarr).mapToInt(s -> s.length()).sum();
        System.out.println("长度和: "+iSum);
    }
}
