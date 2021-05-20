package Buscador;

import java.util.Scanner;

public class Eleccion implements Buscar{


    @Override
    public void Buscador(int opcion, String ciudad1, String ciudad2, String fecha) {
        if(opcion == 1 ){
            int rta, rta1, rta2;
            System.out.println("tenemos dos opciones de hoteles");
            Hotel1 hotel1 = new Hotel1();
            Hotel2 hotel2 = new Hotel2();
            hotel1.mostrarinf();
            hotel2.mostrarinf();
            System.out.println("que hotel desea elegir");
            Scanner oh = new Scanner(System.in);
            rta = oh.nextInt();
            switch (rta){
                case 1:
                    System.out.println("Hotel de lujo la estacion ofrece: \n 1.suite normal_______150000\n 2.suite de lujo_______" +
                            "300000\n 3.suite presidencial__________500000");
                    rta1= oh.nextInt();
                    hotel1.elegirh(rta1,ciudad2,fecha);
                    break;
                case 2:
                    System.out.println("Hotel san fracisco ofrece: \n 1.Habitacion normal_______50000\n 2.Habitacion con alimentacion_______" +
                            "80000\n 3.suite__________120000 \n 4.suite con alimentacion____________200000 ");
                    rta2 = oh.nextInt();
                    hotel2.elegirh(rta2,ciudad2,fecha);
                    break;
            }
        }
        else{
            int rsta, rsta1, rsta2;
            System.out.println("tenemos dos opciones de aerolineas");
            Avion1 avion1 = new Avion1();
            Avion2 avion2 = new Avion2();
            avion1.mostrari();
            avion2.mostrari();
            System.out.println("que aerolinea desea elegir");
            Scanner oa = new Scanner(System.in);
            rsta = oa.nextInt();
            switch (rsta){
                case 1:
                    System.out.println("aerolinea avianca ofrece: \n 1.tiquete normal_______100000\n 2.tiquete primera clase_______200000");
                    rsta1 = oa.nextInt();
                    avion1.elegira(rsta1,ciudad1,ciudad2,fecha);
                    break;
                case 2:
                    System.out.println("aerolinea avianca ofrece: \n 1.tiquete normal_______150000\n 2.tiquete primera clase_______ + 250000");
                    rsta2 = oa.nextInt();
                    avion2.elegira(rsta2,ciudad1,ciudad2,fecha);
                    break;
            }

        }
    }
}
