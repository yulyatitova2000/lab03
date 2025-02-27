package org.example;

import org.example.filters.CaseInsensitiveStringFilter;
import org.example.products.*;
import org.example.products.Package;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void countByFilter() {
        PackagePieceProduct packagePieceProduct = new PackagePieceProduct(
                new org.example.products.Package("Большая упаковка", 0.1),
                new PieceProduct("Pedigree", "Сухой корм Pedigree для взрослых собак", 3),
                4);

        PackageWeightProduct packageWeightProduct = new PackageWeightProduct(
                new Package("Малая упаковка", 0.02),
                new WeightProduct("Bounty", "Шоколадные батончики Bounty"),
                1);

        BatchProducts batchProducts1 = new BatchProducts("Партия 1", packageWeightProduct, packageWeightProduct);
        BatchProducts batchProducts2 = new BatchProducts("Партия 2", packageWeightProduct, packageWeightProduct, packageWeightProduct);
        BatchProducts batchProducts3 = new BatchProducts("Партия 3", packagePieceProduct, packagePieceProduct, packagePieceProduct);

        CaseInsensitiveStringFilter filter = new CaseInsensitiveStringFilter("bounty");

        assertEquals(2, ProductService.countByFilter(batchProducts1, filter));
        assertEquals(3, ProductService.countByFilter(batchProducts2, filter));
        assertEquals(0, ProductService.countByFilter(batchProducts3, filter));
    }
}