class Arbol {
    Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public void imprimirArbol(Nodo nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }

        if (nodo.esHoja()) {
            System.out.println("Caracter: " + nodo.caracter + " Frecuencia: " + nodo.frecuencia);
        } else {
            System.out.println("Frecuencia: " + nodo.frecuencia);
        }

        imprimirArbol(nodo.izquierdo, nivel + 1);
        imprimirArbol(nodo.derecho, nivel + 1);
    }
}
