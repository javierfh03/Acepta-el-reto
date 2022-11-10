import java.util.StringTokenizer;

public class P232 {
    static java.util.Scanner entrada;
    static StringBuilder salidas;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        String num;
        StringTokenizer st;
        short[] fechas;
        byte con = 0, cumpleDia, cumpleMes;
        int noCumpleAños = 0;
        
        salidas = new StringBuilder("");
        
        if ((num = entrada.nextLine()).equals("0 0 0 0 0 0")) {
            return false;
        }
        
        st = new StringTokenizer(num, " ");
        fechas = new short[st.countTokens()];
        
        while (st.hasMoreElements()) {
            fechas[con] = Short.parseShort((String) st.nextElement());
            con++;
        }
        
        if (fechas[0] != fechas[3] || fechas[1] != fechas[4]){
            cumpleDia = (byte) fechas[0];
            cumpleMes = (byte) fechas[1];

            while (fechas[0] != fechas[3] || fechas[1] != fechas[4] || fechas[2] != fechas[5]){  
                if (fechas[1] == 12 && fechas[0] == 31){
                    fechas[0] = 1;
                    fechas[1] = 1;
                    fechas[2]++;    
                }else if (fechas[0] == 28 && fechas[1] == 2){
                    fechas[0] = 1;
                    fechas[1]++;
                }else if (fechas[0] == 31 && (fechas[1] == 1 || fechas[1] == 3 || fechas[1] == 5 || fechas[1] == 7 || fechas[1] == 8 || fechas[1] == 10)){
                    fechas[0] = 1;
                    fechas[1]++;    
                }else if (fechas[0] == 30 && (fechas[1] == 4 || fechas[1] == 6 || fechas[1] == 9 || fechas[1] == 11)){
                    fechas[0] = 1;
                    fechas[1]++;         
                }else{
                    fechas[0]++;
                }

                if (fechas[0] != cumpleDia || fechas[1] != cumpleMes){
                    noCumpleAños++;
                }
            }
        }
        

        
        salidas.append(noCumpleAños).append("\n");
        System.out.print(salidas.toString());
        
        return true;
    } 
}
