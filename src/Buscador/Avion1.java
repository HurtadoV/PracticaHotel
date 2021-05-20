package Buscador;

import java.util.Scanner;

public class Avion1 extends Avion{
    @Override
    public void mostrari() {
        System.out.println("1.aerolinea avianca");
    }

    @Override
    public void elegira(int elecciona, String co, String cd, String fecha) {
        if(elecciona == 1){
            int numerot, cuenta, abono;
            System.out.println("el valor del tiquete es 100000\n  cuantos tiquetes desea comprar");
            Scanner nt = new Scanner(System.in);
            numerot= nt.nextInt();
            cuenta = numerot*100000;
            System.out.println("su cuenta es:\t"+cuenta+"\ndigite el valor que desea transferir");
            abono= nt.nextInt();
            if(abono == cuenta ){
                System.out.println("felicidades la compra de\t"+numerot+"\ttiquetes tenienedo como ciudad de origen\t" +
                        co+"\ty como destino\t"+cd+"\tse realizo con exito para la fecha\t"+fecha);
            }
            else{
                System.out.println("la compra no se puedo realizar");
            }
        }
        else{
            int numerot, cuenta, abono;
            System.out.println("el valor del tiquete en primera clase es 200000\n  cuantos tiquetes desea comprar");
            Scanner nt = new Scanner(System.in);
            numerot= nt.nextInt();
            cuenta = numerot*200000;
            System.out.println("su cuenta es:\t"+cuenta+"\ndigite el valor que desea transferir");
            abono= nt.nextInt();
            if(abono == cuenta ){
                System.out.println("felicidades la compra de\t"+numerot+ "\ttiquetes tenienedo como ciudad de origen\t" +
                        co+"\ty como destino\t"+cd+"\tse realizo con exito para la fecha\t"+fecha);
            }
            else{
                System.out.println("la compra no se puedo realizar");
            }

        }

    }


}
