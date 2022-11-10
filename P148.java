public class P148 {

    static java.util.Scanner entrada;
    static StringBuilder salidas = new StringBuilder("");

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int hora, min, minTotal, minRestantes;
        String horaCompleta;

        if ((horaCompleta = entrada.next()).equals("00:00")) {
            System.out.print(salidas.toString());
            return false;
        }
        
        hora = Integer.parseInt(horaCompleta.substring(0, 2));
        min = Integer.parseInt(horaCompleta.substring(3));
        
        minTotal = hora * 60 + min;
        minRestantes = 1440 - minTotal;
        
        salidas.append(minRestantes).append("\n");

        return true;
    }
}
