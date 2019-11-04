package com.zf;

/**
 * @author Henry
 * @date 2019/10/31
 */
public class TextSort {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void bubbleSort(int[] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[j] < x[i]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }

            }
        }

        for(int i:x)
            System.out.print(i + "  ");
    }


    public static void selectSort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            int lowerIndex = i;
            for (int j = i+1; j < x.length; j++) {
                if(x[j] < x[lowerIndex])
                    lowerIndex = j;
            }
            int temp = x[lowerIndex];
            x[lowerIndex] = x[i];
            x[i] = temp;
        }

        for(int i:x)
            System.out.print(i + "  ");

    }

    public static void insertSort(int[] x){
        for (int i = 1; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if(x[j]<x[j-1]){
                    int temp = x[j];
                    x[j] = x[j-1];
                    x[j-1] = temp;
                }

            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

    }


    public static void shellSort(int[] x){
        for (int increment = x.length/2 ; increment > 0; increment /= 2){
            for (int i = increment; i < x.length; i++) {
                int temp = x[i];
                int j = 0;
                for(j = i; j >= increment; j -= increment){
                    if(temp < x[j-increment]){
                        x[j] = x[j-increment];
                    }else{
                        break;
                    }
                }
                x[j] = temp;
            }

        }

        for(int i:x)
            System.out.println(i);

    }


    public static void main(String[] args) {
        int x[] = new int[] {7, 2, 4, 3, 5};
        shellSort(x);



    }

}
