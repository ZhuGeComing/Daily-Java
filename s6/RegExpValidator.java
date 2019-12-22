package com.zf.s6;
import java.util.regex.*;

/**
 * @author Henry
 * @date 2019/12/11
 */
public class RegExpValidator {
    public static boolean isEmail(String str){
        String regex = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-Z0-9]-*){1,}\\.){1,3}[a-zA-Z\\-]{1,}";
        return match(regex, str);
    }
    public static boolean match(String regex, String str){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static boolean isHome(String str){
        String regex = "http://(([a-zA-Z0-9]|-){1,}\\.){1,}[a-zA-Z0-9]{1,}-*";
        return match(regex, str);
    }

    public static void main(String[] args) {
        String str = "http://zhidao.baidu.com";
        System.out.println(isHome(str));
    }
}
