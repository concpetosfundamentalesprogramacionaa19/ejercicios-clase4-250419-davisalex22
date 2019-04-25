package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion2;
public class SeleccionAnidada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
// Declaracion de Vaiables
        int calificacion;
// Ingreso de datos por teclado
        System.out.printf("Ingrese la nota  \n");
        calificacion = entrada.nextInt();

        if (calificacion >= 90) {
            System.out.printf("%s %d\n", Operacion2.mensajeUno, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s %d\n", Operacion2.mensajeDos, 
                        calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s %d\n", Operacion2.mensajeTres,
                            calificacion);
                } else {
                    System.out.printf("%s %d\n", Operacion2.mensajeCuatro,
                            calificacion);
                } } }

// Fin         
    }
}
