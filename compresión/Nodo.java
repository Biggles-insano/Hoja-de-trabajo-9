import java.util.HashMap;

public class Nodo implements Comparable<Nodo> {
    char caracter;
    int frecuencia;
    Nodo izquierda, derecha;

    public Nodo(char caracter, int frecuencia) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
    }

    public Nodo(int frecuencia, Nodo izquierda, Nodo derecha) {
        this.frecuencia = frecuencia;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int compareTo(Nodo nodo) {
        return this.frecuencia - nodo.frecuencia;
    }
}
