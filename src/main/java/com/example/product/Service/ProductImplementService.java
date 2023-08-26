package com.example.product.Service;

import com.example.product.Model.Product;
import com.example.product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplementService implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product){
        if(product!=null){
            return productRepository.save(product);
        }
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(Product product, long id){
        if(product!=null){
            Product product1 = productRepository.getReferenceById(id);
            product1.setName(product.getName());
            product1.setAddress(product.getAddress());
            return productRepository.save(product1);
        }
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        if(id >= 1){
            Product product  = productRepository.getReferenceById(id);
            productRepository.delete(product);
            return  true;
        }
        return false;
    }
    @Override
    public List<Product> showListProduct(){
        return productRepository.findAll();
    }



}
