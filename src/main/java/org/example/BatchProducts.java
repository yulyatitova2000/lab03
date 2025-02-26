package org.example;

public class BatchProducts {
    String description;
    PackageProduct[] products;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackageProduct[] getProducts() {
        return products;
    }

    public void setProducts(PackageProduct[] products) {
        this.products = products;
    }

    public BatchProducts(String description, PackageProduct ... products) {
        this.description = description;

        this.products = new PackageProduct[products.length];
        for(int i = 0; i < this.products.length; i++){
            this.products[i] = products[i];
        }
    }

    public double getGross(){
        double sum = 0;

        for(int i = 0; i < this.products.length; i++){
            sum += this.products[i].getGross();
        }

        return sum;
    }
}
