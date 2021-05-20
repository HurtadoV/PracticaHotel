package Buscador;

import java.util.Scanner;

public class Hotel2 extends Hotel{
    @Override
    public void mostrarinf() {
        System.out.println("2.Hotel san fracisco");
    }

    @Override
    public void elegirh(int elegih, String cd, String fecha) {
        switch (elegih) {
            case 1:
                int numeron, cuenta, cantidad;
                System.out.println("la habitacion normal tiene un costo de 50000 \n digite el numero de noches que desea hospedarse");
                Scanner nn = new Scanner(System.in);
                numeron = nn.nextInt();
                cuenta = numeron * 50000;
                System.out.println("su cuenta es:\t" + cuenta + "\ndigite la cantidad que desea transferir");
                cantidad = nn.nextInt();
                if (cuenta == cantidad) {
                    System.out.println("la reservacion de la habitacion sencilla por\t" + numeron + "\tnoches en la ciudad de\t" +cd+"\t para la fecha "+fecha+
                            "\tse realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
            case 2:
                int numeronn=0, cuentaa=0, cantidadd=0;
                System.out.println("la habitacion normal con alimentacion tiene un costo de 80000 \n digite el numero de noches que desea hospedarse");
                Scanner no = new Scanner(System.in);
                numeron = no.nextInt();
                cuenta = numeronn * 80000;
                System.out.println("su cuenta es:\t" + cuentaa + "\ndigite la cantidad que desea transferir");
                cantidadd = no.nextInt();
                if (cuentaa == cantidadd) {
                    System.out.println("la reservacion de la habitacion sencilla con alimentacion por\t" + numeronn + "\tnoches en la ciudad de\t" +cd+"\t para la fecha\t"+fecha+
                            "se realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
            case 3:
                int numeroe, cuentae, cantidade;
                System.out.println("la suite tiene un costo de 120000 \n digite el numero de noches que desea hospedarse");
                Scanner ne = new Scanner(System.in);
                numeroe = ne.nextInt();
                cuentae = numeroe * 120000;
                System.out.println("su cuenta es:\t" + cuentae + "\ndigite la cantidad que desea transferir");
                cantidade = ne.nextInt();
                if (cuentae == cantidade) {
                    System.out.println("la reservacion de la suite por\t" + numeroe + "\tnoches en la ciudad de\t" +cd+"\t para la fecha "+fecha+
                            "\tse realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
            case 4:
                int numeroh, cuentah, cantidadh;
                System.out.println("la suite con alimentacion tiene un costo de 200000 \n digite el numero de noches que desea hospedarse");
                Scanner nh = new Scanner(System.in);
                numeroh = nh.nextInt();
                cuentah = numeroh * 200000;
                System.out.println("su cuenta es: " + cuentah + "\ndigite la cantidad que desea transferir");
                cantidadh = nh.nextInt();
                if (cuentah == cantidadh) {
                    System.out.println("la reservacion de la suite con alimentacion por" + numeroh + "\tnoches en la ciudad de\t" +cd+"\t para la fecha "+fecha+
                            "\tse realizo con exito");
                }
                else {
                    System.out.println("la reservacion no pudo ser efectuada");
                }
                break;
        }}}