public class CasoPracticoBucle4 {
    public static void main(String[] args) throws Exception {

        // METODO CON UN BOOLEAN

        /*
         * int num = 6;
         * boolean accion = false;
         * 
         * for (int i = 0; i < 8; i++) {
         * 
         * System.out.println(num);
         * 
         * if (accion == false) {
         * 
         * num *= 3;
         * 
         * }
         * 
         * if (accion == true) {
         * 
         * num += 2;
         * 
         * }
         * 
         * if (accion == false) {
         * 
         * accion = true;
         * 
         * } else {
         * accion = false;
         * }
         * 
         * }
         */

        // METODO CON UN CONTADOR PAR E IMPAR

        int num = 6;

        for (int i = 0; i <= 6; i++) {

            System.out.println(num);

            if ((i % 2) == 0) {

                num *= 3;

            }

            if ((i % 2) == 1) {

                num += 2;

            }

        }

    }
}
