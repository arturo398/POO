
package Sanatorio;

public class Pediatrico extends Paciente implements Nutricion , Administracion {
    private double peso;
    private String tutor;
    private String celular;
    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String tutor, String celular) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
        
    }

   
    @Override
    public String Dieta() {
        return "Dieta infantil supervisada";
        
    }

    @Override
    public String CoberturaOS() {
        return "Cobertura pediratrica: "+ obraSocial;
    }

    @Override
    public double Descuento() {
       return 0.10;
    }

    @Override
    public String Vademecum() {
       return "Vademecum Infantil";
    }
    

}
