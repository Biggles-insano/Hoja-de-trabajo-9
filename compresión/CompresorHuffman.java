import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CompresorHuffman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto a comprimir:");
        String texto = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> frecuencias = new HashMap<>();
        for (char c : texto.toCharArray()) {
            frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();
        for (char c : frecuencias.keySet()) {
            colaPrioridad.offer(new Nodo(c, frecuencias.get(c)));
        }

        while (colaPrioridad.size() > 1) {
            Nodo izquierda = colaPrioridad.poll();
            Nodo derecha = colaPrioridad.poll();
            Nodo padre = new Nodo(izquierda.frecuencia + derecha.frecuencia, izquierda, derecha);
            colaPrioridad.offer(padre);
        }

        Arbol arbol = new Arbol(colaPrioridad.poll());
        HashMap<Character, String> codigos = new HashMap<>();
        arbol.raiz.generarCodigos(codigos, "");

        for (char c : codigos.keySet()) {
            System.out.println("Caracter: " + c + " Código: " + codigos.get(c));
        }
    }
}
