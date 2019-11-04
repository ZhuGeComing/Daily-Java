package com.zf;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Henry
 * @date 2019/10/30
 */
public class TextFactorial{
    public static int simpleCircles(int num){
        int sum = 1;
        if(num < 0){
            throw new IllegalArgumentException("num must be positive");
        }
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int recursion(int num) {
        int sum = 1;
        if(num < 0){
            throw new IllegalArgumentException("num must be positive");
        }
        if(num == 1 || num ==0){
            return 1;
        }else{
            sum = num * recursion(num-1);
            return sum;
        }
    }

    public static long addArray(int num){
        long[] arr = new long[21];
        arr[0] = 1;
        int last = 0;
        if(num >= arr.length){
            throw new IllegalArgumentException("Input Too Long");
        }
        if(num<0){
            throw new IllegalArgumentException("Input Must Be Positive");
        }
        while(last<num){
            arr[last+1] = arr[last]*(last+1);
            last++;
        }
        return arr[num];

    }

    public static synchronized BigInteger bigNumber(int num){
        ArrayList list = new ArrayList();
        list.add(BigInteger.valueOf(1));
        for (int i = list.size(); i <= num; i++) {
            BigInteger lastfact = (BigInteger) list.get(i-1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(i));
            list.add(nextfact);
        }
        return (BigInteger) list.get(num);

    }





    public static void main(String[] args) {
        System.out.println(bigNumber(50));
    }

}