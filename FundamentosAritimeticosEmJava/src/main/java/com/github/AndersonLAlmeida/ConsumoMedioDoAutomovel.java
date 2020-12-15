package com.github.AndersonLAlmeida;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioDoAutomovel {

    public static void main(String[] args) throws IOException{

        Scanner read = new Scanner(System.in);

        int X;
        float Y;

        X = read.nextInt(); //Recebe a quantidade em KM percorrida
        Y = read.nextFloat(); //Recebe o total de combustível consumido em litros

        System.out.printf("%.3f km/l", (X/Y));
    }
}
