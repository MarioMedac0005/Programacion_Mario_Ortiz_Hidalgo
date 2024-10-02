import java.util.Scanner;

public class OrdenAscendente {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.println("Introduce el tercer numero: ");
        num3 = entrada.nextInt();

        if (num1 < num2 && num2 < num3) {

            System.out.println("Los numeros se encuentran ordenados ascendentemente");

        }

    }
}
