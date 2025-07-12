public class Comparaciones {
    public static void main(String[] args) {
        int a = 20;
        int b = 19;

    

        // Operadores de Comparacion
        if (a == b) {
            System.out.println("A es igual de B: " + (a == b));
        }

        if (a != b) {
            System.out.println("A es diferente de B: " + (a != b));
        }

        if (a > b) {
            System.out.println("A es mayor que B: " + (a > b));
        }
        
        if (a < b) {
            System.out.println("A es menor que B: " + (a < b));
        }
        
        if (a >= b) {
            System.out.println("A es mayor o igual que B: " + (a >= b));
        }
        
        if (a <= b) {
            System.out.println("A es menor o igual que B: " + (a <= b));
        } else {
            System.out.println("A no es menor que B: " + (b <= a));
        }
    }
       
}
