//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carnét: 23053
//Programación Orientada a Objetos
//Juego de azar: Pig
import java.util.Scanner;

public class Jugador {
    private int puntos;
    private Scanner scanner;

    public Jugador() {
        puntos = 0;
        scanner = new Scanner(System.in);
    }

    public void lanzarDados() {
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(6);

        int total = 0;
        int valorDado1, valorDado2;

        do {
            valorDado1 = dado1.lanzar();
            valorDado2 = dado2.lanzar();
            int puntosGanados = valorDado1 + valorDado2;

             // Muestra los valores de ambos dados y el total de puntos en el turno actual.
            System.out.println("Dado 1: " + valorDado1 + ", Dado 2: " + valorDado2 + ", Total de puntos en el turno: " + (total + puntosGanados));

            if (valorDado1 == 1 || valorDado2 == 1) {
                System.out.println("¡Salió un 1! Pierdes tus puntos en este turno.");
                puntos = 0;
                break;
            }

            total += puntosGanados;

            if (total >= 20) {
                System.out.println("¡Has alcanzado 20 puntos o más en este turno!");
                break;
            }
             // Pregunta al jugador si desea seguir tirando los dados.
            System.out.println("¿Deseas seguir tirando? (1-Si / 2-No)");
        } while (scanner.nextInt() == 1);

        puntos += total;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void mostrarPuntos() {
        // Muestra los puntos totales del jugador en ese momento.
        System.out.println("Puntos totales del jugador: " + puntos);
    }
}