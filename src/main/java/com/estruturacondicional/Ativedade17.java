package main.java.com.estruturacondicional;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ativedade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a refeição");
        System.out.println("Vegetariano, Peixe, Frango ou Carne");
        String refeicao = scanner.next();
        System.out.println("Digite a sobremessa");
        System.out.println("Abacaxi, Sorvete ou Mousse");
        String sobremessa = scanner.next();
        System.out.println("Digite a bebida");
        System.out.println("Suco ou Refri");
        String bebida = scanner.next();

        int calorias = 0;

        if (refeicao.equals("Vegetariano")){
            calorias = 180;
        } else if (refeicao.equals("Peixe")) {
            calorias = 230;
        } else if (refeicao.equals("Frango")) {
            calorias = 250;
        } else if (refeicao.equals("Carne")) {
            calorias = 350;

            if (sobremessa.equals("Abacaxi")) {
                calorias = calorias + 75;
            } else if (sobremessa.equals("Sorvete")) {
                calorias = calorias + 110;
            } else if (sobremessa.equals("Mousse")) {
                calorias = calorias + 200;
            }
              if (bebida.equals("Suco")) {
                  calorias = calorias + 80;
              } else if (bebida.equals("refri")) {
                  calorias = calorias + 200;

                  System.out.println("A quantidade de calorias é: " + calorias);


              }
        }

        }


    }



