package com.bogdan.education.progOOP.task3;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

/**
 * Created by Admin on 04.04.17.
 */
@Getter
@Setter
public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private String employment;
    private boolean sex;


    protected Human(String firstName, String lastName, int age, String employment,boolean sex) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employment = employment;
        this.sex = sex;
    }

    protected Human(){
        super();
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                "age=" + age +
                "employment='" + employment + '\'' +
                "sex=" + sex +
                '}';
    }
}




