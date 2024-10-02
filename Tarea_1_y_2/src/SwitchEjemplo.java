public class SwitchEjemplo {

    public static void main(String[] args) throws Exception {

        int edad = 5;
        if (edad < 18) {

            System.out.println("Eres menos de edad");

        } else if (edad >= 18 && edad < 65) {

            System.out.println("Eres adulto");

        } else {

            System.out.println("Eres mayor de edad");

        }

        switch (edad) {
            case 17:
                System.out.println("Eres menor de edad");
                break;
            case 18:

                System.out.println("Mayor de edad");

                break;

            default:
                break;
        }

    }

}
