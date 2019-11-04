package com.zf;

/**
 * @author Henry
 * @date 2019/11/4
 */
public class TextAbstract {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("圆的面积"+circle.getArea());
    }

}


abstract class Geometric{
    String color = "block";
    int width =2;
    abstract float getArea();
    abstract float getPerimeter();
}


class Circle extends Geometric{
    float radius;

    Circle(float number){
        radius = number;
    }

    @Override
    protected float getArea() {
        return 3.14f*radius*radius;
    }

    @Override
    protected float getPerimeter() {
        return 3.14f*2*radius;
    }
}


class Rectangle extends Geometric{
    float width;
    float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    @Override
    float getArea() {
        return width * height;
    }

    @Override
    float getPerimeter() {
        return 2*(width + height);
    }


}