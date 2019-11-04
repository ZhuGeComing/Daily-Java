package com.zf;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Henry
 * @date 2019/11/2
 */
public class TextArray {
    public static void arraysSortAndSearch(){
        int[] array = {93, 5, 7, 3, 2, 1, 41};
        System.out.println("排序前");
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
            System.out.print(i1 + " ");
        }
        System.out.println();
        System.out.println("排序后");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
            System.out.print(i1 + " ");
        }
        System.out.println();
        System.out.println("请输入搜索值");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int find = -1;
        if((find = Arrays.binarySearch(array, number)) > -1){
            System.out.println("找到的索引在"+find+"位置");
        }


    }

    public static void main(String[] args) {
        arraysSortAndSearch();
    }
}
