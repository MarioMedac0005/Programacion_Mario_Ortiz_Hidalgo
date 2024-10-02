import java.util.Scanner;

public class Cambio_grados {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double grados_cent = 0, grados_fah = 0;

        System.out.print("Introduce unos grados centigrados: ");
        grados_cent = entrada.nextDouble();

        grados_fah = 32 + ( 9 * grados_cent / 5 );
        System.out.print("Los grados centigrados ahora son " + grados_fah + " grados Fahrenheit");

    }

}
