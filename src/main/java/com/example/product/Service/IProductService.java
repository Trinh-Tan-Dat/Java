package com.example.product.Service;

import com.example.product.Model.Product;

import java.util.List;

public interface IProductService {
    public Product addProduct(Product product);
    public Product updateProduct(Product product, long id);

    public  boolean deleteProduct(long id);
    public List<Product> showListProduct();
}
