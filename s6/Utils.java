package com.zf;

import java.util.Collections;
import java.util.List;

/**
 * @author Henry
 * @date 2019/11/8
 */
public class Utils {
    public static int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).start();
    }
    
}
