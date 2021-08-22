package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de dias da campanha: ");
        int dias = teclado.nextInt();
        double valorCampanha = 2 * dias;
        System.out.println(dias + " dias de campanha custará " + valorCampanha);


    }
}
