package com.zf.c11;
import java.io.*;
/**
 * @author Henry
 * @date 2019/12/17
 */
public class Ex11_8_2 {
    public static void main(String[] args) throws IOException {
        int i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Hello3.txt");
//        System.out.println("请输入非汉字");
//        while(true) {
//            i = br.read();
//            fos.write((char)i);
//        }
        FileWriter fw = new FileWriter("C:\\Users\\Henry\\IdeaProjects\\August_1\\src\\com\\zf\\c11\\Hello3.txt");
        while((i = br.read()) != -1) {
            fw.write(i);
        }
        fw.flush();

    }
}
