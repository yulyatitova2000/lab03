package org.example.products;

import org.example.filters.IFilter;

public class ProductService {
    static public int countByFilter(BatchProducts batchProducts, IFilter filter){
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
