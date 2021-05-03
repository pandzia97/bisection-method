package com.company;

import java.util.Scanner;

public class Main {
    static final float EPSILON = (float) 0.01;

    static double func(double x) {
        return x * x * x - x * x + 2;
    }

    static void bisection(double a, double b) {
        if (func(a) * func(b) >= 0) {
            System.out.println("You have not assumed" + " right a and b");
            return;
        }
        double c = a;
        while ((b - a) >= EPSILON) {
            c = (a + b) / 2;

            if (func(c) == 0.0) {
                break;
            } else if (func(c) * func(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        System.out.printf("The value of root is : %.4f", c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        bisection(a, b);
    }
}
