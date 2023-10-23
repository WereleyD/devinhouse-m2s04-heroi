package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;
import org.devinhouse.superherois.repository.PersonagemRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {
    public static void cadastrarPersonagem() {
        PersonagemRepository pr = new PersonagemRepository();
        while (true) {
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.print("\n1 - Cadastrar Herói\n" +
                    "2 - Cadastrar Vilão\n" +
                    "3 - Listar\n" +
                    "4 - Sair\n" +
                    "Escolha uma das opções acima: ");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("\nCadastrar Herói");
                    System.out.print("Digite o nome do herói: ");
                    String nomeH = sc.nextLine();
                    System.out.print("Digite o superpoder do herói: ");
                    String superpoderH = sc.nextLine();
                    System.out.print("Digite o nome real do herói: ");
                    String nomeReal = sc.nextLine();
                    Heroi heroi = new Heroi(nomeH, superpoderH, nomeReal);
                    pr.salvarPersonagem(heroi);
                    System.out.println("\nPersonagem cadastrado com sucesso");
                    break;
                case 2:
                    System.out.println("\nCadastrar Vilão");
                    System.out.print("Digite o nome do vilão: ");
                    String nomeV = sc.nextLine();
                    System.out.print("Digite o superpoder do vilão: ");
                    String superpoderV = sc.nextLine();
                    System.out.print("Digite o tempo de prisão do vilão: ");
                    try {
                        int tempoDePrisao = Integer.parseInt(sc.nextLine());
                        Vilao vilao = new Vilao(nomeV, superpoderV, tempoDePrisao);
                        pr.salvarPersonagem(vilao);
                        System.out.println("\nPersonagem cadastrado com sucesso");
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("\nPersonagem não cadastrado: " + e.getMessage());
                        break;
                    }
                case 3:
                    System.out.println("\nListar");
                    pr.listarPersonagem();
                    break;
                case 4:
                    return;
                default:
            }
        }
    }
}
