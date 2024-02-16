package com.example.mapstruct.springmapstructdemo.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.mapstruct.springmapstructdemo.dto.ProductDto;
import com.example.mapstruct.springmapstructdemo.model.Product;

@Mapper
public interface ProductMapper {
	ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

	@Mapping(source = "Product.desc", target = "description", defaultValue = "description")
	ProductDto modelToDto(Product product);

	@InheritInverseConfiguration
	Product dtoToModel(ProductDto productDto);

}
