import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) throws Exception {
        double cat1 = 0;
        double cat2 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer cateto: ");
        cat1 = entrada.nextFloat();

        System.out.print("Introduce el segundo cateto: ");
        cat2 = entrada.nextFloat();

        double hip = Math.sqrt( Math.pow(cat1, 2) + Math.pow(cat2, 2));
        System.out.print("La hipotenusa del triangulo es: "+hip);
    }

}
