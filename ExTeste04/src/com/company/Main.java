package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor correspondente ao prêmio ganho na loteria");
        double premio = teclado.nextDouble();
        double imposto1 = premio * 2.45 / 100;
        double imposto2 = premio * 15 / 100;
        double imposto3 = premio * 3 / 100;
        double premioComDesconto = premio - imposto1 - imposto2 - imposto3;
        System.out.println("O valor total do prêmio com desconto é " + imposto1);
    }
}
