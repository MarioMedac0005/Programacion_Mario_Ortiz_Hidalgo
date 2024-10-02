import java.util.Scanner;

public class Aritmetica {

    public static void main(String[] args) throws Exception {

        double num1=0;
        double num2=0;
        double num3=0;
        double media_aritmetica=0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextFloat();

        System.out.print("Introduce el segundo numero: ");
        num2 = entrada.nextFloat();

        System.out.print("Introduce el tercer numero: ");
        num3 = entrada.nextFloat();

        media_aritmetica = ( num1 + num2 + num3 )/3;
        System.out.print("La medua aritmetica de los 3 números es: "+media_aritmetica);

    }

}
