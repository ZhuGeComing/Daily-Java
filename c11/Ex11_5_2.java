package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_5_2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Two.txt");
        String line = "Hello,静静";
        fos.write(line.getBytes());
        fos.close();
    }
}
