package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatchProductsTest {
    BatchProducts batchProducts;

    @BeforeEach
    void setUp() {
        PackagePieceProduct packagePieceProduct = new PackagePieceProduct(
                new Package("Большая упаковка", 0.1),
                new PieceProduct("Pedigree", "Сухой корм Pedigree для взрослых собак", 3),
                4);

        PackageWeightProduct packageWeightProduct = new PackageWeightProduct(
                new Package("Малая упаковка", 0.02),
                new WeightProduct("Bounty", "Шоколадные батончики Bounty"),
                1);

        batchProducts = new BatchProducts("Партия 1", packagePieceProduct, packageWeightProduct);
    }

    @Test
    void getGross() {
        assertEquals(13.12, batchProducts.getGross());
    }
}