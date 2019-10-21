public class Test {
    public static void main(String[] args) {
        Thread helper = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello " + i);
                }
            }
        });
        Thread helper1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello " + i);
                }
            }
        });
        helper.start();
        helper1.start();

    }
}


