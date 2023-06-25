package com.example.demo.service.argument;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UpdateProductArgument {
    private String title;

    private Long price;
}
