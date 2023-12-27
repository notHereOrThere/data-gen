package com.example.datagen.web.mapper;

import com.example.datagen.model.Data;
import com.example.datagen.web.dto.DataDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DataMapper {
    Data toEntity(DataDto d);

}