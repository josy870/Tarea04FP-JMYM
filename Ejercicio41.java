import java.util.Scanner;
/**
 * Ejercicio41
 */
public class Ejercicio41 {
    static Scanner lt=new Scanner(System.in);
    public static void LaCajaRegistradoraDelAlmacen() {
        String haymas="S", MB="";
        int vm=0, cb=0;
        double vb=0, cm=0, tl;
        while (haymas.equals("S")) {
            System.out.println("Ingrese si es Moneda o Billete:\nM=moneda\nB=billete");
            MB=lt.next().toUpperCase();
            if (MB.equals("B")) {
                System.out.println("Cantidad de billetes");
                cb=lt.nextInt();
                if (vb==0) { System.out.println("VALOR del billete");
                vb=lt.nextInt();}

            } else if (MB.equals("M")) {
                System.out.println("Cantidad de monedas");
                cm=lt.nextInt();
                System.out.println("VALOR de monedas");
                vm=lt.nextInt();
            } else { System.out.println("Ingresar si es moneda o billetes");
            }
            System.out.println("¿HAY MAS EN LA CAJA REGISTRADORA?: S=SI, N=No");
            haymas=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
        System.out.println("Total en BILLETES ES:"+(cb*vb));
        System.out.println("Total en MONEDAS ES:"+(cm*vm));
        tl=(cm*vb)+(cm*vm);
        System.out.println("Total BILLETES Y MONEDAS ES:"+tl); 
    }
    public static void main(String[] args) {
        LaCajaRegistradoraDelAlmacen();
    }
}