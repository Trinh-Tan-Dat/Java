package com.example.product.Controller;

import com.example.product.Model.Product;
import com.example.product.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String test(){
        return "Test";
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return iProductService.addProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product ,long id){
        return iProductService.updateProduct(product ,id);
    }

    @DeleteMapping("/delete")
    public boolean deleteProduct(long id){
        return iProductService.deleteProduct(id);
    }

    @GetMapping("/list")
    public List<Product> showListProduct(){
        return iProductService.showListProduct();
    }
}
