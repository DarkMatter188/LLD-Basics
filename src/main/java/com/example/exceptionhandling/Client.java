package com.example.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt(); //will give exception handle in try catch
//        System.out.println(number);

        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt(); //will give exception handle in try catch runtime exception
            System.out.println(number);

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int out = x / y;

            //to avoid finally block to run
            System.exit(0);
        }
        catch (InputMismatchException e) {
            System.out.println("You have entered wrong input, correct and retry again!!");
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong! Try again");
        }
        finally {
            System.out.println("Finally block always executed!!");
        }

        System.out.println("After Catch block");



    }
}
