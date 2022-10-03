package com.javarash.test1;

import com.javarush.test.Solution;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;

public class Computer {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();
        person1.sayHello();
        System.out.println(person1.calculateYears());

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 60;
        person2.speak();
        person2.sayHello();

        System.out.println(person2.calculateYears());


    }
}
class Person {
    String name;
    int age;
    int calculateYears() {
        int years = 65 - age;
       return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("my name is " + name + "," + "my age is " + age);
        }
    }
    void sayHello() {
        System.out.println("Hello");
    }
}