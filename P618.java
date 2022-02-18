package com.programame;

public class P618 {
    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }
    
    private static boolean casoDePrueba() {
        int numNiveles, numConsultas, nivelPartida, nivelDestino, resultado;
        int[] tamañoNiveles;
        

        if ((numNiveles = entrada.nextInt()) == 0) {
            return false;
        }
        
        tamañoNiveles = new int[numNiveles];
        
        for (int i = 0; i < tamañoNiveles.length; i++) {
            tamañoNiveles[i] = entrada.nextInt();
        }
        
        numConsultas = entrada.nextInt();
        
        for (int i = 0; i < numConsultas; i++) {
            resultado = 0;
            
            nivelPartida = entrada.nextInt() - 1;
            nivelDestino = entrada.nextInt() - 1;
            
            if (nivelPartida < nivelDestino){
                for (int j = nivelPartida + 1; j < nivelDestino; j++) {
                    resultado += tamañoNiveles[j];
                }
            }else if (nivelPartida == nivelDestino){
                resultado = tamañoNiveles[nivelPartida] * -1; 
            }else{
                for (int j = nivelDestino; j <= nivelPartida; j++) {
                    resultado -= tamañoNiveles[j];
                }
            }
            
            System.out.println(resultado);
        }
        System.out.println("---");
        
        return true;
    }
}