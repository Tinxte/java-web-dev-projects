package org.launchcode;
import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {

    double length;
    double width;

    Scanner lengthInput = new Scanner(System.in);
    System.out.println("Enter the length: ");
        length = lengthInput.nextDouble();

        System.out.println("The length is: " + length);

    Scanner widthInput = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = widthInput.nextDouble();
        widthInput.close();

        System.out.println("The width is: " + width);

        double result;
        result = width * length;

        System.out.println("The area is: " + result);


    }
}
