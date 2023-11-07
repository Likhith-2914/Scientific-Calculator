package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{

    public static void main( String[] args )
    {
        
        int operation  = 0;

        while (true) {
            System.out.println("\n======================");
            System.out.println("Scientifc - Calculator");
            System.out.println("======================");

            System.out.println("\n\nChoose your Operation\n\n");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");


            Scanner sc = new Scanner(System.in);

            operation = sc.nextInt();

            if(operation==5){
                sc.close();
                System.out.println("Application Closed!\n");
                System.exit(0);
            }
            
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            
            switch(operation) {
                case 1: 
                    System.out.println("Result of adding " + number2 + " to " + number1 + " is " + add(number1, number2));
                    break;
                case 2: 
                    System.out.println("Result of subtracting " + number2 + " from " + number1 + " is " + sub(number1, number2));
                    break;
                case 3: 
                    System.out.println("Result of multiplying " + number2 + " with " + number1 + " is " + mul(number1, number2));
                    break;
                case 4: 
                    if(number2 == 0) {
                        System.out.println("number2 expects non-zero integer");
                        break;
                    }
                    System.out.println("Result of dividing " + number1 + " by " + number2 + " is " + div(number1, number2));
                    break;
            }

        }

    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}
