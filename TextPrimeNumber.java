package com.zf;
import java.util.Arrays;
/**
 * @author Henry
 * @date 2019/11/2
 */
public class TextPrimeNumber {
    private static boolean[] filterNumber(int num){
        if(num <= 0){
            System.out.println("无");
            return null;
        }

        boolean[] isPrime = new boolean[num+1];
        isPrime[1] = false;
        Arrays.fill(isPrime, 2, num+1, true);
        int n = (int)Math.sqrt(num);
        for (int i = 1; i <= n; i++) {
            if(isPrime[i]){
                for(int j = 2*i; j<= num; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;

    }

    public static void main(String[] args) {
        boolean[] result = filterNumber(100);


        for (int i = 0; i < result.length; i++) {
            boolean b = result[i];
            if(b){
                System.out.println(i);
            }

        }
    }

}
