package org.example.products.weights;

import org.example.products.Product;

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
