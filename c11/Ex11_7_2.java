package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_7_2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Two.txt");
        String line = "服务器中启动在jar包中读取文件 ";
        fw.write(line);
        fw.flush();
    }
}
