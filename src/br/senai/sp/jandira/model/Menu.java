package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        menuCadastro();
    }

    public static void menuCadastro() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------- Bem vindo ao menu -----------------------------");
            System.out.println("1. Cadastrar Mamífero");
            System.out.println("2. Cadastrar Ave");
            System.out.println("3. Cadastrar Réptil");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarMamifero(scanner);
                    break;
                case 2:
                    cadastrarAve(scanner);
                    break;
                case 3:
                    cadastrarReptil(scanner);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("É obrigatório escolher uma das 3 opções.");
            }
        }
    }

    public static void cadastrarMamifero(Scanner scanner) {
        System.out.println("------------------- Cadastro de Mamífero --------------------------");
        System.out.print("Qual o nome do mamífero? ");
        scanner.nextLine();
        System.out.print("Qual a idade do mamífero? ");
        scanner.nextLine();
        System.out.print("Qual o sexo do mamífero? ");
        scanner.nextLine();
        System.out.print("Qual o número de identificação do mamífero? ");
        scanner.nextLine();

        System.out.println("Mamífero cadastrado com sucesso!");
        System.out.println("----------------------------------------------------------------");
    }

    public static void cadastrarAve(Scanner scanner) {
        System.out.println("------------------- Cadastro de Ave --------------------------");
        System.out.print("Qual o nome da ave? ");
        scanner.nextLine();
        System.out.print("Qual a idade da ave? ");
        scanner.nextLine();
        System.out.print("Qual o sexo da ave? ");
        scanner.nextLine();
        System.out.print("Qual o número de identificação da ave? ");
        scanner.nextLine();

        System.out.println("Ave cadastrada com sucesso!");
        System.out.println("----------------------------------------------------------------");
    }

    public static void cadastrarReptil(Scanner scanner) {
        System.out.println("------------------- Cadastro de Réptil --------------------------");
        System.out.print("Qual o nome do réptil? ");
        scanner.nextLine();
        System.out.print("Qual a idade do réptil? ");
        scanner.nextLine();
        System.out.print("Qual o sexo do réptil? ");
        scanner.nextLine();
        System.out.print("Qual o número de identificação do réptil? ");
        scanner.nextLine();

        System.out.println("Réptil cadastrado com sucesso!");
        System.out.println("----------------------------------------------------------------");
    }
}
