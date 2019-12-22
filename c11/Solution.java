package com.zf.c11;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Henry
 * @date 2019/12/19
 */

public class Solution {
    public boolean find(int[][] array, int target){
        if(array == null || array.length == 0) return false;
        int row = 0;
        int column = array[0].length-1;
        while(row <array.length && column > 0){
            if(array[row][column] == target) return true;
            if(array[row][column] > target){
                column--;
            }else{
                row++;
            }
        }

        return false;
    }
    public static String replaceSpaces(StringBuffer str){
        if(str == null) return null;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }
        T value;
        ListNode<T> next;
    }


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null) return list;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            list.add((Integer) stack.pop().value);
        }
        return list;
    }


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We are happy");
        System.out.println(replaceSpaces(sb));
    }
}
