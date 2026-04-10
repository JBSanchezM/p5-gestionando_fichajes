import java.time.LocalDate;

/**
 * Clase principal que ejecuta la aplicación.
 * Permite probar el funcionamiento de las clases del sistema.
 * 
 * @author Jonathan Sanchez
 * @version 1.0
 */

public class App {

    /**
     * Método principal de la aplicación.
     * Crea objetos de prueba y ejecuta las funcionalidades del sistema.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Creando Jugadores
        Jugador j1 = new Jugador("Marcos", LocalDate.of(1992, 10, 21), "Delantero");
        Jugador j2 = new Jugador("Lucas", LocalDate.of(1993, 11, 12), "Arquero");
        Jugador j3 = new Jugador("Juan", LocalDate.of(1994, 7, 19), "Defensa");
        Jugador j4 = new Jugador("Mario", LocalDate.of(1995, 9, 17), "Lateral");
        Jugador j5 = new Jugador("Maria", LocalDate.of(1996, 1, 6), "Delantero");
        Jugador j6 = new Jugador("Jhon", LocalDate.of(1997, 5, 23), "Centrocampista");
        Jugador j7 = new Jugador("Antony", LocalDate.of(1998, 2, 12), "Delantero");
        Jugador j8 = new Jugador("Samuel", LocalDate.of(1993, 7, 30), "Arquero");
        Jugador j9 = new Jugador("Pedro", LocalDate.of(1994, 3, 22), "Defensa");
        Jugador j10 = new Jugador("Ruben", LocalDate.of(1995, 8, 17), "Lateral");

        // Creando Entrenadores
        Entrenador en1 = new Entrenador("Carlos", "4-3-3");
        Entrenador en2 = new Entrenador("Pepe", "3-4-3");
        Entrenador en3 = new Entrenador("Jhan", "4-3-2-1");

        // Creando Equipo
        Equipo eq1 = new Equipo("Real Madrid");
        Equipo eq2 = new Equipo("Barcelona");
        Equipo eq3 = new Equipo("Villareal");

        // Añadiendo Jugadores
        eq1.añadirJugador(j1);
        eq1.añadirJugador(j2);
        eq1.añadirJugador(j3);
        eq1.añadirJugador(j4);

        eq2.añadirJugador(j5);
        eq2.añadirJugador(j6);
        eq2.añadirJugador(j7);

        eq3.añadirJugador(j8);
        eq3.añadirJugador(j9);
        eq3.añadirJugador(j10);

        // Añadiendo Entrenadores
        eq3.setEntrenador(en1);
        eq2.setEntrenador(en2);
        eq1.setEntrenador(en3);

    }

}
