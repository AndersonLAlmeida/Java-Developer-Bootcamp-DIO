package com.github.AndersonLAlmeida.Iniciantes;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ExtremamenteBasico {

    public static void main(String[] args) throws IOException {

        /**Conjunto de funções abaixo fazem o processo de leitura do Buffer,
         * Transformação para String e guardar dentro de uma variável especifica
         * Para receber valores em mais de uma linha é preciso criar mais de uma
         * variavel br e st, do contrario a leitura de todas as variaveis será
         * feita na mesma linha com espaço entre os valores
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st1.nextToken());

        int X = A + B;
        System.out.println("X = " + X);
    }

}
