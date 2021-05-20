package Cliente;

import Buscador.Eleccion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String corigen, cdestino, fecha;
        int eleccion1;
        System.out.println("Bienvenido al buscador de hoteles y aerolineas \n por favor escriba la ciudad de origen");
        Scanner co = new Scanner(System.in);
        corigen = co.nextLine();
        System.out.println("ahora escriba la ciudad de destino");
        cdestino =co.nextLine();
        System.out.println("digite la fecha para el viaje");
        fecha =co.nextLine();
        System.out.println("para buscar hoteles escriba el numero: 1 \n para buscar vuelos escriba el numero: 2");
        eleccion1=co.nextInt();
        Eleccion eleccion = new Eleccion();
        eleccion.Buscador(eleccion1, corigen, cdestino, fecha);
    }
}
