
package tp_poo;

/**
Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
usuario.

 */

import java.util.Scanner;

class Camion {
    String patente;
    String chofer;
    String carga;
    String egreso;

    public Camion(String patente, String chofer, String carga, String egreso){
        this.patente = patente;
        this.carga = carga;
        this.chofer = chofer;
        this.egreso = egreso;
    }
}

public class Control {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            Camion[] camiones = new Camion[3];
            int contador=0;
            
            for (int i=0; i<3; i++){
                System.out.println("\nCamion #"+(i+1));
                
                System.out.print("Ingrese la patente: ");
                String patente = scanner.nextLine();
                
                System.out.print("Ingrese nombre y apellido del chofer: ");
                String chofer = scanner.nextLine();
                
                System.out.print("Ingrese el tipo de carga: ");
                String carga = scanner.nextLine();
                
                System.out.print("Ingrese la hora de egreso: ");
                String egreso = scanner.nextLine();
                
                System.out.println("\n");
                if(carga.equals("te")){
                    contador ++;
                }
                
                camiones [i] = new Camion(patente, chofer, carga, egreso);
                
            }
            
            System.out.println("\n -------Datos de los camiones----------");
            
            for(Camion camion : camiones){
                System.out.println("Patente: "+ camion.patente);
                System.out.println("Chofer: "+ camion.chofer);
                System.out.println("Tipo de carga: "+ camion.carga);
                System.out.println("Hora de egreso: "+ camion.egreso);
            }
            
            System.out.println("Cantidad de camiones que transportaron té: "+ contador);
        }
    }
}


