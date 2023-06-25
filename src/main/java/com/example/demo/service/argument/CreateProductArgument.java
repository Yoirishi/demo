package com.example.demo.service.argument;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateProductArgument {

    String title;

    Long price;
}
