package SistemaBancaDeRevista.Entidades.Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import SistemaBancaDeRevista.Entidades.Bebida;
import SistemaBancaDeRevista.Entidades.Doce;
import SistemaBancaDeRevista.Entidades.Produto;
import SistemaBancaDeRevista.Entidades.Revista;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        int opc;
        int opcC;

        do {

            System.out.println("=============MENU=============");
            System.out.println("1-Para Comprar uma Revista");
            System.out.println("2-Para Comprar um Doce");
            System.out.println("3-Para Comprar uma Bebida");
            opcC = sc.nextInt();

            switch (opcC) {
                case 1: {
                    System.out.println("--------------Revista----------");
                    System.out.println("Informe o codigo da revista: ");
                    int codigo = sc.nextInt();
                    System.out.println("Informe o nome da revista:");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Informe a editora da revista:");
                    String editora = sc.nextLine();
                    Revista user1 = new Revista(codigo, nome, editora);
                    list.add(user1);
                    break;
                }
                case 2: {
                    System.out.println("--------------Doce---------");
                    System.out.println("Informe o codigo do Doce:");
                    int codigo = sc.nextInt();
                    System.out.println("Informe o nome do Doce :");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Informe a marca do Doce :");
                    String marca = sc.nextLine();
                    Doce user1 = new Doce(codigo, nome, marca);
                    list.add(user1);
                    break;
                }
                case 3: {
                    System.out.println("-------------Bebida----------");
                    System.out.println("Informe o codigo da Bebida:");
                    int codigo = sc.nextInt();
                    System.out.println("Informe o nome da Bebida:");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Informe o tipo da Bebida:");
                    String tipo = sc.nextLine();
                    Bebida user1 = new Bebida(codigo, nome, tipo);
                    list.add(user1);
                    break;
                }
            }
            System.out.println("=============MENU=============");
            System.out.println("4-Para REPETIR/CONTINUAR a compra");
            System.out.println("5-Para FINALIZAR a compra");
            opc = sc.nextInt();
        } while (opc == 4);
        System.out.println("-------PEDIDOS:---------");

        for (Produto user1 : list) {
            System.out.println();
            System.out.print("Nome do produto: " + user1.getNome());
            System.out.println("Codigo do Produto: " + user1.getCodigo());
            System.out.println();
            System.out.println("------------------------");
        }
        sc.nextLine();
        System.out.println();
        System.out.println("===============FIM================");
        System.out.println("AGRADECO! Pela compra na nossa banca.");
        System.out.println();
        System.out.println("===================================");
        sc.close();
    }

}
