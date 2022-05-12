package com.estate.controller;

import com.estate.common.ApiResponse;
import com.estate.models.PropertyModel;
import com.estate.service.IPropertyService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import java.util.List;

@Controller("/api")
public class PropertiesController {

    @Inject
    private IPropertyService propertyService;

    @Get(uri="/properties/{propertyId}", produces = MediaType.APPLICATION_JSON)
    public ApiResponse<List<PropertyModel>> getProperties(@PathVariable Long propertyId) {
        return propertyService.getProperties(propertyId);
    }

    @Post(uri = "/properties")
    public ApiResponse<PropertyModel> addProperty(@Body PropertyModel propertyModel) {
        return propertyService.addProperty(propertyModel);
    }
}