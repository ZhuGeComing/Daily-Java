package com.zf.s8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
/**
 * @author Henry
 * @date 2019/12/11
 */
public class TextInterator {
    public static void SearchBooks(){
        List<String> list = new ArrayList<String>(5);
        list.add("匹");
        list.add("配");
        list.add("后");
        list.add("的");
        list.add("内");
        System.out.println("查看书目");;
        for(Iterator iterator = list.iterator(); iterator.hasNext();){
            Object obj = iterator.next();
            System.out.println(obj);
            if("的".equals(obj)){
                iterator.remove();
            }
        }
        System.out.println("===========");
        System.out.println("查看书目");;
        for(Iterator iterator = list.iterator(); iterator.hasNext();){
            Object obj = iterator.next();
            System.out.println(obj);
            if("的".equals(obj)){
                iterator.remove();
            }
        }
        System.out.println("===========");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void searchResults(){
        Vector<String> vector = new Vector<String>(5);
        vector.add("匹");
        vector.add("配");
        vector.add("后");
        vector.add("的");
        vector.add("内");
        System.out.println("查看书目");;
        for(Iterator iterator = vector.iterator(); iterator.hasNext();){
            if(iterator.next().equals("匹")){
                iterator.remove();
            }else{
                System.out.println(iterator.next());
            }

        }


    }

    public static void main(String[] args) {
        searchResults();
    }
}
