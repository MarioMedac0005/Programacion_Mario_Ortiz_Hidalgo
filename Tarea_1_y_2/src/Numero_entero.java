import java.util.Scanner;

public class Numero_entero {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double num1 = 0;
        double signo_cambiado = 0;

        System.out.print("Introduce un número: ");
        num1 = entrada.nextFloat();

        signo_cambiado = num1*(-1);
        System.out.print("El número cambiado de signo es :"+signo_cambiado);

    }

}
