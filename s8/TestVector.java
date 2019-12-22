package com.zf.s8;
import java.util.Vector;

/**
 * @author Henry
 * @date 2019/12/12
 */
public class TestVector {
    public Vector createVector(){
        Vector vector = new Vector();
        for (int i = 0; i < 5; i++) {
            Vector v = new Vector();
            for (int i1 = 0; i1 < 5; i1++) {
                v.addElement("Vector("+i+")("+i1+")");
            }
            vector.addElement(v);
        }
        return vector;
    }

    public Vector delete(Vector v, int index) {
        if(index >= v.size()){
            return null;
        }
        else{
            v.removeElementAt(index);
            return v;
        }
    }


    public void print(Object obj) {
        System.out.println(obj);
    }

    public void print(String str, Vector v) {
        System.out.println(str+"数据：");
        this.print(v);
    }
    public void print(Vector v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
    }

    public static void main(String[] args) {
        TestVector ov = new TestVector();
        Vector v = ov.createVector();
        ov.print("二维数组", v);
        Vector u = ov.delete(v, 2);
        ov.print("删除后数组", u);
    }

}
