package com.bogdan.education.progOOP.task3;

/**
 * Created by Admin on 04.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Groupe groupe = createStudents();
        System.out.println(groupe);
        System.out.println("Work");
    }

    private static Groupe createStudents() {
        Groupe groupe = new Groupe();
        for (int i = 0; ; i++) {
            try {
                int random = (int) (Math.random() * 100);
                groupe.addStudent(new Student("Ivan" + random, "Sirco" + random,
                        40 + i, "Capitan", true));
                groupe.addStudent(new Student("Anna" + random, "Royal" + random,
                        18 + i, "Dancer", false));
                groupe.addStudent(new Student("Toha" + random, "Kocherga" + random,
                        18 + i, "DG", true));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Catch block");
                return groupe;
            }
        }
    }
}
