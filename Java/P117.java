import java.util.*;

public class P117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        String saludo;

        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            sc.next();
            saludo = sc.next();
            System.out.println("Hola, " + saludo + ".");
        }
    }
}

