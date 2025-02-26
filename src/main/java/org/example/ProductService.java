package org.example;

public class ProductService {
    static public int countByFilter(BatchProducts batchProducts, Filter filter){
        int count = 0;
        PackageProduct[] packageProducts = batchProducts.getProducts();

        for(int i = 0; i < packageProducts.length; i++){
            if(filter.apply(packageProducts[i].getProduct().getName())){
                count += 1;
            }
        }

        return count;
    }
}
