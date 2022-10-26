public class Main {

    public static void main(String[] args) {

        System.out.println("Condicional if \r\n");


        int numeroIf = 3;


        if (numeroIf == 0) {
            System.out.println("El valor de " + numeroIf + " Cero");
        }
        else if (numeroIf < 0) {
            System.out.println("El valor de " + numeroIf + " negativo.");
        }
        else {
        System.out.println("El valor de " + numeroIf + " positivo.");
        }



        System.out.println("\r\nBucle While");

        int  numeroWhile = 1;

        while ( numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\r\nBucle Do While que ocurre sólo una vez");


        int numeroDoWhile = 1;

        do {
            numeroDoWhile = numeroDoWhile - 1;
            // counter2--;
            System.out.println(numeroDoWhile);

        }
        while (numeroDoWhile > 1);

        System.out.println("\r\nEjercicio con for");

        int numeroFor = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }


        System.out.println("\r\nEjercicio con Switch");


        String estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es ninguna estación");

        }
    }
}



