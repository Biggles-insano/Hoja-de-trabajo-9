import java.util.HashMap;

public class Arbol {
    Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public void generarCodigos(HashMap<Character, String> codigos, String codigoActual) {
        generarCodigosRecursivo(raiz, codigos, codigoActual);
    }

    private void generarCodigosRecursivo(Nodo nodo, HashMap<Character, String> codigos, String codigoActual) {
        if (nodo.izquierda == null && nodo.derecha == null) {
            codigos.put(nodo.caracter, codigoActual);
        } else {
            generarCodigosRecursivo(nodo.izquierda, codigos, codigoActual + "0");
            generarCodigosRecursivo(nodo.derecha, codigos, codigoActual + "1");
        }
    }

    public void imprimirArbol() {
        imprimirArbolRecursivo(raiz, 0);
    }

    private void imprimirArbolRecursivo(Nodo nodo, int nivel) {
        if (nodo != null) {
            imprimirArbolRecursivo(nodo.derecha, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            if (nodo.caracter == '\0') {
                System.out.println("Frecuencia: " + nodo.frecuencia);
            } else {
                System.out.println("Caracter: " + nodo.caracter + " Frecuencia: " + nodo.frecuencia);
            }
            imprimirArbolRecursivo(nodo.izquierda, nivel + 1);
        }
    }
}
