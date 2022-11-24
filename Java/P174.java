public class P174{
    
    static java.util.Scanner entrada;
   
    public static void main (String args[]) {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba(){
	boolean aux = true;
        int anio = entrada.nextInt(), con = 0, inicial;
        String anioString;
        char n;
        
        anioString = anio + "";
        
        for (int i = 0; i < anioString.length(); i++) {
            n = anioString.charAt(i);
            for (int j = 0; j < i; j++) {
                if (n == anioString.charAt(j)){
                    aux = true;
                    i = anioString.length();
                    break;
                }
            }
            if (i == anioString.length()-1){
                aux = false;
                break;
            }
        }
        
        if (aux){
            while (aux) {            
                anioString = anio + "";

                for (int i = 0; i < anioString.length(); i++) {
                    n = anioString.charAt(i);
                    for (int j = 0; j < i; j++) {
                        if (n == anioString.charAt(j)){
                            anio--;
                            i = anioString.length();
                            break;
                        }
                    }
                    if (i == anioString.length()-1){
                        aux = false;
                        anio++;
                    }
                }
            }

            inicial = anio;
            aux = true;

            while (aux) {            
                anioString = anio + "";

                for (int i = 0; i < anioString.length(); i++) {
                    n = anioString.charAt(i);
                    for (int j = 0; j < i; j++) {
                        if (n == anioString.charAt(j)){
                            anio++;
                            con++;
                            i = anioString.length();
                            break;
                        }
                    }
                    if (i == anioString.length()-1){
                        aux = false;
                        System.out.println(inicial + " " + con);
                    }
                }
            }
        }else{
            aux = true;
            while (aux) {            
                anioString = anio + "";

                for (int i = 0; i < anioString.length(); i++) {
                    n = anioString.charAt(i);
                    for (int j = 0; j < i; j++) {
                        if (n == anioString.charAt(j)){
                            aux = false;
                            anio++;
                            i = anioString.length();
                            break;
                        }
                    }
                }
                anio--;
            }
            
            anio++;
            inicial = anio;
            aux = true;

            while (aux) {            
                anioString = anio + "";

                for (int i = 0; i < anioString.length(); i++) {
                    n = anioString.charAt(i);
                    for (int j = 0; j < i; j++) {
                        if (n == anioString.charAt(j)){
                            aux = false;
                            i = anioString.length();
                            System.out.println(inicial + " " + con);
                            break;
                        }
                    }
                    if (i == anioString.length()-1){
                        anio++;
                        con++;
                    }
                }
            }
        }
    }
}
