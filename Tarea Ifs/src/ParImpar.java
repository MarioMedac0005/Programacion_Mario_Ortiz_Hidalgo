import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;

        System.out.println("Introduce un numero para comprobar si es par o impar: ");
        num1 = entrada.nextInt();

        if (num1 % 2 == 0) {

            System.out.println("El numero es par.");

        } else {

            System.out.println("El numero es impar.");

        }

    }
}
