public class P140 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int num, rel = 0;
        String intString;

        if ((num = entrada.nextInt()) < 0) {
            return false;
        }
        
        intString = num + "";
        
        for (int i = 0; i < intString.length(); i++) {
            rel += Integer.parseInt(intString.charAt(i) + "");
            
            if (i == intString.length() - 1){
                System.out.print(intString.charAt(i) + " = ");
            }else{
                System.out.print(intString.charAt(i) + " + ");
            }
        }
        
        System.out.println(rel);

        return true;
    }
}
