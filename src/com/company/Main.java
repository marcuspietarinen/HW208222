package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("HW 1");
        int a = 8;
        int b = 8;

        if (a == b)
            System.out.println((a + b)*(a + b));
        else
            System.out.println(a + b);
        System.out.println();

        System.out.println("HW 2");
        for (int c = 10; c <= 37; c = c + 3)
            System.out.print(c + ", ");
        System.out.println();
        for (int d = 998; d >= 900; d = d - 2)
            System.out.print(d + ", ");
        System.out.println();
        for (int f = 1; f <= 20; f++)
            System.out.print((int)Math.pow(-1, f) + ", ");
        System.out.println();
        for (int g = 1; g <= 60; g++)
            if (g % 3 == 0)
                System.out.print("9, ");
            else
                System.out.print("7, ");
        System.out.println();
        System.out.println();
        System.out.println("HW 4");
        int h = 30; int i = 123;
        if (h > 99 && i < 51)
            System.out.println("1");
        else
            System.out.println("0");
        System.out.println();
        System.out.println("HW 5");
        int j = 4;
        if (j <= 2)
            System.out.println(3);
        else if (j > 5)
            System.out.println(9 + (j - 5) * 3);
        else
            System.out.println(3 + (j - 2) * 2);
        System.out.println();
        System.out.println("HW 6");
        int k = 1;
        while (k % 47 != 0)
        {
            System.out.print(k * k * k + 91 + " ");
            k++;
        }
        System.out.println();
        System.out.println();
        System.out.println("HW 7");
        int l = 8;
        if (l < 0)
            System.out.println("l must be positive");
        else
            for (int m = 1; m <= l; m++)
                System.out.print((int)Math.pow(3, m) + " ");
        System.out.println();
        int n = 3;
            for (int o = 1; o <= n; o++)
                System.out.println((int)Math.pow(l, n));
        System.out.println();
        System.out.println("HW 8");

        int p = 100;
        if (p > 100 || p < 0)
        {
            System.out.println("invalid value");
        }
        while (p > 0)
        {
            p--;
            int q =  p * (p - 20) * (p - 100) + 120000;
            System.out.print(q + " ");
        }




    }
}
