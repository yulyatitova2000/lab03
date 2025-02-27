package org.example.products;

import java.util.Objects;

public abstract class PackageProduct {
    protected Package aPackage;
    protected Product product;

    public abstract double getNet();
    public abstract double getGross();

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PackageProduct that = (PackageProduct) o;
        return Objects.equals(aPackage, that.aPackage) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aPackage, product);
    }

    @Override
    public String toString() {
        return "PackageProduct{" +
                "aPackage=" + aPackage +
                ", product=" + product +
                '}';
    }
}
