package com.zf.s6;

/**
 * @author Henry
 * @date 2019/12/10
 */

class CopyStrByte{
    private String str = "";
    public String arrStr[];
    public CopyStrByte(String str){
        this.str = str;
    }
    public String[] CopyStr(){
//        return str.substring(0, str.indexOf("汉"));
        arrStr =  str.split("");
        return arrStr;
    }

}

public class TextTruncate {
    public static void main(String[] args) {
        CopyStrByte copyStr = new CopyStrByte("中guo汉ren");
        String[] text = copyStr.CopyStr();
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i].getBytes().length);
        }

    }
}
