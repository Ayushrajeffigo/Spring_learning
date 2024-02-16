package com.example.mapstruct.springmapstructdemo.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ProductDto {
	@Id
	private long id;
	private String name;
	private String description;
	private int quantity;
	private long price;
}
