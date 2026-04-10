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
     * 
     * @return nombre en la camiseta del jugador
     */
    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    /**
     * 
     * @param nombreCamiseta nuevo nombre de la camiseta
     */

    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    /**
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
     * Indica que el jugador ha solicitado un traspaso
     * Cambia traspaso solicitado como true
     */
    public void solicitarTraspaso() {
        this.traspasoSolicitado = true;
        System.out.println("el jugador " + nombreCamiseta + " ha solicitado el traspaso");
    }

    /**
     * Indica que el jugador ha cancelado un traspaso
     * Cambia traspaso solicitado como false
     */
    public void cancelarTraspaso() {
        this.traspasoSolicitado = false;
        System.out.println("el jugador " + nombreCamiseta + " ha cancelado el traspaso");
    }

    /**
     * Finaliza el proceso de traspaso del jugador,
     * reseteando su estado de solicitud.
     */
    public void finalizarTraspaso() {
        this.traspasoSolicitado = false;
    }

    // toString
    /**
     * Devuelve una representación en texto del jugador con todos sus datos.
     * 
     * @return cadena con la información del jugador
     */
    @Override
    public String toString() {
        return "Ficha Tecnica del Jugador:"
                + "\n Nombre: " + nombreCamiseta
                + "\n Fecha de nacimiento: " + fechaDeNacimiento
                + "\n Posicion: " + posicion
                + "\n Traspaso solicitado: " + traspasoSolicitado + "\n";
    }

}
