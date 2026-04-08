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


    
}
