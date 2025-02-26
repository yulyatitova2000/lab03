package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagePieceProductTest {
    PackagePieceProduct packagePieceProduct;

    @BeforeEach
    public void setUp() throws Exception {
        packagePieceProduct = new PackagePieceProduct(
                new Package("Большая упаковка", 0.1),
                new PieceProduct("Pedigree", "Сухой корм Pedigree для взрослых собак", 3),
                4);
    }

    @Test
    void getNet() {
        assertEquals(12.0, packagePieceProduct.getNet());
    }

    @Test
    void getGross() {
        assertEquals(12.1, packagePieceProduct.getGross());
    }

    @Test
    void getCount() {
        assertEquals(4, packagePieceProduct.getCount());
    }
}