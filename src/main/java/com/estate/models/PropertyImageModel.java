package com.estate.models;

import com.estate.entity.Property;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.micronaut.data.annotation.GeneratedValue;

import javax.persistence.*;

public class PropertyImageModel {

    @SerializedName("image_id")
    @JsonProperty("image_id")
    @Expose
    Long imageId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("property_id")
    @Expose
    private String property_id;
}
