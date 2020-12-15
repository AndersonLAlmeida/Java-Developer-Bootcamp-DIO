package com.github.AndersonLAlmeida;

import java.util.Scanner;
import java.io.IOException;

public class QuantidadeDeNumerosPositivos {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in); //Forma mais efetiva de receber valores em varias linhas do que o BufferedReader
        double numero;
        int positivo = 0;

        for (int i = 0; i < 6; i++) {
            numero = ler.nextDouble();

            if (numero > 0) {
                positivo++;
            }
        }

        System.out.println(positivo + " valores positivos");
    }
}