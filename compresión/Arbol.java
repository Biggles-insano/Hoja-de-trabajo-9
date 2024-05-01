import java.util.HashMap;

public class Arbol {
    Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public void generarCodigos(HashMap<Character, String> codigos, String codigoActual) {
        if (raiz.izquierda == null && raiz.derecha == null) {
            codigos.put(raiz.caracter, codigoActual);
        } else {
            raiz.izquierda.generarCodigos(codigos, codigoActual + "0");
            raiz.derecha.generarCodigos(codigos, codigoActual + "1");
        }
    }
}
