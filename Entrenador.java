public class Entrenador {
    private String nombreEntrenador;
    private String formacionPreferida;

    //Constructor
    public Entrenador(String nombreEntrenador, String formacionPreferida) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
    }

    //Getter & Setter

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

      //toString
      
   
    public String toString() {
        return "Entrenador [nombreEntrenador=" + nombreEntrenador + ", formacionPreferida=" + formacionPreferida + "]";
    }

    
}
