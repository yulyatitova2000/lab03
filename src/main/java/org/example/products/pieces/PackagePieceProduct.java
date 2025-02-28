package org.example.products.pieces;

import org.example.products.Package;
import org.example.products.PackageProduct;

import java.util.Objects;

public class PackagePieceProduct extends PackageProduct {
    protected int count;

    public PackagePieceProduct(Package aPackage, PieceProduct product, int count) {
        this.aPackage = aPackage;
        this.product = product;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagePieceProduct that = (PackagePieceProduct) o;
        return count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), count);
    }

    @Override
    public String toString() {
        return "PackagePieceProduct{" +
                "count=" + count +
                ", aPackage=" + aPackage +
                ", product=" + product +
                '}';
    }

    @Override
    public double getNet() {
        PieceProduct pieceProduct = (PieceProduct)product;
        return pieceProduct.getWeight() * count;
    }

    @Override
    public double getGross() {
        return getNet() + aPackage.getWeight();
    }

    public int getCount() {
        return count;
    }
}
