
package tp_poo;

/**
 Un alumno tiene “n” notas (Se ingresa por teclado la cantidad de notas) que se deben
cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
notas se debe mostrar la nota más alta y el promedio de notas.

 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in); // Cambié el nombre a 'scanner'
       
        
        System.out.print("Ingrese cantidad de notas a cargar: ");
        int n = scanner.nextInt(); 
        int[] notas = new int[n];
        int i   ;
        float prom=0;
        int mayor=0;
        
        
        for (i=0;i<n;i++){
            System.out.print("Ingrese la nota"+(i+1)+":");
            notas[i]= scanner.nextInt();
        }
        
        System.out.println("tus notas fueron: ");
        for(i=0;i<n;i++){
            System.out.println(notas[i]);
            prom=prom+notas[i];
            if(mayor<notas[i]){
                mayor=notas[i];
            }
        }
        
        System.out.println("Tu promedio es:"+ (prom/n));
        System.out.println("La nota mas alta es: "+mayor);
    }
}
