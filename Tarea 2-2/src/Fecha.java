import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) throws Exception {

        /*
         * Descomponer la fecha que entra como un String usando las posiciones del
         * String y concatenando las posiciones.
         * Ir paso a paso, primero dias, luego meses y luego años, sin complicarse para
         * que se pase de mes/ año, etc.
         * Intentar averiguar el tema de los años bisiestos.
         * Convertir la fecha final a String y usar el metodo String.format para que
         * añada los 0s.
         */

        /*
         * ERRORES DEL PROGRAMA
         * Día inválido para un mes con 30 días:
         * Entrada: 31/04/2023
         * Esperado: La fecha ingresada es inválida. (Abril solo tiene 30 días).
         * 
         * Mes con 30 días (mes impar):
         * 
         * Entrada: 30/04/2023 (abril tiene 30 días)
         * Esperado: 02/05/2023 (Debe cambiar de mes).
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una fecha en el siguiente formato (01/01/2000): ");

        String fecha = entrada.next();

        String dia = fecha.charAt(0) + "" + fecha.charAt(1);
        String mes = fecha.charAt(3) + "" + fecha.charAt(4);
        String year = fecha.charAt(6) + "" + fecha.charAt(7) + "" + fecha.charAt(8) + "" + fecha.charAt(9);

        int diaCompleto = Integer.parseInt(dia);
        int mesCompleto = Integer.parseInt(mes);
        int yearCompleto = Integer.parseInt(year);

        if (yearCompleto % 4 == 0 && mesCompleto == 02) {

            if (diaCompleto > 29) {

                System.out.println("La fecha ingresada es inválida.");
                return;

            }

            if (mesCompleto % 2 == 0) {

                if (diaCompleto > 31) {

                    System.out.println("La fecha ingresada es inválida.");
                    return;

                }

            } else if (mesCompleto % 2 == 1) {

                if (diaCompleto > 30) {

                    System.out.println("La fecha ingresada es inválida.");
                    return;

                }

            }

            if (diaCompleto == 29) {

                diaCompleto = 02;
                if (mesCompleto == 12) {

                    mesCompleto = 01;
                    yearCompleto += 1;

                } else if (mesCompleto < 12) {

                    mesCompleto += 1;

                }

            } else if (diaCompleto == 28) {

                diaCompleto = 01;
                mesCompleto += 1;
                if (mesCompleto == 12) {

                    mesCompleto = 01;
                    yearCompleto += 1;

                } else if (mesCompleto == 02) {

                    mesCompleto = 02;

                }

            } else {

                if (diaCompleto == 30) {

                    diaCompleto = 01;
                    if (mesCompleto == 12) {

                        mesCompleto = 01;
                        yearCompleto += 1;

                    } else if (mesCompleto < 12) {

                        mesCompleto += 1;

                    }

                } else if (diaCompleto == 31) {

                    diaCompleto = 02;
                    if (mesCompleto == 12) {

                        mesCompleto = 01;
                        yearCompleto += 1;

                    } else if (mesCompleto < 12) {

                        mesCompleto += 1;

                    }

                } else {

                    diaCompleto += 2;

                }
            }
        } else {

            if (diaCompleto > 28 && mesCompleto == 2) {

                System.out.println("La fecha ingresada es inválida.");
                return;

            }

            if (mesCompleto % 2 == 0) {

                if (diaCompleto > 31) {

                    System.out.println("La fecha ingresada es inválida.");
                    return;

                }

            } else if (mesCompleto % 2 == 1) {

                if (diaCompleto > 30) {

                    System.out.println("La fecha ingresada es inválida.");
                    return;

                }

            }

            if (diaCompleto == 27 && mesCompleto == 2) {

                diaCompleto = 01;
                mesCompleto += 1;

            } else if (diaCompleto == 28 && mesCompleto == 2) {

                diaCompleto = 02;
                mesCompleto += 1;

            } else {

                if (diaCompleto == 30) {

                    diaCompleto = 01;
                    if (mesCompleto == 12) {

                        mesCompleto = 01;
                        yearCompleto += 1;

                    } else if (mesCompleto < 12) {

                        mesCompleto += 1;

                    }

                } else if (diaCompleto == 31) {

                    diaCompleto = 02;
                    if (mesCompleto == 12) {

                        mesCompleto = 01;
                        yearCompleto += 1;

                    } else if (mesCompleto < 12) {

                        mesCompleto += 1;

                    }

                } else {

                    diaCompleto += 2;

                }
            }
        }

        // String fechaCompleta = diaCompleto + "/" + mesCompleto + "/" + yearCompleto;
        // String resultFecha = String.format(fechaCompleta, args);

        String fechaCompleta = String.format("%02d/%02d/%04d", diaCompleto, mesCompleto, yearCompleto);

        System.out.println(fechaCompleta);

    }
}
