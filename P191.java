public class P191 {
    static java.util.Scanner entrada;
   
    public static void main (String args[]) {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba(){
        short con, cantCompartimentos, litrosCompartimentoMasGrande, diferenciaLitros;
        int capacidad = 0;
        
        cantCompartimentos = entrada.nextShort();
        litrosCompartimentoMasGrande = entrada.nextShort();
        diferenciaLitros = entrada.nextShort();
        
        con = cantCompartimentos;
        
        for (int i = 0; i < con; i++) {
            capacidad += litrosCompartimentoMasGrande;
            cantCompartimentos--;
            litrosCompartimentoMasGrande = (short) (litrosCompartimentoMasGrande - diferenciaLitros); 
        }
        
        System.out.println(capacidad);
    } 
}
