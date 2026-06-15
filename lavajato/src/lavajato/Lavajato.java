/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavajato;

import java.util.ArrayList;
import java.util.Scanner;

public class Lavajato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n======== LAVA JATO =====================");
            System.out.println("\n======== BEM-VINDO AO LAVA WHASH =======");
            System.out.println("\n======== ESCOLHA UMA OPCAO!!!! =========");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Clientes");
            System.out.println("3 - Atualizar Cliente");
            System.out.println("4 - Excluir Cliente");
            System.out.println("5 - Cadastrar Veiculo");
            System.out.println("6 - Consultar Veiculos");
            System.out.println("7 - Contratar Servico");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {

                case 1:

                    System.out.print("Codigo do Cliente: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    clientes.add(new Cliente(codigo, nome, telefone));

                    System.out.println("Cliente cadastrado!");
                    break;

                case 2:

                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {

                        for (int i = 0; i < clientes.size(); i++) {

                            Cliente c = clientes.get(i);

                            System.out.println("\nPosicao: " + i);
                            System.out.println("Codigo: " + c.getCodigo());
                            System.out.println("Nome: " + c.getNome());
                            System.out.println("Telefone: " + c.getTelefone());
                        }
                    }

                    break;

                case 3:

                    System.out.print("Digite a posicao do cliente: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 0 && pos < clientes.size()) {

                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        clientes.get(pos).setNome(novoNome);

                        System.out.println("Cliente atualizado!");
                    } else {
                        System.out.println("Posicao invalida!");
                    }

                    break;

                case 4:

                    System.out.print("Digite a posicao para excluir: ");
                    int excluir = sc.nextInt();

                    if (excluir >= 0 && excluir < clientes.size()) {

                        clientes.remove(excluir);

                        System.out.println("Cliente removido!");
                    } else {
                        System.out.println("Posicao invalida!");
                    }

                    break;

                case 5:

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Cor: ");
                    String cor = sc.nextLine();

                    veiculos.add(new Veiculo(modelo, placa, cor));

                    System.out.println("Veiculo cadastrado!");
                    break;

                case 6:

                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veiculo cadastrado.");
                    } else {

                        for (Veiculo v : veiculos) {

                            System.out.println("----------------");
                            System.out.println("Modelo: " + v.getModelo());
                            System.out.println("Placa: " + v.getPlaca());
                            System.out.println("Cor: " + v.getCor());
                        }
                    }
                    

                    break;
                    

                case 0:

                    System.out.println("Encerrando sistema...");
                    break;
                    case 7:

    System.out.println("\n===== SERVICOS =====");
    System.out.println("1 - Lavagem Simples - R$50");
    System.out.println("   (Lavagem externa)");

    System.out.println("2 - Lavagem Intermediaria - R$75");
    System.out.println("   (Lavagem interna e externa)");

    System.out.println("3 - Lavagem Completa - R$125");
    System.out.println("   (Interna, externa e pretinho nas rodas)");

    System.out.println("4 - Lavagem Premium - R$150");
    System.out.println("   (Interna, externa, pretinho e polimento com cera)");

    System.out.print("Escolha: ");
    int servico = sc.nextInt();

    switch(servico){

        case 1:
            System.out.println("Serviço escolhido: Lavagem Simples");
            System.out.println("Valor: R$50,00");
            break;

        case 2:
            System.out.println("Serviço escolhido: Lavagem Intermediaria");
            System.out.println("Valor: R$75,00");
            break;

        case 3:
            System.out.println("Serviço escolhido: Lavagem Completa");
            System.out.println("Valor: R$125,00");
            break;

        case 4:
            System.out.println("Servico escolhido: Lavagem Premium");
            System.out.println("Valor: R$150,00");
            break;

        default:
            System.out.println("Opcao invalida!");
    }

    break;

                default:

                    System.out.println("Opção invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}