import java.util.Scanner;
/**
 * Ejercicio4_23
 */
public class Ejercicio4_23 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 320; i >=160; i--) {
            if (i%20==0) {
                System.out.println(i);
            }
        }
    }
}