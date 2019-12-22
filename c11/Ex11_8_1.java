package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_8_1 {
    public static void main(String[] args) throws IOException {
        int i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请输入数字");
        while(true) {
            i = br.read();
            System.out.print((char)i);
        }
    }
}
