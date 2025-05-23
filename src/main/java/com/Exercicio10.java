package main.java.com;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias:");
        int dias = scanner.nextInt();
        System.out.println("Digite a quantidade de horas:");
        int horas = scanner.nextInt();
        System.out.println("Digite a quantidade de minuto:");
        int minutos = scanner.nextInt();
        System.out.println("Digite a quantidade de segundo:");
        int segundos = scanner.nextInt();

        int diasSegundos = dias * 24 * 60 * 60;
        int horasSegundos = horas * 60 * 60;
        int minutosSegundos = minutos * 60;

        int ttotalSegundos = diasSegundos + horasSegundos + minutosSegundos + segundos;

        System.out.println("O total de segundos é: " + ttotalSegundos);







    }

}
