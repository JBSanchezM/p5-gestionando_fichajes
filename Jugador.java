import java.time.LocalDate;

/**
 * Representa un jugador de la liga profesional.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */

public class Jugador {
    private String nombreCamiseta;
    private LocalDate fechaDeNacimiento;
    private String posicion;
    private boolean traspasoSolicitado;

    /**
     * Constructor de la clase Jugador.
     * Crea un nuevo jugador con los datos básicos.
     * El traspaso se inicializa como no solicitado.
     * 
     * @param nombreCamiseta    Nombre del jugador en la camiseta
     * @param fechaDeNacimiento Fecha de nacimiento del jugador
     * @param posicion          Posición en la que juega
     */

    public Jugador(String nombreCamiseta, LocalDate fechaDeNacimiento, String posicion) {
        this.nombreCamiseta = nombreCamiseta;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.posicion = posicion;
        this.traspasoSolicitado = false;
    }

    /**
     * Devuelve el nombre que aparece en la camiseta del jugador.
     * 
     * @return nombre de la camiseta
     */
    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    /**
     * Modifica el nombre que aparece en la camiseta del jugador.
     * 
     * @param nombreCamiseta nuevo nombre de la camiseta
     */

    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    /**
     * Devuelve la fecha de nacimiento del jugador
     * 
     * @return fecha de naciemiento del jugador
     */
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Modifica la fecha de naciemiento del jugador.
     * 
     * @param fechaDeNacimiento nueva fecha de nacimiento
     */
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * Devuelve la posicion del jugador.
     * 
     * @return posicion del jugador
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Modifica la posicion del jugador.
     * 
     * @param posicion nueva posicion del jugador
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * Indica si el jugador ha solicitado un traspaso.
     * 
     * @return true si ha solicitado traspaso, false en caso contrario
     */
    public boolean isTraspasoSolicitado() {
        return traspasoSolicitado;
    }

    /**
     * El jugador solicita el traspaso.
     * Cambia su estado interno a "traspaso solicitado"
     */
    public void solicitarTraspaso() {
        this.traspasoSolicitado = true;
        System.out.println("el jugador " + nombreCamiseta + " ha solicitado el traspaso");
    }

    /**
     * El jugador cancela el traspaso
     * Cambia su estado interno a "traspaso no solicitado"
     */
    public void cancelarTraspaso() {
        this.traspasoSolicitado = false;
        System.out.println("el jugador " + nombreCamiseta + " ha cancelado el traspaso");
    }

    // toString
    /**
     * Devuelve una representación en texto del jugador con todos sus datos.
     * 
     * @return cadena con la información del jugador
     */
    @Override
    public String toString() {
        return "Jugador [nombreCamiseta=" + nombreCamiseta + ", fechaDeNacimiento=" + fechaDeNacimiento + ", posicion="
                + posicion + ", traspasoSolicitado=" + traspasoSolicitado + "]";
    }

}
