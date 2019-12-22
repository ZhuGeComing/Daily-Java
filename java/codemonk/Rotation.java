package com.zf.java.codemonk;

import java.util.Scanner;

/**
 * @author Henry
 * @date 2019/12/21
 */
public class Rotation {
    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int length = s.nextInt();
            int rotation = s.nextInt();
            int[] input = new int[length];
            for (int i1 = 0; i1 < length; i1++) {
                input[i1] = s.nextInt();
            }
            printRotation(rotation, input);
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }


    private static void printRotation(int rotation, int[] str){
        rotation = rotation % str.length;
        int startIndex = str.length - rotation;
        if(rotation == str.length){
            startIndex = 0;
        }
        int i = 0;
        while (i<str.length){
            builder.append(str[startIndex] + " ");
            startIndex++;
            i++;
            if(startIndex == str.length){
                startIndex = 0;
            }
        }
    }
}
