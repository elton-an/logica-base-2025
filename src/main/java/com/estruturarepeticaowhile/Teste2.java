package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class
Teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome dos alunos. Digite 'fim' para encerrar.");

        String sair = "N";
        int quantidadeAlunos = 0;

        while (!sair.equals("S")) {
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();
            quantidadeAlunos = quantidadeAlunos + 1;
            System.out.println("Digite S para sair");
            sair = scanner.next();
        }
        System.out.println("Total de alunos registrados: " + quantidadeAlunos);

        // Esse é o mesmo de cima
        int saida = 0;
        String nome = "";

       while (saida != 1){
           System.out.println("Digite o nome");
           nome = scanner.next();
           quantidadeAlunos = quantidadeAlunos + 1;
           System.out.println("Digite o número 1 para sair");

           System.out.println("A quantidade de aluno é: " + quantidadeAlunos);
       }
    }

}
