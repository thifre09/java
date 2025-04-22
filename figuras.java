package com.mycompany.aula2;
import java.util.Scanner;
import java.util.Random;

public class figuras {

    public static void main(String[] args) {
        q4();
    }
    
    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do lado 1:");
        int lado1 = scanner.nextInt();
        
        System.out.println("Digite o tamanho do lado 2:");
        int lado2 = scanner.nextInt();
        
        for (int i=0; i<lado1;i++) {
            for (int j=0; j<lado2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static void q2() {
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 10;j++) {
                if (i==1) {
                    if (j==0 || j==9) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                else {
                    System.out.print("#");
                }
                
            }
            System.out.println();
        }
    }
    
    public static void q3() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da matriz:");
        int tamanho = scanner.nextInt();
        
        for (int i=0;i<tamanho;i++) {
            for (int j=0;j<tamanho;j++) {
                Random random = new Random();
                int num = random.nextInt(1,10);
                System.out.print(num);
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static void q4() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da matriz:");
        int tamanho = scanner.nextInt();
        
        scanner.close();
        for (int i=0; i<tamanho;i++) {
            for (int j=0; j<tamanho;j++) {
                if (i==j && (i+j+2 == tamanho+1)) {
                    System.out.print("3");
                } else if (i==j || (i+j+2 == tamanho+1)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    } 
}
