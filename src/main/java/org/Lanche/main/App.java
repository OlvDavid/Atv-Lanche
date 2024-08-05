package org.Lanche.main;

import org.Lanche.entities.Lanche;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class App
{
    public static void main( String[] args ) {

        ArrayList<Lanche> list = new ArrayList<>();

        boolean sair = true;
        while(sair){
            System.out.println("MENU: ");
            System.out.println("1- Cadastrar Lanche: ");
            System.out.println("2= Listar Lanches: ");
            System.out.println("3- Sair");
            int menu = new Scanner(System.in).nextInt();

            switch(menu){
                case 1:
                    System.out.println("Informe o codigo do lanche: ");
                    int id = new Scanner(System.in).nextInt();

                    System.out.println("Informe o nome do lanche:");
                    String nome = new Scanner(System.in).nextLine();

                    System.out.println("Informe o preço do lanche: ");
                    double preco = new Scanner(System.in).nextDouble();

                    System.out.println("Informe o caminho da imagem: ");
                    String caminhoImagem = new Scanner(System.in).nextLine();

                    Lanche l1 = new Lanche(nome, id, caminhoImagem, preco);

                    list.add(l1);

                    System.out.println(nome + " Cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de lanches");
                    for(Lanche lanche : list){
                        System.out.println("");
                        System.out.println("ID: " + lanche.getId());
                        System.out.println("Nome: " + lanche.getNome());
                        System.out.println("Preço: " + "R$ " + lanche.getPreco());
                        System.out.println("Caminho da Imagem: " + lanche.getCaminhoImagem());
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Saindo do Progama");
                    exit(0);

            }
        }
    }
}
