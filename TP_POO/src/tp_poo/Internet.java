
package tp_poo;

/**
Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del
cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio
cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El
servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder
calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e
informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio
con el que cuenta.

 */

import java.util.Scanner;

class Cliente{
    String dni;
    int tipo_servicio;
    double monto;
    
    public Cliente(String dni, int tipo_servicio, double monto){
        this.dni=dni;
        this.tipo_servicio=tipo_servicio;
        this.monto=monto;   
    }
    
    public void mostrar(){
        System.out.println("DNI: "+dni);
        System.out.println("Tipo de servicio: "+tipo_servicio);
        System.out.println("Monto a pagar: $" +monto);
        System.out.println("-------------------------------------------------------");
    }
}

public class Internet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes= new Cliente[3];
        
        for(int i=0;i<3;i++){
            System.out.println("Cliente #"+(i+1));
            
            System.out.print("Ingrese el DNI: ");
            String dni= scanner.nextLine();
            
            int tipo_servicio= 0;
            
            while(true){
                System.out.println("Ingrese el tipo de servicio: ");
                System.out.println("1 - Internet de 30 megas ($750) ");
                System.out.println("2 - Internet de 50 megas ($1100)");
                System.out.println("3 - Internet de 100 megas ($1500 - 5% descuento) ");
                System.out.print("Opcion: ");
                tipo_servicio = Integer.parseInt(scanner.nextLine());
                
                if(tipo_servicio>=1 && tipo_servicio<=3){
                    break;
                }else{
                    System.out.println("Opcion no valida, por favor reingrese");
                }
            }
            
            double monto=0; 
            switch(tipo_servicio){
                case 1 :
                    monto = 750;
                    break;
                case 2:
                    monto=1100;
                    break;
                case 3:
                    monto= 1500*0.95; //5% de descuento
                    break;
                    
            }
            
            clientes[i] = new Cliente(dni,tipo_servicio,monto);
            
        }
        
        System.out.println("\n -------Facturas de los clientes-------");
        for(Cliente cliente:clientes){
            cliente.mostrar();
        }
        
        scanner.close();
        
    }
}
