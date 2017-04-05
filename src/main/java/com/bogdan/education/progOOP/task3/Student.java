package com.bogdan.education.progOOP.task3;

/**
 * Created by Admin on 04.04.17.
 */
public class Student extends Human {

    protected Student(String firstName, String lastName, int age, String employment,boolean sex) {
        super(firstName, lastName, age, employment,sex);
    }

    @Override
    public String toString() {
        return "Student{ " +
                "firstName='" + getFirstName() + '\n' +
                "lastName='" + getLastName() + '\n' +
                "age=" + getAge() + '\n' +
                "employment='" + getEmployment() + '}' + '\n';
    }
}
