public class NodoTest {

    public static void main(String[] args) {
        Nodo nodoA = new Nodo('a', 2);
        Nodo nodoB = new Nodo('b', 3);

        System.out.println("Comparando nodoA y nodoB:");
        int comparacionAB = nodoA.compareTo(nodoB);
        if (comparacionAB < 0) {
            System.out.println("nodoA es menor que nodoB");
        } else if (comparacionAB > 0) {
            System.out.println("nodoA es mayor que nodoB");
        } else {
            System.out.println("nodoA es igual a nodoB");
        }

        Nodo nodoC = new Nodo('c', 1);

        System.out.println("Comparando nodoB y nodoC:");
        int comparacionBC = nodoB.compareTo(nodoC);
        if (comparacionBC < 0) {
            System.out.println("nodoB es menor que nodoC");
        } else if (comparacionBC > 0) {
            System.out.println("nodoB es mayor que nodoC");
        } else {
            System.out.println("nodoB es igual a nodoC");
        }
    }
}
