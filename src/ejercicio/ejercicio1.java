package ejercicio;

public class ejercicio1 {

    public static void main(String[] args) {
        int numeroInicio = 10;

        while (numeroInicio <= 20) {

            int parOrNot = numeroInicio % 2;

            if (parOrNot == 0) {
                System.out.println("El numero: " + numeroInicio + " Es par");
                numeroInicio++;
            }

            numeroInicio++;
        }

    }

}
