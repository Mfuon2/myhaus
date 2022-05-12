package com.estate.service;

import com.estate.common.ApiResponse;
import com.estate.entity.Property;
import com.estate.models.PropertyModel;

import java.util.List;

public interface IPropertyService {
    ApiResponse<List<PropertyModel>> getProperties(Long propertyId);
    ApiResponse<PropertyModel> addProperty(PropertyModel propertyModel);
}
