package app;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import Utilisateur.*;
import Voiture.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Users
            Utilisateur user = new Utilisateur("123", "Omar");
            System.out.println(user);

            Mecanique mec = new Mecanique("123", "Omar", "001");
            System.out.println(mec);

            // Car
            Voiture car = new Voiture("111 | B", "BMW", 2020, "123");
            car.addOwner("124"); // new owner
            System.out.println(car);

            // Repair record
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date repDate = sdf.parse("02-01-2023");

            Repartition rep = new Repartition("999", repDate, "111 | B", "123");
            System.out.println(rep);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
