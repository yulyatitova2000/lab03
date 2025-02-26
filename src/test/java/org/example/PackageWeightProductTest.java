package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageWeightProductTest {
    PackageWeightProduct packageWeightProduct;

    @BeforeEach
    void setUp() {
        packageWeightProduct = new PackageWeightProduct(
                new Package("Малая упаковка", 0.02),
                new WeightProduct("Bounty", "Шоколадные батончики Bounty"),
                1);
    }

    @Test
    void getNet() {
        assertEquals(1.0, packageWeightProduct.getNet());
    }

    @Test
    void getGross() {
        assertEquals(1.02, packageWeightProduct.getGross());
    }
}