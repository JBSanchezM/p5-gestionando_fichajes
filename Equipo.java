import java.util.ArrayList;

/**
 * Representa un Equipo de la liga profesional.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */
public class Equipo {

    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    /**
     * Contructor de la clase Equipo.
     * Crea un nuevo Equipo con sus atributos.
     * El entrenador se inicializa como null.
     * Crea un ArrayList que se llenara con jugadores.
     * 
     * @param nombreEquipo nombre del equipo.
     */
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = null;
        this.jugadores = new ArrayList<Jugador>();
    }

    /**
     * Muestra el nombre del equipo.
     * 
     * @return nombre del equipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Muestra el entrenador asignado.
     * 
     * @return entrenador asignado
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Muestra la lista de jugadores del equipo.
     * 
     * @return lista de jugadores del equipo.
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Modifica el entrenador asignado
     * 
     * @param entrenador nuevo entrenador
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    // Metodos

    /**
     * Añade un jugador al equipo.
     * No se realizan comprobaciones sobre duplicados.
     * 
     * @param j jugador que se añade al equipo
     */
    public void añadirJugador(Jugador j) {
        jugadores.add(j);

    }

    /**
     * Devuelve una representación en texto del equipo con todos sus datos.
     * 
     * @return cadena con la información del equipo.
     */

    @Override
    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + "]";
    }

}
