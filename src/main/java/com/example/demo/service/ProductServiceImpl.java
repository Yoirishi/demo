package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.argument.CreateProductArgument;
import com.example.demo.service.argument.UpdateProductArgument;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public List<Product> list() {
        return repository.findAll();
    }

    @Override
    public Product create(CreateProductArgument argument) {
        return repository.save(Product.builder()
                                      .title(argument.getTitle())
                                      .price(argument.getPrice())
                                      .build());
    }

    @Override
    public Product getExisting(Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Product update(Long id, UpdateProductArgument argument) {
        var product = getExisting(id);
        product.setPrice(argument.getPrice());
        product.setTitle(argument.getTitle());
        return repository.save(product);
    }
}
