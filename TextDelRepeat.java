package com.zf;

/**
 * @author Henry
 * @date 2019/11/2
 */
public class TextDelRepeat {
    public static int[] changeMethodOne(int src[]){
        int length = src.length;
        int[] target = new int[length];
        int index = 0;
        target[0] = src[0];
        for (int i = 1; i < length; i++) {
            if(target[index] != src[i]){
                index++;
                target[index] = src[i];
            }
        }
        return target;
    }

    public static int[] changeMethodTwo(int src[]){
        int length = src.length;
        int[] targetIndex = new int[length];
        int targetLength = length;
        for (int i = 0; i < length; i++) {
            targetIndex[i] = 0;
        }
        for (int i = 1; i < length; i++) {
            if(src[i] == src[i - 1]){
                targetIndex[i] = 1;
                targetLength--;
            }
        }

        int[] target = new int[targetLength];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if(targetIndex[i] == 0){
                target[index++] = src[i];
            }
        }
        return target;


    }


    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 6, 6};
        int[] result = changeMethodTwo(test);
        for (int i = 0; i < result.length; i++) {
            int i1 = result[i];
            System.out.println(i1);
        }
    }


}
