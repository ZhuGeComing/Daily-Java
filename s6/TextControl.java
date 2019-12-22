package com.zf;
import java.io.*;
/**
 * @author Henry
 * @date 2019/10/30
 */
public class TextControl {
    static int year, monthDay, weekDay;
    public static boolean isLeapYear(int year){
        return (year%4 == 0 && year%100 != 0) || (year%400 ==0);
    }

    public static int firstDay(int year){
        long n = year*365;
        for (int i = 1; i < year; i++) {
            if(isLeapYear(i))
                n += 1;
        }
        return (int) n%7;
    }

    public static void printWeek(){
        System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday Sunday");
    }

    public static int getMonthDay(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return 0;
        }
    }


    public static void printMonth(){
        for (int m = 1; m <= 12; m++) {
            System.out.println(m + "月");
            printWeek();
            for (int j = 1; j <= weekDay; j++) {
                System.out.print("     ");
            }
            int monthDay = getMonthDay(m);
            for (int d = 1; d <= monthDay; d++) {
                if(d < 10)
                    System.out.print(d + "    ");
                else
                    System.out.print(d + "   ");
                weekDay = (weekDay + 1) % 7;
                if(weekDay == 0)
                    System.out.println();
            }
            System.out.println('\n');
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println("年份：");
        InputStreamReader ir;
        BufferedReader in;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        String s = in.readLine();
        year = Integer.parseInt(s);
        weekDay = firstDay(year);
        System.out.println("\n    "+year+"年     ");;
        printMonth();
    }


}
