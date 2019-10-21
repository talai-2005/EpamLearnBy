package javaThreads;

/**
 * @author Nikolai
 */

public class ShipRunner {

    public static void main(String[] args) {

        Port <Integer> port = new Port <Integer>();
        Thread ship1 = new Thread(new Ship.ShipUnload(port, 10), "Ship 1");
        Thread ship2 = new Thread(new Ship.ShipUnload(port, 10), "Ship 2");
        Thread ship3 = new Thread(new Ship.ShipLoad(port), "Корабль отгрузчик Ship 2");
        Thread ship4 = new Thread(new Ship.ShipLoad(port), "Корабль отгрузчик Ship 3");
        ship1.start();
        ship2.start();
        ship3.start();
        ship4.start();

      }
}