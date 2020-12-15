package com.github.AndersonLAlmeida;

import java.util.Scanner;
import java.io.IOException;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException{

        Scanner read = new Scanner(System.in); //Criando scanner para leitura dos dados

        Integer numero;
        int par, impar, positivo, negativo;

        par = impar = positivo = negativo = 0;

        for (int i = 0; i < 5; i++) {
            numero = read.nextInt();

            if((numero % 2) == 0){
                par++;
            }
            else {
                impar++;
            }

            if(numero > 0){
                positivo++;
            }
            else if(numero < 0) {
                negativo++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}