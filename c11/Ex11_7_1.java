package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_7_1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Hello.txt");
        int i;
        while ((i = fr.read()) !=-1){
            System.out.print((char)i);
        }
    }
}
