package io.zwt.chap07;

import java.util.Scanner;

public class Max3Method {

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");  int a = stdIn.nextInt();
        System.out.print("整数b：");  int b = stdIn.nextInt();
        System.out.print("整数c：");  int c = stdIn.nextInt();

        System.out.println("最大值是" + max(a, b, c) + "。");
    }
}
