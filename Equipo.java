import java.util.ArrayList;

public class Equipo {

    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    // Constructor
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = null;
        this.jugadores = new ArrayList<Jugador>();
    }

    // Getter & Setter
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    // Metodos

    public void añadirJugador(Jugador j) {
        jugadores.add(j);

    }

    // toString

    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + "]";
    }

}
