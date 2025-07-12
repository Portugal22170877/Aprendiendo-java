public class OperadoresLogicos {
    public static void main (String[] args){

        boolean esMayor = true;
        boolean tieneLicencia = false;
        boolean vaConAdulto = true;

        boolean puedeManejar = esMayor && tieneLicencia;
            System.out.println("Puede manejar: " + puedeManejar);
        
        boolean puedeEntraralCine = esMayor || vaConAdulto; 
            System.out.println("Puede entrar al cine: " + puedeEntraralCine);

        boolean noPuedesManejar = ! tieneLicencia;
            System.out.println("No puede manejar si no tiene licencia: " + noPuedesManejar);
        
    }
}
