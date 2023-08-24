package arrays;

import java.util.Scanner;

public class BasicArrays {

    public static void main(String[] args) {

        String[] names = {"Florian", "Daniel", "Elvedin"};

        names[0] = "Florian";
        names[2] = "Elvedin";

        System.out.println(names[1]);

        int[] ages = new int[5];
        ages[0] = 21;

        System.out.println(ages[0]);
        System.out.println(ages[1]);

        ages[0] = ages[0] + 5;

        System.out.println(ages[0]);

        names[0] = names[0] + " Weber";

        System.out.println(names[0]);
        names[0] = names[0] + " Schmidt";

        System.out.println(names[0]);

        names[0] = "Fische";

        System.out.println(names[0]);


        System.out.println("----");


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("----");

        for(int i = 0; i < names.length; i++) {
            System.out.println(i + " : " + names[i]);
        }

        System.out.println("----");

        for(String name : names) {
            System.out.println(name);
        }
    }
}
