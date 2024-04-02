package org.launchcode;
import java.util.Scanner;

import static org.launchcode.Circle.getArea;

public class Area {
    public static void main(String[] args) {
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");


        while (!input.hasNextDouble()) {
            System.out.println("Error: Enter a number");
            input.close();
        }

        radius = input.nextDouble();


//        if (radius <= 0) {
//            System.out.println("Must be higher than 0");
//            input.close();
////        } else if (radius.NaN()) {
////            System.out.println(radius + " is NaN");
////            };
//        } else


            System.out.println(radius);

        double area;
        area = Circle.getArea(radius);


                System.out.println("The area of a circle of radius is " + radius + " is: " + area);

    }
}
