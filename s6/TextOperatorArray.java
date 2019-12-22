package com.zf;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Henry
 * @date 2019/10/31
 */
public class TextOperatorArray {
    public static void copy(){
        int array[] = new int[]{1,2,3,4};
        int temp1[] = new int[array.length];
        int temp2[] = new int[array.length];
        System.arraycopy(array,0, temp1,0,array.length);
        for(int i:temp1)
            System.out.print(i+" ");
//        System.out.println(temp1);
    }

    public static void main(String[] args) {
        copy();
    }
}
