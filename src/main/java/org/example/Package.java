package org.example;

import java.util.Objects;

public class Package {
    protected String name;
    protected double weight;

    public Package(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Package aPackage = (Package) o;
        return Double.compare(weight, aPackage.weight) == 0 && Objects.equals(name, aPackage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
