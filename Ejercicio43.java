import java.util.Scanner;
/**
 * Ejercicio43
 */
public class Ejercicio43 {
    static Scanner lt=new Scanner(System.in);
    public static void NumerCantidades() {
        int NumerMayorcero=0, NumerIgualCero=0, NumerMenorCero=0;
        double numN=0;
        String seguir="S";
        while (seguir.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=lt.nextDouble();
            if (numN<0) {NumerMenorCero++;}
            else if(numN>0){NumerMayorcero++;}
            else{NumerIgualCero++;}
            System.out.println("¿Hay mas numeros?:\nS=Si\tN=No");
            seguir=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        System.out.println("Numeros Mayores a cero: "+NumerMayorcero);
        System.out.println("Numeros iguales a cero: "+NumerIgualCero);
        System.out.println("Numeros Menores a cero: "+NumerMenorCero);
    }
    public static void main(String[] args) {
        NumerCantidades();
    }
}