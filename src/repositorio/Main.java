package repositorio;
import java.util.*;
/**
 *
 * @author Francisco Puga Martínez
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Primer número");
        a = sc.nextInt();
        
        System.out.println("Segundo número");
        b = sc.nextInt();
        
        Actividad3 suma = new Actividad3(a, b);
        
        suma.suma();
    }
    
}
