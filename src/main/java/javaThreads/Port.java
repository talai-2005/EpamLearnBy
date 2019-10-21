package javaThreads;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Nikolai
 */

public class Port<E> {

    private Queue<E> data = new LinkedList<E>();

    public synchronized void add(E e) {
        while (this.data.size() > 3) {
            System.out.println("Извините порт перегружен, " + Thread.currentThread().getName()
                    + " ожидает очереди когда произведётся отгрузка из порта");
            try {
                wait();
            } catch (InterruptedException e1) {
                System.out.println("InterruptedException got caught");
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e3) {
            e3.printStackTrace();
        }
        this.data.add(e);
        System.out.println(Thread.currentThread().getName() +
                " has delivered the cargo to the Port, the current Port  " + this.data.size() + " из 3");
        notify();
    }

    public synchronized E del() {
        while (this.data.size() == 0) {
            System.out.println("The cargo has not been delivred to the Port yet, "
                    + Thread.currentThread().getName() + " will wait when cargo comes");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("The exception has been caught");
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        E rsl = this.data.poll();
        System.out.println(Thread.currentThread().getName() + " has been loaded, the currend Port load is " + this.data.size() + " out of 3");
        notify();
        return rsl;
    }
}