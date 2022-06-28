package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args) {
        int i;
        int dni;
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int night = scan.nextInt();
        int tree = scan.nextInt();
        if (day == 0) {
            System.out.println("Impossible");
        } else {
            if (day == night && tree > day) {
                System.out.println("Impossible");
            } else {
                if (day<night && day<tree) {
                    System.out.println("Impossible");
                } else {
                    if (day<night && day>tree) {
                        System.out.println(1);
                    } else {
                        if (day==night && tree<day) {
                            System.out.println(1);
                        } else {
                            if (night==0 && day>tree) {
                                System.out.println(1);
                            } else {
                                dni = (tree - night) / (day - night);
                                System.out.println(dni);
                            }
                        }
                    }
                }
            }
        }
    }
}
