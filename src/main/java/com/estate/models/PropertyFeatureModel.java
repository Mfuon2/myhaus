package com.estate.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PropertyFeatureModel {

    @SerializedName("feature_id")
    @JsonProperty("feature_id")
    @Expose
    Long featureId;
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
