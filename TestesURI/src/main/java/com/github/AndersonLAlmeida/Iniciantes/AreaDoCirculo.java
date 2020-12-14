package com.github.AndersonLAlmeida.Iniciantes;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AreaDoCirculo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double raio = Double.parseDouble(st.nextToken());

        double n = 3.14159;

        double area = n * (raio*raio);

        System.out.printf("A=%.4f\n", area); //Para o URI é sempre preciso acabar o código na próxima linha, por isso ou \n ou println
    }
}
