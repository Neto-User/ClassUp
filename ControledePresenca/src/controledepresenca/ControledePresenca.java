
package controledepresenca;

import java.util.Scanner;
import java.util.ArrayList;

public class ControledePresenca {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\nDigite 1. Adicionar aluno");
            System.out.println("Digite 2. Registrar presença");
            System.out.println("Digite 3. Ver frequência");
            System.out.println("Digite 4. Sair");
            System.out.print("Escolha: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do aluno: ");
                    String nome = scan.nextLine().trim();

                    boolean alunoExistente = false;
                    for (Aluno a : alunos) {
                        if (a.getNome().equalsIgnoreCase(nome)) {
                            alunoExistente = true;
                            break;
                        }
                    }

                    if (alunoExistente) {
                        System.out.println("Aluno já existente!");
                    } else {
                        alunos.add(new Aluno(nome));
                        System.out.println("Aluno adicionado!");
                    }
                    break;

                case 2:
                    System.out.print("\nNome do aluno presente: ");
                    String nomePresente = scan.nextLine();
                    boolean encontrado = false;
                    for (Aluno a : alunos) {
                        if (a.getNome().equalsIgnoreCase(nomePresente)) {
                            a.registrarPresenca();
                            System.out.println("Presença registrada.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nFrequência dos alunos:");
                    for (Aluno a : alunos) {
                        System.out.println(a.getNome() + ": " + a.getPresencas() + " presenças");
                        System.out.println("Data do aluno Presente : " + a.getDatasPresenca());
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
