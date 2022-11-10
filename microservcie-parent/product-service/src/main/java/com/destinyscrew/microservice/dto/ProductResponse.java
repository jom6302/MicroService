package com.destinyscrew.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Data Transfer Object亦稱為Value Object，因此物件僅包含屬性值而無任何操作行為(Behavior)
// 此種應用亦稱為Request-Response Pattern
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private String id;
    private String name;
    private Double price;
    private String description;
}
