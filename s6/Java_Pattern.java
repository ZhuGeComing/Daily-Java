package com.zf.s6;
import java.util.regex.Pattern;
/**
 * @author Henry
 * @date 2019/12/11
 */
public class Java_Pattern {
    static String str = "D:\\工具\\ss\\Shadowsocks.exe";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[\\\\]{1,}");
        String[] rs = pattern.split(str);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }
    }
}
