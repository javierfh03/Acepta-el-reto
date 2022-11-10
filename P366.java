import java.util.*;

public class P366 {
    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int numNiños, acComportamiento, acPeso;
        Object[] ac, ac1; 
        TreeMap<Integer, ArrayList<Integer>> lista = new TreeMap<>();
        ArrayList<Integer> listaPeso;
        
        if ((numNiños = entrada.nextInt()) == 0) {
            return false;
        }
        
        for (int i = 0; i < numNiños; i++) {
            acComportamiento = entrada.nextInt();
            acPeso = entrada.nextInt();
            listaPeso = new ArrayList<>();
            
            if (lista.containsKey(acComportamiento)){
                listaPeso = lista.get(acComportamiento);
                listaPeso.add(acPeso);
                lista.put(acComportamiento, listaPeso);
            }else{
                listaPeso.add(acPeso);
                lista.put(acComportamiento, listaPeso);
            } 
        }
        
        ac = lista.keySet().toArray();
        
        for (int i = ac.length - 1; i > -1; i--) {
            ac1 = lista.get(ac[i]).toArray();
            Arrays.sort(ac1);
            for (int j = 0; j < ac1.length; j++) {
                System.out.println(ac[i] + " " + ac1[j]);
                
            }
        }
        
        System.out.println("");
        
        return true;

    }
}
