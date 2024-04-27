package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Scanner input;
        int firstNumber;
        int secondNumber;

//        input = new Scanner(System.in);
//        System.out.println("Enter the first number to divide: ");
//        firstNumber = input.nextInt();
//        System.out.println("Enter the second number to divide by: ");
//        secondNumber = input.nextInt();
//        Divide(firstNumber, secondNumber);


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println("Student Grade: " + CheckFileExtension(studentFiles.get("Brad")));
    }

    public static void Divide(int x, int y) {
        // Write code here!

        if (x == 0 || y == 0) {
            try {
                throw new DivideException("Cannot divide with the number 0!");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        } else {

            int output = 0;
            output = (x / y);
            System.out.println("Result: " + output);
        }
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        if (fileName == null || fileName == "") {
            try {
                throw new Exception("No file submitted!");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        } else if (fileName.contains(".java")) {
            return 1;
        } else return 0;
    }
}