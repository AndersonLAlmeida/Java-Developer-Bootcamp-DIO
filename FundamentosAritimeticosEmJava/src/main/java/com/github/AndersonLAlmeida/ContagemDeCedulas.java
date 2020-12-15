package com.github.AndersonLAlmeida;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContagemDeCedulas {

    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);

        List<Integer> cedulas = new ArrayList<>();
        int N;

        cedulas.add(100);
        cedulas.add(50);
        cedulas.add(20);
        cedulas.add(10);
        cedulas.add(5);
        cedulas.add(2);
        cedulas.add(1);

        N = read.nextInt();

        if (N > 0 && N < 1000000){
            System.out.println(N);

            for (Integer cedula:cedulas) {
                System.out.printf("%d nota(s) de R$ %d,00\n", (N / cedula), cedula);
                N = N - ((N / cedula) * cedula);
            }
        }
    }
}
