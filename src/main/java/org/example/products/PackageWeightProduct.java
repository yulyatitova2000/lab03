package org.example.products;

import java.util.Objects;

public class PackageWeightProduct  extends PackageProduct {
    protected double weight;

    public PackageWeightProduct(Package aPackage, WeightProduct product, double weight) {
        this.aPackage = aPackage;
        this.product = product;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackageWeightProduct that = (PackageWeightProduct) o;
        return Double.compare(weight, that.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "PackageWeightProduct{" +
                "weight=" + weight +
                ", aPackage=" + aPackage +
                ", product=" + product +
                '}';
    }

    @Override
    public double getNet() {
        return weight;
    }

    @Override
    public double getGross() {
        return getNet() + aPackage.getWeight();
    }
}
