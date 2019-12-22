package com.zf;

/**
 * @author Henry
 * @date 2019/12/7
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "192.168.1.101";
        String result[] = str.split("\\.");
        System.out.println(str.indexOf(".", 4));
    }
}
