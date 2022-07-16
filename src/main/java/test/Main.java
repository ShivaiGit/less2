package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 0; j <= h + 1; j++) {
                if (i + j <= 4) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
