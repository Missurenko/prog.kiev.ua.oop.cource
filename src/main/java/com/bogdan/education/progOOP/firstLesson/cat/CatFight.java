package com.bogdan.education.progOOP.firstLesson.cat;

/**
 * Created by Admin on 29.03.17.
 */
public class CatFight {
    public boolean fight(Cat first, Cat second) {
        int battleWin = 0;

        if (first.getWeight() > second.getWeight()) {
            battleWin++;
        } else if (first.getWeight() == second.getWeight()) {
            battleWin += fortune(first, second);
        }
        if (first.getAge() < second.getAge()) {
            battleWin++;
        } else if (first.getAge() == second.getAge()) {
            battleWin += fortune(first, second);
        }
        if (first.getNumberWin() > second.getNumberWin()) {
            battleWin++;
        } else if (first.getNumberWin() == second.getNumberWin()) {
            battleWin += fortune(first, second);
        }
        if (battleWin >= 2) {
            first.setNumberWin(first.getNumberWin() + 1);
            return true;
        } else {
            second.setNumberWin(first.getNumberWin() + 1);
            return false;
        }

    }

    private int fortune(Cat first, Cat second) {
        int numberRandom = (int) (Math.random() * 10);

        if (numberRandom > 5) {
            return 1;
        }
        return 0;
    }
}
