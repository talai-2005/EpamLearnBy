package javaClassesTaskB;

/**
 * @author Nikolai
 */

abstract class Flower {
    private String name;
    private double priceInRuble;
    private int flowerFreshnessScore;
    private int flowerStemLength;

    public Flower(String name, double price, int flowerFreshnessScore, int flowerStemLength) {
        this.name = name;
        this.priceInRuble = price;
        this.flowerFreshnessScore = flowerFreshnessScore;
        this.flowerStemLength = flowerStemLength;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceInRuble;
    }

    public int getFlowerFreshnessScore() {
        return flowerFreshnessScore;
    }

    public int getFlowerStemLength() {
        return flowerStemLength;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", priceInRuble=" + priceInRuble +
                ", flowerFreshnessScore=" + flowerFreshnessScore +
                ", flowerStemLength=" + flowerStemLength +
                '}';
    }
}
