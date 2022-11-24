public class P605 {
    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        String armario;
        int verano = 0, invierno = 0;

        if ((armario = entrada.nextLine()).equals(".")) {
            return false;
        }
        
        for (int i = 0; i < armario.length(); i++) {
            if (armario.charAt(i) == 'V'){
                verano++;
            }else if (armario.charAt(i) == 'I'){
                invierno++;
            }else if (armario.charAt(i) == 'A'){
                verano++;
                invierno++;
            }
        }
        
        if (verano > invierno){
            System.out.println("VERANO");
        }else if (verano < invierno){
            System.out.println("INVIERNO");
        }else if (verano == invierno){
            System.out.println("EMPATE");
        }
        
        return true;
    }
}
