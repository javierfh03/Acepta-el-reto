package com.programame;

import java.util.*;

public class P291{

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int num, tmp, con;
        StringTokenizer datos;
        String palabra; 
        LinkedHashSet<Integer> lineas;
        Set<String> vectorPalabras;
        TreeMap<String, LinkedHashSet<Integer>> palabras = new TreeMap();
        Iterator it, itLineas;
        
        if ((num = entrada.nextInt()) == 0) {
            return false;
        }
        
        entrada.nextLine();

        for (Integer i = 0; i < num; i++) {
            datos = new StringTokenizer(entrada.nextLine(), " ");
            
            while (datos.hasMoreElements()) {
                palabra = datos.nextElement().toString().toLowerCase();
                
                if (palabra.length() > 2){
                    if (palabras.containsKey(palabra)){
                        lineas = palabras.get(palabra);
                        
                        if (!lineas.contains(i)){
                            lineas.add(i);
                            palabras.put(palabra, lineas);
                        }
                    }else{
                        lineas = new LinkedHashSet<>();
                        lineas.add(i);
                        palabras.put(palabra, lineas);
                    }
                }
            }
        }
        
        vectorPalabras = palabras.keySet();
        it = vectorPalabras.iterator();
        
        while (it.hasNext()) {
            palabra = (String) it.next();
            con = 0;
            System.out.print(palabra + " ");
            
            itLineas = palabras.get(palabra).iterator();
            
            while (itLineas.hasNext()) {
                tmp = (int) itLineas.next();
                tmp++;
                
                if ((palabras.get(palabra).size() - 1) > con){
                    System.out.print(tmp + " ");
                }else{
                    System.out.println(tmp);
                }
                
                con ++;
            }
        }
        
        System.out.println("----");
        
        return true;
    }
}
