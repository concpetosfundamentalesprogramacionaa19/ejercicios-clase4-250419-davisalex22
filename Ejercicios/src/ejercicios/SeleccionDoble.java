package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion;
public class SeleccionDoble {
      public static void main(String[] args) {     
// Declaracionde Variables
int calificacion;
int calificaciondos=0;
// Creacion de objeto para pedir con teclado
Scanner entrada = new Scanner(System.in);
// Ingreso por teclado de calificaciones
System.out.println("Ingrese la Calificacion: \n");
calificacion = entrada.nextInt();
// Validacion e impresion de resultados
if (calificacion >= 85 ) {
    System.out.printf("%s %d\n", Operacion.mensaje, calificacion);
}else{
    System.out.printf("%s %d\n", Operacion.mensajeDos, calificacion);    
              
          }
// Fin
}}
