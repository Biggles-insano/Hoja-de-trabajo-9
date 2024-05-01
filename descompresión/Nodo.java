class Nodo {
    char caracter;
    int frecuencia;
    Nodo izquierdo, derecho;

    public Nodo(char caracter, int frecuencia) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Nodo(int frecuencia, Nodo izquierdo, Nodo derecho) {
        this.caracter = '\0';
        this.frecuencia = frecuencia;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public boolean esHoja() {
        return this.izquierdo == null && this.derecho == null;
    }
}
