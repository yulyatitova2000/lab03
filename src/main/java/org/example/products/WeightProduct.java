package org.example.products;

public class WeightProduct extends Product {

    public WeightProduct(String name, String description) {
        super(name, description);
    }

    @Override
    public String toString() {
        return "WeightProduct{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
