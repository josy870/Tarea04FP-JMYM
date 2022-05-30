import java.util.Scanner;
/**
 * Ejercicio4.13
 */
public class Ejercicio4_13 {
    static Scanner lt=new Scanner(System.in);
    public static void NotasAprobadosReprobados() {

        int reprobado=0, aprobado=0;
        String Not="",  Seguir="S";
        
        while (Seguir.equals("S")) {
            System.out.println("Ingresar los alumnos que aprobaron y reprobaron:\nR=reprobado\nA=aprobado");
            Not=lt.next().toUpperCase();
            if (Not.charAt(0)=='R') {reprobado++;}
            else if(Not.charAt(0)=='A'){aprobado++;}
            else{ System.err.println("ERROR¡¡Ingresar LETRA CORRECTA (A=Aprobado,R=Reprobado)");}
            System.out.println("¿Tiene mas Calificaciones?:\nS=Si\tN=No");
            Seguir=lt.next().toUpperCase().equals("S")?"S":"N";
        }

        System.out.println("Los REPROBADOS son:" +reprobado);
        System.out.println("Los APROBADOS son:" +aprobado);
    }
    public static void main(String[] args) {
        NotasAprobadosReprobados();
    }
}