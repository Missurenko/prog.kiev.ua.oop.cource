package com.bogdan.education.progOOP.task3;

import com.bogdan.education.progOOP.task3.compareForHuman.CompareByLastName;

import java.util.Arrays;

/**
 * Created by Admin on 04.04.17.
 */
public class Groupe {
//    BufferedReader reader = new BufferedReader(in)
    private Human[] groupeProg = new Student[10];

    public String addStudent(Student student) {
        for (int i = 0; ; i++) {
            if (groupeProg[i] == null) {
                try {
                    groupeProg[i] = student;
                    return "Student was added";
                } catch (IndexOutOfBoundsException e) {
                    return "Groupe is full";
                } finally {
                    return "Max size group is 10";
                }

            }
        }

    }

    public String removeStudent(String lastName) {
        for (int i = 0; i < groupeProg.length; i++) {
            if (groupeProg[i].getLastName().equals(lastName)) {
                groupeProg[i] = null;
                return "Student was removed";
            }
        }
        return "In the group there is no student with such Surname";
    }

    @Override
    public String toString() {
        Arrays.sort(groupeProg, new CompareByLastName());
        return "Groupe{" +
                "groupeProg=" + Arrays.toString(groupeProg) +
                '}';

    }
}
