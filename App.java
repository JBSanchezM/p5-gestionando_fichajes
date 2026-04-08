import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
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

        Entrenador en1 = new Entrenador("Carlos", "4-3-3");
        Entrenador en2 = new Entrenador("Pepe", "3-4-3");
        Entrenador en3 = new Entrenador("Jhan", "4-3-2-1");
        Entrenador en4 = new Entrenador("Cristian", "4-4-2");

        Equipo eq1 = new Equipo("Real Madrid");
        Equipo eq2 = new Equipo("Barcelona");
        Equipo eq3 = new Equipo("Villareal");
    }
}
