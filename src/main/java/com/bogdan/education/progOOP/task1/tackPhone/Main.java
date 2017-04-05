package com.bogdan.education.progOOP.task1.tackPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Admin on 29.03.17.
 */
public class Main {
    public static void main(String[] arg) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Network network = new Network("kyivstar", "Not bad",
                "Good", "Not bad", "38067");
        Phone myPhone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();


        System.out.println(myPhone.enrolment(network));
        System.out.println(phone1.enrolment(network));
        System.out.println(phone2.enrolment(network));
        String userWrite = "";
        do {
            System.out.println("Enter: call, load or end");
            userWrite = reader.readLine();
            if (userWrite.equals("call")) {
                System.out.println("Enter number;");
                userWrite = reader.readLine();
                System.out.println(myPhone.call(network, userWrite));

            } else if (userWrite.equals("load")) {
                System.out.println(network.loadNumberPhone());
            }
        } while (!userWrite.equals("end"));
    }
}

