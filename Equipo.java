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
     * Crea un equipo con nombre, sin entrenador asignado
     * y con una lista vacía de jugadores.
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
     * Muestra por consola la plantilla del equipo,
     * mostrando la informacion de cada jugador.
     */
    public void verPlantilla() {
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println(jugadores.get(i));
        }
    }

    /**
     * Transfiere un jugador desde este equipo a otro,
     * siempre que pertenezca al equipo y haya solicitado el traspaso.
     * 
     * @param jug jugador a transferir
     * @param eq  equipo destino
     */

    public void transferirJugador(Jugador jug, Equipo eq) {
        if (jugadores.contains(jug) == true && jug.isTraspasoSolicitado()) {
            jugadores.remove(jug);
            eq.getJugadores().add(jug);
            jug.finalizarTraspaso();
            System.out.println("Transferencia realizada con exito");
        } else
            System.out.println("Transferencia no realizada");

    }

    /**
     * Devuelve una representación en texto del equipo con todos sus datos.
     * 
     * @return Ficha tecnica que muestra el nombre del equipo, el nombre del
     *         entrenador y la cantidad de jugadores del equipo.
     */

    @Override
    public String toString() {
        return "Ficha Tecnica:"
                + "\n Equipo: " + nombreEquipo
                + "\n Entrenador: " + entrenador.getNombreEntrenador()
                + "\n Jugadores: " + jugadores.size();
    }

}
