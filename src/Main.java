public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        ObjectController metodo = new ObjectController();
        int[] Array = {42, 17, 23, 56, 89, 3, 14};

        // Imprimir los valores del array
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + Array[i]);
        }
    }
}
