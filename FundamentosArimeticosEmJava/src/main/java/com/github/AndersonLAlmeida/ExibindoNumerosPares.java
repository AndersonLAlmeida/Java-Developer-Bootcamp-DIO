package com.github.AndersonLAlmeida;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExibindoNumerosPares {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = 0;

        N = Integer.parseInt(st.nextToken());

        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                if((i % 2) == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
