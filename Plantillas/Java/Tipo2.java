/**
 * HASTA ENTRADA DETERMINADA 
 * Ejemplo "Divisores del factorial"
 * Es el número 126 de Acepta el reto
 *
 */
public class Tipo2 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int num;

        if ((num = entrada.nextInt()) == 0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida

        return true;
    }
}
