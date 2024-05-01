import java.util.HashMap;
import java.util.Scanner;

public class DescompresorHuffman {

    public static void main(String[] args) {
       
        Nodo raiz = crearArbol();
        Arbol arbol = new Arbol(raiz);
        HashMap<Character, String> codigos = crearCodigos();

     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código Huffman: ");
        String codigoHuffman = scanner.nextLine();
        scanner.close();


        StringBuilder textoOriginal = new StringBuilder();
        Nodo nodoActual = arbol.raiz;
        for (char bit : codigoHuffman.toCharArray()) {
            if (bit == '0') {
                nodoActual = nodoActual.izquierdo;
            } else if (bit == '1') {
                nodoActual = nodoActual.derecho;
            }

            if (nodoActual.esHoja()) {
                textoOriginal.append(nodoActual.caracter);
                nodoActual = arbol.raiz; 
            }
        }

        System.out.println("Texto original: " + textoOriginal.toString());
    }

    private static Nodo crearArbol() {
        Nodo izquierdo = new Nodo('a', 2);
        Nodo derecho = new Nodo('b', 3);
        Nodo raiz = new Nodo(5, izquierdo, derecho);
        return raiz;
    }

    private static HashMap<Character, String> crearCodigos() {
        HashMap<Character, String> codigos = new HashMap<>();
        codigos.put('a', "0");
        codigos.put('b', "1");
        return codigos;
    }
}

no se que mas hacer xd
