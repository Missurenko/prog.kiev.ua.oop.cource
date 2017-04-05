package com.bogdan.education.progOOP.task1.tackPhone;


import java.util.ArrayList;


/**
 * Created by Admin on 29.03.17.
 */

public class Network {

    private String name;
    private String serviseRang;
    private String connectionRang;
    private String priceRang;
    private String firstNumber;
    ArrayList<String> allNumber;

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public ArrayList<String> getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(ArrayList<String> allNumber) {
        this.allNumber = allNumber;
    }

    public Network(String name, String serviseRang, String connectionRang, String priceRang,String firstNumber) {
        this.name = name;
        this.serviseRang = serviseRang;
        this.connectionRang = connectionRang;
        this.priceRang = priceRang;
        this.firstNumber = firstNumber;
        allNumber = new ArrayList<>();
    }

    public String loadNumberPhone() {
        String message = "";
        for (String numb : allNumber) {
            message += numb + "\n";
        }
        return message;
    }

}
