package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de cópias:");
        int copias = scanner.nextInt();

        double total = 0.0;

        if ((copias >= 1) && (copias <= 10)) {
            total = copias * 0.10;
        } else if ((copias >= 11) && (copias <= 50)) {
            total = copias * 0.08;
        } else if (copias > 50) {
            total = copias * 0.05;
        }

        System.out.println("Valor total a pagar" + total);


        }
    }

