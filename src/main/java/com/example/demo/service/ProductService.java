package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.service.argument.CreateProductArgument;
import com.example.demo.service.argument.UpdateProductArgument;

import java.util.List;

public interface ProductService {

    List<Product> list();

    Product create(CreateProductArgument argument);

    Product getExisting(Long id);

    Product update(Long id, UpdateProductArgument argument);
}
