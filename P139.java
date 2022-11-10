public class P139 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        Integer num;
        byte ac, con = 1;
        int resultadoTemp;
        int[] resultadosAnteriores = new int[5];
        
        if ((num = entrada.nextInt()) == 0) {
            return false;
        }
        
        if (num != 1){
            System.out.print(num + " - ");
        
            resultadosAnteriores[0] = num;
            
            while (true){
                resultadoTemp = 0; 
                
                for (int i = 0; i < num.toString().length(); i++) {
                    ac = (byte) Character.getNumericValue(num.toString().charAt(i));
                    resultadoTemp += ac * ac * ac;
                }
                
                if (resultadoTemp == 1){
                    System.out.println("1 -> cubifinito.");
                    break;
                }
                
                for (int i = 0; i < resultadosAnteriores.length; i++) {
                    if (resultadoTemp == resultadosAnteriores[i]){
                        System.out.println(resultadosAnteriores[i] + " -> no cubifinito.");
                        return true;
                    } 
                }
                
                System.out.print(resultadoTemp + " - ");
                
                num = resultadoTemp;
                resultadosAnteriores[con] = resultadoTemp;
                
                if (con > 3){
                    con = 0;
                }else{
                    con++;
                }
            }
        }else{
            System.out.println("1 -> cubifinito.");
        }

        return true;
    }
}
