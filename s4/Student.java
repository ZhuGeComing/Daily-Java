package com.zf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Henry
 * @date 2019/11/8
 */
public class Student {
    private Long id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student(1l, "John");
        System.out.println(student.toString());

        List<Student> students = new ArrayList<Student>();

    }

}
