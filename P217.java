public class P217 {

    static java.util.Scanner entrada;
    static StringBuilder salidas = new StringBuilder("");

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int num;
        
        if ((num = entrada.nextInt()) == 0) {
            System.out.print(salidas.toString());
            return false;
        }
        
        if (num % 2 == 0){
            salidas.append("DERECHA").append("\n");
        }else{
            salidas.append("IZQUIERDA").append("\n");
        }
                
        return true;
    }
}
