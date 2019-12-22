package com.zf;
import java.util.Arrays;
/**
 * @author Henry
 * @date 2019/11/1
 */
public class TextArraySearch {
    public static int binarySearch(int[] array, int index, int beginIndex, int endIndex) {
        int middleIndex = (beginIndex + endIndex)/2;
        if(index < array[beginIndex] || index > array[endIndex] || beginIndex > endIndex){
            return -1;
        }

        if(index < array[middleIndex]){
            return binarySearch(array, index, beginIndex, middleIndex-1);
        }else if(index > array[middleIndex]){
            return binarySearch(array, index, middleIndex+1, endIndex);
        }else{
            return middleIndex;
        }
    }

    public static int binarySearch2(int[] array, int index, int startIndex, int endIndex){
        if(index < array[startIndex] || index > array[endIndex] || startIndex > endIndex)
            return -1;
        while(startIndex <= endIndex){
            int middleIndex = (startIndex + endIndex)/2;
            if(index < array[middleIndex]){
                endIndex = middleIndex-1;
            }else if(index > array[middleIndex]){
                startIndex = middleIndex+1;
            }else{
                return middleIndex;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = new int[]{1,2,23,4,5,6,7,8,9};
        Arrays.sort(array);
        System.out.println(binarySearch2(array, 4, 0, array.length-1));
    }



}
