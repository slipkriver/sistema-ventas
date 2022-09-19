package com.sistema.ventas.services;

import com.sistema.ventas.entities.Product;
import com.sistema.ventas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listProduct(){
        return repository.findAll();
    }

    public void saveProduct(Product product){
        repository.save(product);
    }

    public Product getProductById(Integer id){
        return repository.findById(id).get();
    }

    public void deleteProduct(Integer id){
        repository.deleteById(id);
    }
}
