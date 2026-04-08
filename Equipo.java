import java.util.ArrayList;

public class Equipo {

    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    // Constructor
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    // Getter
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    // toString

    public String toString() {
        return "Equipo [nombreEquipo=" + nombreEquipo + "]";
    }

}
