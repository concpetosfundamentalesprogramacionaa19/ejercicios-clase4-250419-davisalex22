package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion;

public class SeleccionSimple {
     public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);        
// Declaracion de Vaiables
int calificacion;
int calificaciondos;
// Ingreso de datos por teclado
        System.out.printf("Ingrese el valor de la primera nota 1 \n");
        calificacion = entrada.nextInt();
        System.out.printf("Ingrese el valor de la primera nota 2 \n");
        calificaciondos = entrada.nextInt();
        
        if (calificacion >= 85) {
            System.out.printf("%s %d/n", Operacion.mensaje, calificacion);
            
        }
        
        if (calificaciondos <= 85) {
            System.out.printf("%s %d\n", Operacion.mensajeDos, calificaciondos);           
            
        }
// Fin         
}}