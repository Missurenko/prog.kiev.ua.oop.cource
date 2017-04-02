package com.bogdan.education.progOOP.firstLesson.cat;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 25.03.17.
 */

@Getter
@Setter
public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;
    private int numberWin;

    public Cat() {
        super();
    }

    public Cat(String name, String color, int age, double weight) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}
