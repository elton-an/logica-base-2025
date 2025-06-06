package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo de empresa:");
        int tempo = scanner.nextInt();
        System.out.println("Digite a função: 1 - analista; 2 - Programador - 3 Superior");
        int funcao = scanner.nextInt();
        System.out.println("Digite a escolaridade:");
        System.out.println("1 - Com curso superior");
        System.out.println("2 - Com curso superior e 3 - Com pós Graduação");
        int escolaridade = scanner.nextInt();

        int aumento = 0;

        if (tempo <= 5) {
            aumento = 2;
        } else if (tempo <= 10) {
            aumento = 4;
        } else {
            aumento = 6;

            if (funcao == 1) {
                aumento = aumento + 5;
            } else if (funcao == 2) {
                aumento = aumento + 4;
            } else if (funcao == 3) {
                aumento = aumento + 3;

                if (escolaridade == 2) {
                    aumento = aumento + 7;
                } else if (escolaridade == 3) {
                    aumento = aumento + 9;

                    System.out.println("O percentual de aumento é: " + aumento);


            }

        }

        }
    }
    }

