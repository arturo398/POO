
package Objetos;
import java.util.Scanner;

public class Alumno {
    public double[] notas;
    
    //Constructor
    public Alumno(int cantidad){
        this.notas = new double[cantidad];
    }
    
    //Metodos
    public void cargarNotas(){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<notas.length;i++){
            System.out.print("Ingresa la nota N"+(i+1)+ " :");
            notas[i]= scanner.nextDouble();
        }
    }
    
    public double obtenerMaximo(){
        double max=0;
        for(double nota:notas){
            if(nota>max){
                max=nota;
            }
        }
        return max;
    }
    
    public double calcularPromedio(){
        double suma=0;
        for(double nota:notas){
            suma += nota;
        }
        return suma/ notas.length;
    }
    
}
