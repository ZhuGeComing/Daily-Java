package com.zf.c11;

import java.util.Arrays;

/**
 * @author Henry
 * @date 2019/12/19
 */
public class offer_6 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }
    public TreeNode reConstructBinaryTree(int[] array, int[] in){
        if(array == null || array.length == 0) return null;
        if(array.length == 0 || in.length == 0) return null;
        if(array.length != in.length) return null;
        TreeNode root = new TreeNode(array[0]);
        for (int i = 0; i < array.length; i++) {
            if(array[0] == in[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(array, 1, i+1), Arrays.copyOfRange(array, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(array, i+1, array.length), Arrays.copyOfRange(array,i+1,array.length));
            }
        }
        return root;
    }
    public static int minNumberInRotatedArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int left = 0;
        int right = array.length -1;
        int mid = 0;

        while(array[left] >= array[right]){
            if((right - left) <= 1){
                mid = right;
                break;
            }
            mid = (right+left) / 2;
            if(array[left] == array[mid] && array[mid] == array[right]){
                if(array[left+1] != array[right-1]){
                    mid = array[left+1] < array[right-1]?left+1:right-1;
                } else {
                    left++;
                    right--;
                }
            }else{
                if(array[left] <= array[mid]){
                    left = mid;
                }else{
                    right = mid;
                }
            }
        }
        return array[mid];
    }

    public static void main(String[] args) {
        int[] array = {3, 3, 3, 4, 3};
        System.out.println(minNumberInRotatedArray(array));
    }

}
