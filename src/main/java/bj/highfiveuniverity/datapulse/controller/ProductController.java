package bj.highfiveuniverity.datapulse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
               @Autowired
               private ProductRepository productRepository;

               @GetMapping
               public List<Product> getAllProducts() {
                              return productRepository.findAll();
               }

               @PostMapping
               public Product createProduct(Product product) {
                              return productRepository.save(product);
               }

               @PutMapping("/{id}")
               public Product updateteProduct(Long id, Product productDetail) {
                              Product product = productRepository.findById(id).orElseThrow();
                              product.setName(productDetail.getName());
                              product.setPrice(productDetail.getPrice());

                              return productRepository.save(product);
               }

               @DeleteMapping("/{id}")
               public void deleteProduct(Long id) {
                              Product product = productRepository.findById(id).orElseThrow();
                              productRepository.delete(product);
               }

}
