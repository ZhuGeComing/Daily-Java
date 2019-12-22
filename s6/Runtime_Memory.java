package com.zf.s6;

/**
 * @author Henry
 * @date 2019/12/11
 */
public class Runtime_Memory {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();
            System.out.println("内存可用空间"+ runtime.totalMemory());
            System.out.println("未创建的剩余内存"+runtime.freeMemory());
            int base[] = new int[10240];
            System.out.println("创建后的内存"+runtime.freeMemory());
            runtime.gc();
            Thread.sleep(1000);
            System.out.println("垃圾收集后内存"+runtime.freeMemory());
            for (int i = 0; i < 10240; i++) {
                base[i] = i+1;
            }
            Thread.sleep(2000);
            System.out.println("分配空间后的内存"+runtime.freeMemory());
            runtime.gc();
            Thread.sleep(2000);
            System.out.println("垃圾收集后内存"+runtime.freeMemory());
        }catch(InterruptedException el){
            el.printStackTrace();
        }
    }
}
