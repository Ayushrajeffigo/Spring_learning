package com.example.mapstruct.springmapstructdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_details")

public class Product {
	@Id
	private long id;
	private String name;
	private String desc;
	private int quantity;
	private long price;

}
