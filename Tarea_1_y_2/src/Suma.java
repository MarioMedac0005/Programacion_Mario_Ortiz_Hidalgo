import java.util.Scanner;

public class Suma {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        float suma = 0;
        float resta = 0;
        float multiplicacion = 0;
        double division = 0;
        int resto = 0;

        System.out.print("Introduce dos números: ");
        num1 = entrada.nextInt();
        System.out.print("Introduce dos números: ");
        num2 = entrada.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;

        System.out.print("El resultado de la suma es: " + suma + "\n");
        System.out.print("El resultado de la resta es: " + resta + "\n");
        System.out.print("El resultado de la multiplicacion es: " + multiplicacion + "\n");
        System.out.print("El resultado de la division es: " + division + "\n");
        System.out.print("El resto de la division es: " + resto + "\n");

    }

}
