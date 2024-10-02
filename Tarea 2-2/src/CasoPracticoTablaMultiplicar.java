import java.util.Scanner;

public class CasoPracticoTablaMultiplicar {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero:");

        int num = entrada.nextInt();

        System.out.println("Tabla del " + num);

        for (int i = 0; i <= 10; i++) {

            System.out.println((i + " x " + num + "=") + i * num);

        }

    }
}
