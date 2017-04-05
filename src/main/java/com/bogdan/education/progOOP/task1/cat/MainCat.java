package com.bogdan.education.progOOP.task1.cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 25.03.17.
 */
public class MainCat {
    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cat first = new Cat("Murzic", "White", 10, 10);
        Cat second = new Cat();
        second.setName("Rijic");
        second.setAge(5);
        second.setColor("Yellow");
        second.setWeight(5);
        second.setNumberWin(3);
        Cat third = new Cat();
        third.setName("Street Cat");
        third.setAge(5);
        third.setColor("Black");
        third.setWeight(5);
        third.setNumberWin(20);
        CatFight fight = new CatFight();
        System.out.println("Fight ");
        System.out.println(print(fight, first, second));
        System.out.println(print(fight, first, third));
        System.out.println(print(fight, second, third));
        String userWrite1 = "";
        String userWrite2 = "";
        String continued = "";
        do {
            System.out.println("Enter: first cat fight");
            userWrite1 = reader.readLine();
            System.out.println("Enter: second cat fight");
            userWrite2 = reader.readLine();
            if (userWrite1.equals("first") && userWrite2.equals("second")) {
                System.out.println(print(fight, first, second));
            } else if (userWrite1.equals("first") && userWrite2.equals("third")) {
                System.out.println(print(fight, first, third));
            } else if (userWrite1.equals("second") && userWrite2.equals("third")) {
                System.out.println(print(fight, second, third));
            } else if (userWrite1.equals("second") && userWrite2.equals("first")) {
                System.out.println(print(fight, second, first));
            } else if (userWrite1.equals("third") && userWrite2.equals("first")) {
                System.out.println(print(fight, third, first));
            } else {
                System.out.println(print(fight, third, second));
            }
            System.out.println("enter; \"end\" if want end. ");
            continued = reader.readLine();
        } while (!continued.equals("end"));
    }

    private static String print(CatFight fight, Cat first, Cat second) {
        String message = "";
        if (fight.fight(first, second)) {
            message = "Win " + first.getName() + ". Have win " + first.getNumberWin() ;
        } else {
            message = "Win " + second.getName()+ ". Have win " + second.getNumberWin();
        }
        return message;
    }
}
