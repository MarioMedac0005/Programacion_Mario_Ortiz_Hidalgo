import java.util.Scanner;

public class Segundos {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float horas = 0;
        float minutos = 0;
        float segundos = 0;
        float resultado = 0;
        final int cambio_horas = 3600;
        final int cambo_minutos = 60;

        System.out.print("Introduce unas horas: ");
        horas = entrada.nextFloat();

        System.out.print("Introduce unos minutos: ");
        minutos = entrada.nextFloat();

        System.out.print("Introduce unos segundos: ");
        segundos = entrada.nextFloat();

        resultado = (horas * cambio_horas) + (minutos * cambo_minutos) + segundos;
        System.out.print("El resultado en segundos es: " + resultado);

    }

}
