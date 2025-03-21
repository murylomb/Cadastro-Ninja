package DesafioCadastro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int index = 0;
        int capacidade = 2;
        String[] ninja = new String[capacidade];

        while (true) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    if (index == ninja.length) {
                        capacidade *= 2;
                        String[] novoNinja = new String[capacidade];
                        for (int i = 0; i < ninja.length; i++) {
                            novoNinja[i] = ninja[i];
                        }
                        ninja = novoNinja;
                    }

                    System.out.print("Digite o nome do Ninja: ");
                    String novoNinja = entrada.nextLine();
                    ninja[index] = novoNinja;
                    index++;
                    break;
                case 2:
                    if (index == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("\nLista de Ninjas:");
                        for (int i = 0; i < index; i++) {
                            System.out.println(ninja[i]);
                        }
                    }
                    break;
                case 3:
                    // Encerra o programa
                    System.out.println("Encerrando programa!");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
