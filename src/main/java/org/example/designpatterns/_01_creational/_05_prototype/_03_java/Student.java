package org.example.designpatterns._01_creational._05_prototype._03_java;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
