package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_5_1 {
//    由于FileInputStream是位传递，所以无法显示
    public static void main(String[] args) throws IOException {
        int i;
        String name = "C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Hello.txt";
        FileInputStream fis = new FileInputStream(name);
        while ((i = fis.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
