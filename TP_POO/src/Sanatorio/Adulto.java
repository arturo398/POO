
package Sanatorio;


public class Adulto extends Paciente implements Administracion, Clinica_Medica{
    private String presion;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, String presion, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presion=presion;
        this.peso=peso;
        this.altura=altura;
    }

    @Override
    public String CoberturaOS() {
       return "Cobertura pediratrica: "+ obraSocial;
    }

    @Override
    public String Vademecum() {
        return "Vademecum Adulto";
    }

    @Override
    public double Descuento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Rx() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Sangre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
