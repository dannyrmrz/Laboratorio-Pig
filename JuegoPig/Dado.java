//Universidad del Valle de Guatemala
//Autor: Daniela Ramírez de León
//No. Carnét: 23053
//Programación Orientada a Objetos
//Juego de azar: Pig
import java.util.Random;

public class Dado {
    private int valorCara;

    public Dado(int valorCara) {
        this.valorCara = valorCara;
    }

    public int lanzar() {
        Random random = new Random();
        // Genera un número aleatorio entre 1 y el valor máximo de la cara del dado.
        return random.nextInt(valorCara) + 1;
    }
}