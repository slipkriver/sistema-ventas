package com.sistema.ventas.controller;

import com.sistema.ventas.entities.Product;
import com.sistema.ventas.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> listProduct(){
        return service.listProduct();
    }

      @GetMapping("/products/{id}")
    public ResponseEntity<Product> obtenerProducto(@PathVariable Integer id) {
        try {
            Product product = service.getProductById(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);

        } catch (Exception exception) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/products")
    public void saveProduct(@RequestBody Product product) {
        service.saveProduct(product);
    }
}
