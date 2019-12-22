package com.zf;

/**
 * @author Henry
 * @date 2019/10/31
 */
public class TextTriang {

    public static void main(String[] args) {
        int ROW = 5;
        int a[][] = new int[ROW][];
        for (int i = 0; i < ROW; i++) {
            a[i] = new int[i+1];
        }
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(j == 0 || i == 0 || j == a[i].length-1){
                    a[i][j] = 1;
                }else{
                    a[i][j] =a[i-1][j] + a[i-1][j-1];
                }
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }


}
