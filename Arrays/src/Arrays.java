public class Arrays {
    public static void main(String[] args) throws Exception {

        /*
         * //DECLARAR ARRAY
         * int[] array_enteros = new int[5];
         * 
         * //INSTANCIAR DATOS
         * array_enteros[1] = 4;
         */

        // DECLARAR ARRAY E INSTANCIAR DATOS
        int[] array = { 5, 3, 6, 7, 8, 2, 1, 9, 10 };

        // RECORRER ARRAY MEDIANTE FOR
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
