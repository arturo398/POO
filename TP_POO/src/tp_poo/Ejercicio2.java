
package tp_poo;

/**
 Cargar un vector con “n” notas e indicar la cantidad de aprobados (Notas mayores o
iguales a 6), la cantidad de desaprobados (Notas menores a 6).
 */

import java.util.Scanner;
public class Ejercicio2 {
     public static void main(String[] args){
         int N= 3;
         Scanner text = new Scanner(System.in);
         int[] notas = new int[N];
         int aprobados=0;
         int desaprobados=0;
         int i;
         
         for(i=0;i<N;i++){
             System.out.println("Ingrese la nota "+(i+1)+": ");
             notas[i]=text.nextInt();
         }
         for(i=0;i<N;i++){
             System.out.println(notas[i]);
             if(notas[i]>=6 && notas[i]<=10){
                 aprobados++;}
             else if ( notas[i]>=0 && notas[i]<6){
                desaprobados++;     
                }
             }
         
         System.out.println("Cantidad de aprobados: "+aprobados);
         System.out.println("Cantidad de desarpobados: "+desaprobados);
         }
         
     }

