package javaClassesTaskB;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Nikolai
 */

public class Bunch {
    private double flowerBunchPrice;
    private ArrayList<Flower> flowerList = new ArrayList<Flower>();

    void addFlowerToFlowerList(Flower flower) {
        flowerList.add(flower);
    }

    List<Flower> sortFlowerByFreshness() {
        List<Flower> list = new ArrayList<Flower>(flowerList);
        Collections.sort(list, new Comparator<Flower>() {

            public int compare(Flower o1, Flower o2) {
                Integer flowerOneFreshness = new Integer(o1.getFlowerFreshnessScore());
                Integer flowerTwoFreshness = new Integer(o2.getFlowerFreshnessScore());
                return flowerOneFreshness.compareTo(flowerTwoFreshness);
            }
        });
        return list;
    }

    List<Flower> getFlowerByStemLengthRange(int rangeStart, int rangeEnd) {
        List<Flower> flowerSetStemLengthList = new ArrayList<Flower>(flowerList);
        List<Flower> flowerSetStemLengthListList = new ArrayList<Flower>();
        for (Flower flower : flowerSetStemLengthList) {
            if (flower.getFlowerStemLength() >= rangeStart && flower.getFlowerStemLength() <= rangeEnd) {
                flowerSetStemLengthListList.add(flower);
            }
        }
        return flowerSetStemLengthListList;
    }

    public double getBunchPrice() {
        for (Flower flower : flowerList) {
            flowerBunchPrice += flower.getPrice();

        } return flowerBunchPrice;

    }


}


