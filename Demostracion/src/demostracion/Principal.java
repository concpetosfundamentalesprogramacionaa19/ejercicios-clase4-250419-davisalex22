package demostracion;
import java.util.Scanner;
public class Principal {
     public static void main(String[] args) {  
// Declaracion de variables
int cantidad = 0;
double tarifa = 3;
double adicional = 0;
double total = 0;
double iva = 0;
double tot=0; 
// Creacion de objeto para pedir con teclado
Scanner entrada = new Scanner(System.in);
// Ingreso de valores por teclado
System.out.println("Ingrese la cantidad de mensajes enviados:\n");
cantidad = entrada.nextInt();
// Realizacion de operaciones
if (cantidad <= 40) {
    iva = tarifa * 0.12;
    total = tarifa + iva;
    }else{
        if (cantidad > 40 && cantidad <=200) {
            tot = (cantidad  * 0.05) + tarifa;
            iva = tot * 0.12;
            total = iva + tot;
        }else{
            if (cantidad > 200) {
                tot = cantidad * 0.1 + tarifa;
                iva = tot * 0.12;
                total = tot + iva;
                }}}
// Muestra de resultados por pantalla
System.out.printf("Estimado cliente la cantidad a cancelar por sus mensajes"
            + " es:  %.2f\n",total);
// Fin
}}
        

