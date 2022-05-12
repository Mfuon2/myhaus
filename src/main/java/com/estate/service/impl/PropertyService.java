package com.estate.service.impl;

import com.estate.common.ApiResponse;
import com.estate.entity.Property;
import com.estate.models.PropertyModel;
import com.estate.repository.PropertyRepository;
import com.estate.service.IPropertyService;
import com.google.gson.Gson;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Singleton
public class PropertyService implements IPropertyService {

    Logger log = LoggerFactory.getLogger(PropertyService.class);
    @Inject
    private PropertyRepository propertyRepository;

    @Override
    public ApiResponse<List<PropertyModel>> getProperties(Long propertyId) {
        Optional<Property> properties = propertyRepository.findById(propertyId);
        if(properties.isPresent()){
            List<PropertyModel> model = new ArrayList<>();
            BeanUtils.copyProperties(properties.stream().collect(Collectors.toList()), model);
            return new ApiResponse<>(model,true,"Fetched Data");
        }else{
            return new ApiResponse<>(true,"No Data Present");
        }
    }

    @Override
    public ApiResponse<PropertyModel> addProperty(PropertyModel propertyModel) {
        Property property = new Property();
        BeanUtils.copyProperties(propertyModel,property);
        log.info(" property object {}", property);
        propertyRepository.save(property);
        return new ApiResponse<>(true,"Property Created");
    }
}
