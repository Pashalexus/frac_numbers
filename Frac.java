package com.company;

public class Frac {
    int chisl, znam;
    double rat;
    public static void sum(Frac a, Frac b, Frac c) { // сумма
        c.chisl = a.chisl * b.znam + b.chisl * a.znam;
        c.znam = a.znam * b.znam;
    }
    public static void sub(Frac a, Frac b, Frac c) { // разность
        c.chisl = a.chisl * b.znam - b.chisl * a.znam;
        c.znam = a.znam * b.znam;
    }
    public static void mul(Frac a, Frac b, Frac c) { // произведение
        c.chisl = a.chisl * b.chisl;
        c.znam = a.znam * b.znam;
    }
    public static void div(Frac a, Frac b, Frac c) { // частное
        c.chisl = a.chisl * b.znam;
        c.znam = a.znam * b.chisl;
    }
    public static void euclide(Frac a) { // алгоритм Евклида для сокращения дроби
        int x = Math.abs(a.chisl);
        int y = Math.abs(a.znam);
        int z;
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        z = Math.max(x, y);
        if (z != 0){
            a.chisl = a.chisl / z;
            a.znam = a.znam / z;
        }
    }
    public static double rat(Frac a) { // печать десятичной записи дроби
        a.rat = (double) a.chisl/a.znam;
        return 0;
    }
    public static void comb(Frac a) { // печать числа в смешанном виде
        int z = Math.abs(a.znam);
        int y = Math.abs(a.chisl) % z;
        int x = a.chisl / a.znam;
        if (a.chisl * a.znam < 0)  {System.out.print("-");}
        if (x != 0)  {System.out.print(Math.abs(x)+" ");}
        if (y != 0) {System.out.print(y+"/"+z);}
        if ((x == 0) & (y == 0)) {System.out.print("0");}
    }
    public static void printsum(Frac a) { // печать суммы
        System.out.print("sum = ");
        Frac.comb(a);
        Frac.rat(a);
    }
    public static void printsub(Frac a) { // печать разности
        System.out.print("sub = ");
        Frac.comb(a);
        Frac.rat(a);
    }
    public static void printmul(Frac a) { // печать произведения
        System.out.print("mul = ");
        Frac.comb(a);
        Frac.rat(a);
    }
    public static void printdiv(Frac a) { // печать частного
        System.out.print("div = ");
        Frac.comb(a);
        Frac.rat(a);
    }
}