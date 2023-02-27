package com.example.springdatajpa.service;

import com.example.springdatajpa.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductDTO> getProducts();

    ProductDTO getProductById(Long id);

    ProductDTO addProduct(ProductDTO product);

    ProductDTO updateProduct(Long id, ProductDTO product);

     void deleteProductById(Long id);
}
