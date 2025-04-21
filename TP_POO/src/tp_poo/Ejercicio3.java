
package tp_poo;

/**
 Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        int N=3;
        int[] cantidades=new int[N];
        float[] costos=new float[N];
        int i;
        Scanner num = new Scanner(System.in);
        float total=0;
        
        for(i=0;i<N;i++){
            System.out.println("Ingresa la cantidad del producto N°"+(i+1)+" :");
            cantidades[i] = num.nextInt();
            System.out.println("Ingresa el costo del producto N°"+(i+1)+" :");
            costos[i] = num.nextFloat();
            
            total=total+costos[i];
        }
            
        for(i=0;i<N;i++){
            System.out.println("Producto N"+(i+1)+" : ");
            System.out.print(cantidades[i]+"  ");
            System.out.println("$"+costos[i]+"  ");
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("El precio total es $"+total);
        System.out.println(" ");
        System.out.println("Productos que superan los $1000: ");
        
        for(i=0;i<N;i++){
           if (costos[i]>1000){
                System.out.println("Producto N°"+(i+1)+" con "+costos[i]);
           }
        }
        
       
    }
} 

