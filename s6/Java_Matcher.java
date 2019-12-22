package com.zf.s6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * @author Henry
 * @date 2019/12/11
 */
public class Java_Matcher {
    public static void main(String[] args) {
        String str = "QQ号不能QQQ以0开头";
        Pattern pattern = Pattern.compile("QQ");
        Matcher matcher = pattern.matcher(str);
        StringBuffer sb =new StringBuffer();
        int count = 0;
        boolean result;
        while(matcher.find()){
            matcher.appendReplacement(sb, "MM");
            count++;
            System.out.println("第"+count+"次匹配后的内容是："+sb);
        }
        matcher.appendTail(sb);
        System.out.println("调用appendTail："+sb);
    }


}
