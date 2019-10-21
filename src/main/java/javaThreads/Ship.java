package javaThreads;

/**
 * @author Nikolai
 */

abstract class Ship extends Thread {

    public static class ShipUnload extends Ship {
        private final Port port;
        private int cargo;

        public ShipUnload(Port port, int cargo) {
            this.port = port;
            this.cargo = cargo;
        }

        @Override
        public void run() {
            port.add(cargo);
        }
    }
    public static class ShipLoad extends Ship {
        private final Port port;

        ShipLoad(Port port) {
           this.port = port;
        }

        @Override
        public void run() {
            this.port.del();
        }
    }
}