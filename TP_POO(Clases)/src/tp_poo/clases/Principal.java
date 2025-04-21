
package tp_poo.clases;
import Objetos.Alumno;
import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuantas notas vas a ingresar?: ");
        int cantidad= scanner.nextInt();
        
        Alumno alumno = new Alumno(cantidad);
        alumno.cargarNotas();
        
        double notaMaxima=alumno.obtenerMaximo();
        double promedio = alumno.calcularPromedio();
        
        System.out.println("La nota mas alta es: "+notaMaxima);
        System.out.println("El promedio de notas es: "+promedio);
        
    }

}
