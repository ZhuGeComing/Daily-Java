package com.zf;
import java.util.Scanner;

/**
 * @author Henry
 * @date 2019/8/16
 */
public class One {
    public static void main(String[] args) {
        System.out.println(test12(1,2));;
    }

    public static void test1() {
        int count =0;
        for(int i = 101; i<200; i++){
            boolean flag = true;
            for(int j=2;j<Math.sqrt(i); j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }

    public static void test2() {
        int f1 = 1,f2 = 1, f;
        int M = 30;
        System.out.println(1);
        System.out.println(1);
        for(int i = 3; i<M; i++){
            f = f2;
            f2 = f1+f2;
            f1 = f;
            System.out.println(f2);
        }
    }

    public static void test3() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();

        int sum = 0, b = 0;
        for(int i = 0; i<n; i++){
            b+=a;
            sum+=b;
            a = a*10;
        }
        System.out.println(sum);
    }

    public static void test4() {
        for (int i = 1; i <1000; i++) {
            int t = 0;
            for (int j = 0; j <= (i+1)/2; j++) {
                if ((i+1)%(j+1) == 0) {
                    t = t+j+1;
                }
            }
            if (t == (i+1)) {
                System.out.println(i+1);
            }
        }
    }

    public static void test5() {
        double h = 100;
        double s = 100;
        for (int i = 0; i < 10; i++) {
            h = h/2;
            s = s+2*h;
        }
        System.out.println(s);
    }

    public static void test6() {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (i!=j&&j!=k&&i!=k) {
                        count++;
                        System.out.println(100*(i+1)+10*(j+1)+k+1);
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void test7() {
        for (int i = -100; i < 100000; i++) {
            if(Math.sqrt(i+100)%1 == 0&&Math.sqrt(i+268)%1 == 0){
                System.out.println(i);
            }
        }
    }
    public static void test8(){
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      int y = input.nextInt();
      int z = input.nextInt();

        System.out.println(x +""+y+""+z);
    }
    public static void test9(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
    public static void test10(){
        int x = 1;
        for (int i = 1; i < 10; i++) {
            x = (x+1)*2;
        }
        System.out.println(x);
    }
    public static void test11(){
        test9();
    }

    public static int test12(int a, int b){
        return a+b;
    }

}

