package bj.highfiveuniverity.datapulse.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj.highfiveuniverity.datapulse.model.Product;
import bj.highfiveuniverity.datapulse.repository.ProductRepository;
@RestController
@RequestMapping("/api/products")
                              
public class ProductController {
            private   ProductRepository productRepository;

               @GetMapping
               public List<Product> getAllProducts() {

               }

               @PostMapping
               public Product createProduct(Product product) {

               }

               @PutMapping("/{id}")
               public Product updateteProduct(Long id, Product productDetail) {

               }
               @DeleteMapping("/{id}")
               public void deleteProduct(Long id) {

               }

}
