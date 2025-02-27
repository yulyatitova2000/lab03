package org.example;

import org.example.filters.BeginStringFilter;
import org.example.filters.CaseInsensitiveStringFilter;
import org.example.filters.EndStringFilter;
import org.example.products.*;
import org.example.products.Package;

public class Main {
    public static void main(String[] args) {
        org.example.products.Package aPackage1 = new org.example.products.Package("Малая упаковка", 0.02);
        org.example.products.Package aPackage2 = new Package("Большая упаковка", 0.1);

        WeightProduct weightProduct = new WeightProduct("Bounty", "Шоколадные батончики Bounty");
        PieceProduct pieceProduct = new PieceProduct("Pedigree", "Сухой корм Pedigree для взрослых собак", 3);

        PackageWeightProduct packageWeightProduct = new PackageWeightProduct(aPackage1, weightProduct, 1);
        PackagePieceProduct packagePieceProduct = new PackagePieceProduct(aPackage2, pieceProduct, 4);

        System.out.println(packageWeightProduct.getGross());
        System.out.println(packagePieceProduct.getGross());

        BatchProducts batchProducts = new BatchProducts("Партия 1", packagePieceProduct, packageWeightProduct);
        System.out.println(batchProducts.getGross());


        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        System.out.println(filter1.apply(str));
        System.out.println(filter2.apply(str));

        CaseInsensitiveStringFilter filter3 = new CaseInsensitiveStringFilter("мама");
        CaseInsensitiveStringFilter filter4 = new CaseInsensitiveStringFilter("МАЛА");
        System.out.println(filter3.apply(str));
        System.out.println(filter4.apply(str));

        EndStringFilter filter5 = new EndStringFilter("раму");
        EndStringFilter filter6 = new EndStringFilter("мыла");
        System.out.println(filter5.apply(str));
        System.out.println(filter6.apply(str));

        System.out.println(ProductService.countByFilter(batchProducts, new CaseInsensitiveStringFilter("bounty")));

    }
}