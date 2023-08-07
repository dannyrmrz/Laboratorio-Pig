//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carnét: 23053
//Programación Orientada a Objetos
//Juego de azar: Pig

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego() {
        jugador1 = new Jugador();
        jugador2 = new Jugador();
    }

    public void iniciarJuego() {
        while (jugador1.getPuntos() < 100 && jugador2.getPuntos() < 100) {
            System.out.println("\nTurno de Jugador 1:");
            // Cada jugador lanza los dados y acumula puntos hasta que decida parar o alcanzar 100 puntos.
            jugador1.lanzarDados();
            jugador1.mostrarPuntos();

            if (jugador1.getPuntos() >= 100) {
                System.out.println("¡Felicidades! Jugador 1 ha ganado el juego.");
                break;
            }

            System.out.println("\nTurno de Jugador 2:");
            jugador2.lanzarDados();
            jugador2.mostrarPuntos();

            if (jugador2.getPuntos() >= 100) {
                System.out.println("¡Felicidades! Jugador 2 ha ganado el juego.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
}
