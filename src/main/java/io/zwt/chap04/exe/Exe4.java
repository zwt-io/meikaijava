package io.zwt.chap04.exe;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("倒数。");
        int x;
        do {
            System.out.print("正整数值：");
            x = stdIn.nextInt();
        } while (x <= 0);

        while (x >= -1) {
            System.out.println(x);
            x--;
        }
    }
}
