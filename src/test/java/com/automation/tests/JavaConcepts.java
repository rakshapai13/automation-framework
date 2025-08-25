package com.automation.tests;

import java.util.Scanner;

public class JavaConcepts {

    public void reverseFunction()
    {
        String a="Hello World";
        String rev="";
        for(int i=a.length()-1;i>=0;i--)
        {
            rev=rev+a.charAt(i);
        }
        System.out.println("The original String is "+a);
        System.out.println("Reversing of the sting "+rev);
    }

    public void patternDisplay(){
        int k=1;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("We will take input from user and print it");
        Scanner sc=new Scanner(System.in);
        String myString=sc.next();
        int myInt=sc.nextInt();
        sc.close();
        System.out.println("My string is "+ myString);
        System.out.println("My Integer is "+myInt);

        System.out.println("We are swapping 2 numbers with and without using 3rd variable");
        int a =10; int b=15;
        a=a+b; b=a-b; a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int c=0;
        c=b; b=a; a=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        JavaConcepts jc=new JavaConcepts();
        System.out.println("We are creating a method, where we reverse the string");
        jc.reverseFunction();

        System.out.println("We will play with some pattern programming");
        jc.patternDisplay();


    }
}
