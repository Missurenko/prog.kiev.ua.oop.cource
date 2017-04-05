package com.bogdan.education.progOOP.task3.compareForHuman;

import com.bogdan.education.progOOP.task3.Human;

import java.util.Comparator;

/**
 * Created by Admin on 04.04.17.
 */
public class CompareByLastName implements Comparator<Human> {
    @Override
    public int compare(Human human1, Human human2) {
        return human1.getLastName().compareTo(human2.getLastName());
    }
}

