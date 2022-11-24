public class P151 {

    static java.util.Scanner entrada;
    static StringBuilder salidas = new StringBuilder("");

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int num;
        boolean noEsMatrizMagica = false;
        int[][] matriz;

        if ((num = entrada.nextInt()) == 0) {
            System.out.print(salidas.toString());
            return false;
        }
        
        matriz = new int[num][num];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                  matriz[i][j] = entrada.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j){
                    if (matriz[i][j] != 0){
                        noEsMatrizMagica = true;
                        break;
                    }
                }else{
                    if (matriz[i][j] != 1){
                        noEsMatrizMagica = true;
                        break;
                    }
                }
            }
            if (noEsMatrizMagica){
                break;
            }
        }
        
        if (noEsMatrizMagica){
            salidas.append("NO").append("\n");
        }else{
            salidas.append("SI").append("\n");
        }

        return true;
    }
}
