import java.util.ArrayList;

public class CasoPracticoDados {
    public static void main(String[] args) throws Exception {

        int dado1 = 6;
        int dado2 = 6;
        int dado3 = 6;

        // MANERA EFICIENTE USANDO ARRAY Y BUCLE

        ArrayList<Integer> dados = new ArrayList<>();
        dados.add(6);
        dados.add(6);
        dados.add(6);

        int cantidadDados = 0;

        for (int i = 0; i < dados.size(); i++) {

            if (dados.get(i) == 6) {
                cantidadDados++;
            }

        }

        // MANERA ALGO MAS EFICIENTE

        /*
         * int cantidadDados = 0;
         * 
         * if (dado1 == 6) {
         * cantidadDados++;
         * }
         * 
         * if (dado2 == 6) {
         * cantidadDados++;
         * }
         * 
         * if (dado3 == 6) {
         * cantidadDados++;
         * }
         * 
         * switch (cantidadDados) {
         * case 0:
         * System.out.println("Pésimo");
         * break;
         * case 1:
         * System.out.println("Regular");
         * break;
         * case 2:
         * System.out.println("Muy bien");
         * break;
         * case 3:
         * System.out.println("Excelente");
         * break;
         * }
         */

        // MANERA INEFICIENTE

        /*
         * if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
         * 
         * System.out.println("Excelente");
         * 
         * } else if (dado1 == 6 && dado2 == 6) {
         * 
         * System.out.println("Muy bien");
         * 
         * } else if (dado1 == 6 && dado3 == 6) {
         * 
         * System.out.println("Muy bien");
         * 
         * } else if (dado2 == 6 && dado3 == 6) {
         * 
         * System.out.println("Muy bien");
         * 
         * } else if (dado1 == 6) {
         * 
         * System.out.println("Regular");
         * 
         * } else if (dado2 == 6) {
         * 
         * System.out.println("Regular");
         * 
         * } else if (dado3 == 6) {
         * 
         * System.out.println("Regular");
         * 
         * } else {
         * 
         * System.out.println("Pésimo");
         * 
         * }
         */
    }
}
