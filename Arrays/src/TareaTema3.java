import java.util.Scanner;

public class TareaTema3 {
    public static void main(String[] args) throws Exception {

        int opcion = 0;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("================================");
            System.out.println("==============MENU==============");
            System.out.println("================================");
            System.out.println("1.SUMA/RESTA/MULTIPLICAR/DIVIDIR");
            System.out.println("2.CAMBIO DE SIGNO");
            System.out.println("3.MEDIA ARITMETICA");
            System.out.println("4.HIPOTENUSA");
            System.out.println("5.SEGUNDOS");
            System.out.println("6.ORDEN NUMEROS CRECIENTE");
            System.out.println("7.PAR O IMPAR");
            System.out.println("8.SEMANAS,DIAS,HORAS");
            System.out.println("9.FECHA");
            System.out.println("10.INDICE MASA MUSCULAR");
            System.out.println("11.FACTORIAL");
            System.out.println("");
            System.out.println("Introduce una opción usando los números: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    int opcionAritmetica = 0;
                    int num1 = 0;
                    int num2 = 0;

                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("");

                    System.out.println("Elige una opcion: ");
                    opcionAritmetica = sc.nextInt();

                    switch (opcionAritmetica) {
                        case 1:

                            System.out.println("Introduce una opcion: ");
                            num1 = sc.nextInt();
                            System.out.println("Introduce el primer numero: ");
                            num2 = sc.nextInt();

                            System.out.println("El resultado es: " + sumar(num1, num2));
                            break;

                        case 2:

                            System.out.println("Introduce una opcion: ");
                            num1 = sc.nextInt();
                            System.out.println("Introduce el primer numero: ");
                            num2 = sc.nextInt();

                            System.out.println("El resultado es: " + restar(num1, num2));
                            break;

                        case 3:

                            System.out.println("Introduce una opcion: ");
                            num1 = sc.nextInt();
                            System.out.println("Introduce el primer numero: ");
                            num2 = sc.nextInt();

                            System.out.println("El resultado es: " + multiplicar(num1, num2));
                            break;

                        case 4:

                            System.out.println("Introduce una opcion: ");
                            num1 = sc.nextInt();
                            System.out.println("Introduce el primer numero: ");
                            num2 = sc.nextInt();

                            System.out.println("El resultado es: " + dividir(num1, num2));
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:

                    System.out.println("Introduce un numero para cambiar su signo: ");
                    int numeroCase = sc.nextInt();

                    System.out.println("El resultado es: " + cambioSigno(numeroCase));

                    break;

                case 3:

                    System.out.println("Introduce el pimer numero: ");
                    double numArit = sc.nextDouble();

                    System.out.println("Introduce el segundo numero: ");
                    double numArit2 = sc.nextDouble();

                    System.out.println("Introduce el tercer numero: ");
                    double numArit3 = sc.nextDouble();

                    System.out.println("El resultado es: " + mediaAritmetica(numArit, numArit2, numArit3));

                    break;

                case 4:

                    System.out.println("Introduce el primer cateto: ");
                    double numCat = sc.nextDouble();

                    System.out.println("Introduce el segundo cateto: ");
                    double numCat2 = sc.nextDouble();

                    System.out.println("El resultado es: " + hipotenusa(numCat, numCat2));

                    break;

                case 5:

                    System.out.println("Introduce unas horas: ");
                    double numHoras = sc.nextDouble();
                    System.out.println("Introduce unos minutos: ");
                    double numMinutos = sc.nextDouble();

                    break;
                default:
                    break;
            }

        } while (opcion != 0);

    }

    public static int sumar(int operador1, int operador2) {

        int resultado = 0;

        resultado = operador1 + operador2;

        return resultado;
    }

    public static int restar(int operador1, int operador2) {

        int resultado = 0;

        resultado = operador1 - operador2;

        return resultado;
    }

    public static int multiplicar(int operador1, int operador2) {

        int resultado = 0;

        resultado = operador1 * operador2;

        return resultado;
    }

    public static int dividir(int operador1, int operador2) {

        int resultado = 0;

        resultado = operador1 / operador2;

        return resultado;
    }

    public static int cambioSigno(int numero) {

        int signoCambiado = 0;

        signoCambiado = numero * (-1);

        return signoCambiado;
    }

    public static double mediaAritmetica (double numero1, double numero2, double numero3) {

        double resultado = ( numero1 + numero2 + numero3 ) / 3;

        return resultado;
    }

    public static double hipotenusa (double cat1, double cat2) {

        double hipotenusa = Math.sqrt( Math.pow(cat1, 2) + Math.pow(cat2, 2));

        return hipotenusa;
    }

    public static double segundos (double horas, double minutos, double segundos) {

        final int cambio_horas = 3600;
        final int cambo_minutos = 60;

        double resultado = (horas * cambio_horas) + (minutos * cambo_minutos) + segundos;

        return resultado;
    }
}