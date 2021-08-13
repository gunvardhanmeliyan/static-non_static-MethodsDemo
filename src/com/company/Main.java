package com.company;

import java.util.Scanner;
class Test{
    int sum(int a,int b){
        return a+b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a=sc.nextInt();
        System.out.println("Enter number b: ");
        int b=sc.nextInt();
        Test t=new Test();
        int addition=t.sum(a,b);
        int product=Test.multiply(a,b);
        System.out.printf("Sum of %d and %d is %d",a,b,addition);
        System.out.println();
        System.out.printf("Product of %d and %d is %d",a,b,product);
    }
}