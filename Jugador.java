import java.time.LocalDate;

public class Jugador {
    private String nombreCamiseta;
    private LocalDate fechaDeNacimiento;
    private String posicion;
    private boolean traspasoSolicitado;
    
    //Constructor
    public Jugador(String nombreCamiseta, LocalDate fechaDeNacimiento, String posicion) {
        this.nombreCamiseta = nombreCamiseta;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.posicion = posicion;
        this.traspasoSolicitado = false;
    }

    //Getter & Setter
    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isTraspasoSolicitado() {
        return traspasoSolicitado;
    }

    //toString

    
    public String toString() {
        return "Jugador [nombreCamiseta=" + nombreCamiseta + ", fechaDeNacimiento=" + fechaDeNacimiento + ", posicion="
                + posicion + ", traspasoSolicitado=" + traspasoSolicitado + "]";
    }
    
}
