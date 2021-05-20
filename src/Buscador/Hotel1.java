package Buscador;

import java.util.Scanner;

public class Hotel1 extends Hotel{

    @Override
    public void mostrarinf() {
        System.out.println("1.Hotel de lujo la estacion");
    }

    @Override
    public void elegirh(int elegih, String cd, String fecha) {
        switch (elegih) {
            case 1:
                int numeron, cuenta, cantidad;
                System.out.println("la suite normal tiene un costo de 150000 \n digite el numero de noches que desea hospedarse");
                Scanner nn = new Scanner(System.in);
                numeron = nn.nextInt();
                cuenta = numeron * 150000;
                System.out.println("su cuenta es: " + cuenta + "\ndigite la cantidad que desea transferir");
                cantidad = nn.nextInt();
                if (cuenta == cantidad) {
                    System.out.println("la reservacion de la suite normal por" + numeron + "\tnoches en la ciudad de\t" +cd+"\t para la fecha "+fecha+
                            "\tse realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
            case 2:
                int numeronn=0, cuentaa=0, cantidadd=0;
                System.out.println("la suite de lujo tiene un costo de 300000 \n digite el numero de noches que desea hospedarse");
                Scanner no = new Scanner(System.in);
                numeron = no.nextInt();
                cuenta = numeronn * 300000;
                System.out.println("su cuenta es: " + cuentaa + "\ndigite la cantidad que desea transferir");
                cantidadd = no.nextInt();
                if (cuentaa == cantidadd) {
                    System.out.println("la reservacion de la suite de lujo por" + numeronn + "\tnoches en la ciudad de" +cd+"\t para la fecha "+fecha+
                            "se realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
            case 3:
                int numeroe, cuentae, cantidade;
                System.out.println("la suite presidencial tiene un costo de 500000 \n digite el numero de noches que desea hospedarse");
                Scanner ne = new Scanner(System.in);
                numeroe = ne.nextInt();
                cuentae = numeroe * 500000;
                System.out.println("su cuenta es: " + cuentae + "\ndigite la cantidad que desea transferir");
                cantidade = ne.nextInt();
                if (cuentae == cantidade) {
                    System.out.println("la reservacion de la suite presidencial por" + numeroe + "\tnoches en la ciudad de" +cd+"\t para la fecha "+fecha+
                            "se realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
        }
    }


}
