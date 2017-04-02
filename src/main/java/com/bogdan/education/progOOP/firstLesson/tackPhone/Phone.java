package com.bogdan.education.progOOP.firstLesson.tackPhone;


import java.util.ArrayList;

/**
 * Created by Admin on 29.03.17.
 */

public class Phone {
    private String numberPhone;
    private String color;
    private String sizeSim;
    private String material;
    private String type;

    public Phone(String color, String sizeSim, String material, String type) {
        this.color = color;
        this.sizeSim = sizeSim;
        this.material = material;
        this.type = type;
    }

    public Phone() {
    }

    public String call(Network network, String number) {
        String message = "";
        for (String numb : network.getAllNumber()) {
            if (numb.equals(number)) {
                message = "You call";
                return message;
            } else {
                message = "Wrong number";
            }

        }
        return message;

    }


    public String enrolment(Network network) {
        ArrayList<String> allNum = network.getAllNumber();
        int i = (int) ((Math.random() * (10000000 - 9000000)));
        numberPhone = network.getFirstNumber() + i + "";
        allNum.add(numberPhone);
        network.setAllNumber(allNum);
        return "Telefon is enrolment. NumberPhone " + numberPhone;
    }
}
