package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;


        //Seção do layout do menu
        System.out.println("----------------------------------------------");
        System.out.println("|          Programa de resolução   |");
        System.out.println("|              de cálculos         |");
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de cálculos");
        System.out.println("Escolha a opção desejada");
        System.out.println("1 - Conversor de moedas");
        System.out.println("2 - Conversor de medidas");
        System.out.println("3 - Conversor de temperatura");
        System.out.println("Opção: ");
        menu = scanner.nextInt();
        System.out.println(" A opção escolhida é a " + menu);
        //LÊ A ENTRADA DO TECLADO DO USUÁRIO11
        // Execuçaõ do menu no nível correto

        switch (menu) {
                case 1:
                System.out.println("Entrou no conversão de moedas");
                break;
                case 2:
                System.out.println("entrou no conversão de medidas");
                case 3:
                System.out.println("Entrou no conversão de tempera");
                break;
default:
        System.out.println("Opção inválida");
        break;





        }

        return;

        //Execução do menu do nível complicado
        //if (menu == 1) {
        //System.out.println("Entrou no conversor de moeda");
        //Verifica se digitou o valor 1, executa isso

        //} else {
        //if (menu == 2) {
       /// System.out.println(" Entrou no conversor de medidas");
        //} else {
        //se não digitou o valor 2, executa isso

        //if (menu == 3) {
       //System.out.println("Entrou no conversor de temperatura");
        //} else {
        // se não digitou o valor 3, executa isso
        //System.out.println("Opção inválida");
                    //}
                 //}
             //}
           }
          }
