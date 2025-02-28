package org.example;

import org.example.products.*;
import org.example.products.Package;
import org.example.products.pieces.PackagePieceProduct;
import org.example.products.pieces.PieceProduct;
import org.example.products.weights.PackageWeightProduct;
import org.example.products.weights.WeightProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatchProductsTest {
    BatchProducts batchProducts;

    @BeforeEach
    void setUp() {
        PackagePieceProduct packagePieceProduct = new PackagePieceProduct(
                new org.example.products.Package("Большая упаковка", 0.1),
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