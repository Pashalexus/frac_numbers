package com.company;

import java.util.Scanner;

public class MainFrac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Frac a1 = new Frac();
        Frac a2 = new Frac();
        Frac a3 = new Frac();
        Frac a4 = new Frac();
        Frac a5 = new Frac();
        Frac a6 = new Frac();
        System.out.println();
        System.out.println("Введите числитель и знаменатель первой дроби");
        int chisl = in.nextInt();
        int znam = in.nextInt();
        a1.chisl = chisl;
        a1.znam = znam;
        if (a1.znam != 0) {
            Frac.rat(a1);
            System.out.print(" = ");
            System.out.printf("%.3f",a1.rat);
            System.out.println();
        }
        System.out.println();
        System.out.println("Введите числитель и знаменатель второй дроби");
        chisl = in.nextInt();
        znam = in.nextInt();
        a2.chisl = chisl;
        a2.znam = znam;
        if (a2.znam != 0) {
            Frac.rat(a2);
            System.out.print(" = ");
            System.out.printf("%.3f",a2.rat);
            System.out.println();
        }
        System.out.println();
        if (a1.znam != 0 & a2.chisl != 0 & a2.znam != 0) {
            Frac.sum(a1, a2, a3);
            Frac.sub(a1, a2, a4);
            Frac.mul(a1, a2, a5);
            Frac.div(a1, a2, a6);
            Frac.euclide(a3);
            Frac.euclide(a4);
            Frac.euclide(a5);
            Frac.euclide(a6);
            Frac.rat(a3);
            Frac.rat(a4);
            Frac.rat(a5);
            Frac.rat(a6);
            Frac.printsum(a3);
            System.out.print(" = ");
            System.out.printf("%.3f",a3.rat);
            System.out.println();
            Frac.printsub(a4);
            System.out.print(" = ");
            System.out.printf("%.3f",a4.rat);
            System.out.println();
            Frac.printmul(a5);
            System.out.print(" = ");
            System.out.printf("%.3f",a5.rat);
            System.out.println();
            Frac.printdiv(a6);
            System.out.print(" = ");
            System.out.printf("%.3f",a6.rat);
        }
        else {
            System.out.println("Увы, вы поделили на ноль. Вы самое слабое звено, прощайте");
        }
    }
}