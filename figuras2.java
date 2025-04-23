package com.mycompany.java;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        q2();
    }

    public static void q1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número ímpar:");
        int num = scanner.nextInt();

        scanner.close();
        for (int i=0; i < num;i++) {
            for (int j=0; j<num-i+1;j++) {
                System.out.print(" ");
            }
            for (int j=0; j<(i*2)+1 ;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void q2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número ímpar:");
        int num = scanner.nextInt();

        scanner.close();
        for (int i=0; i < num;i++) {
            for (int j=0; j<num-i+1;j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(i*2)+1 ;j++) {
                if (j==1 || j==(i*2)+1 || i==num-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}