package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_7_3 {
    public static void main(String[] args) throws IOException {
        int i;
        FileReader fr = new FileReader("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Hello.txt");
        FileWriter fw = new FileWriter("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Hello1.txt");
        while ((i = fr.read()) != -1) {
            fw.write(i);
        }
        fw.flush();
    }
}
