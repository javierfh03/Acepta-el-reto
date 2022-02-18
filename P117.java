package com.programame;

import java.util.Scanner;

public class P117 {
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] lista;
        int cantidad;
        int contador = 0;

        cantidad = sc.nextInt();
        
        lista = new String[cantidad];

        while (contador < cantidad){
            sc.next();
            lista[contador] = sc.next();
            contador++;
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Hola, " + lista[i] + ".");
        }
    }
}
