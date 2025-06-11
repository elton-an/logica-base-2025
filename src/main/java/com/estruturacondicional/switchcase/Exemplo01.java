package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        System.out.println("1 para cadastrar Usuário");
        System.out.println("2 para deletar Usuário");
        System.out.println("3 para deletar Usuário");
        System.out.println("4 para sair");

        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.println("Cadastrar Usuário");
        } else if (menu == 2) {
            System.out.println("Deletar Usuário");
        } else if (menu == 3) {
            System.out.println("Atualizar Usuário");
        } else if (menu == 4) {
            System.out.println("Sair");
        }
          switch (menu){
              case 1:
                  System.out.println("Cadastrar Usuário");
                  break;
              case 2:
                  System.out.println("Deletar Usuário");
                  break;
              case 3:
                  System.out.println("Atualizar Usuário");
                  break;
              case 4:
                  System.out.println("Sair");
                  break;

    }

    }
    }




