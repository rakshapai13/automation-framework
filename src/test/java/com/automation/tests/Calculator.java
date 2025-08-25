package com.automation.tests;

import java.util.Scanner;

public class Calculator {

/* This is an example for Class, objects and constructor definition and usage
    Constructor is called whenever an object of the class is created
    Constructor will not return any values
    Name of the constructor should be same as the name of the class name
    There can be parameterized constructors as well
    Whenever a user explicitly defines a constructor then that constructor will be called
    If the user does not specify any constructor, then the default constructor is called */

    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        if(b==0)
        {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        else return a/b;
    }

    //Constructor
    public Calculator()
        {
           System.out.println("Inside Calculator constructor");
        }
    public  Calculator(int a , int b)
    {
        System.out.println("Inside Calculator constructor with parameters");
        System.out.println("a"+a+" plus b"+b+" is "+(a+b));
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        Calculator c1=new Calculator(3,9);
        System.out.println("Addition of 2 numbers is "+c.add(10,20));
        System.out.println("Subtraction of 2 numbers is "+c.sub(10,20));
        System.out.println("Multiplication of 2 numbers is "+c.mul(10,20));
        System.out.println("Division of 2 numbers is "+c.div(10,20));
        //Taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition of 2 numbers is "+c.add(a,b));
        System.out.println("Subtraction of 2 numbers is "+c.sub(a,b));
        System.out.println("Multiplication of 2 numbers is "+c.mul(a,b));
        System.out.println("Division of 2 numbers is "+c.div(a,b));
        //Switch example
        System.out.println("\nChoose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Result: " + c.add(a,b));
                break;
            case 2:
                System.out.println("Result: " + c.sub(a,b));
                break;
            case 3:
                System.out.println("Result: " + c.mul(a,b));
                break;
            case 4:
                System.out.println("Result: " + c.div(a,b));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
        }
    }


