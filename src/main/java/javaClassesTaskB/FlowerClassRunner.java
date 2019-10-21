package javaClassesTaskB;

import javaClassesTaskA.Customer;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Nikolai
 */

public class FlowerClassRunner {
    final static Logger logger = Logger.getLogger(String.valueOf(FlowerClassRunner.class));
    public static void main(String[] args) {

        logger.info("Entering the execute method");

        Bunch bunch = new Bunch();
        bunch.addFlowerToFlowerList(new Rose("Tea-Rose", 10, 2, 15));
        bunch.addFlowerToFlowerList(new Tulip("Yellow", 7, 3, 22));

        try {

            List<Flower> listSortFlowerByFreshness = bunch.sortFlowerByFreshness();
            System.out.println(listSortFlowerByFreshness);
            logger.info("Sorted by freshness successfully");

            List<Flower> listSortFlowerByStemLength = bunch.sortFlowerByFreshness();
            System.out.println(listSortFlowerByFreshness);
            logger.info("Sorted by stem length successfully");

            List<Flower> getFlowerSortedByStemRange = bunch.getFlowerByStemLengthRange(0, 100);
            System.out.println(getFlowerSortedByStemRange);

            System.out.println("The bunch price makes " + bunch.getBunchPrice() + " RUB");
            logger.info("Got bunch price successfully");

        } catch (ConcurrentModificationException e) {
            logger.severe("ConcurrentModificationException. Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
