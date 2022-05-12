package com.estate.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Builder
@Setter
@Getter
public class PropertyModel implements Serializable
{
    @SerializedName("property_id")
    @JsonProperty("property_id")
    @Expose
    public long propertyId;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("price")
    @Expose
    public long price;
    @SerializedName("bedrooms")
    @Expose
    public long bedrooms;
    @SerializedName("bathrooms")
    @Expose
    public long bathrooms;
    @SerializedName("year")
    @Expose
    public long year;
    @SerializedName("area")
    @Expose
    public long area;
    @SerializedName("garages")
    @Expose
    public long garages;
    @SerializedName("views")
    @Expose
    public long views;
    @SerializedName("location")
    @Expose
    public String location;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("property_type")
    @JsonProperty("property_type")
    @Expose
    public String propertyType;
    @SerializedName("property_status")
    @JsonProperty("property_status")
    @Expose
    public String propertyStatus;
    @SerializedName("address")
    @Expose
    public AddressModel address;
    @SerializedName("propertyImages")
    @JsonProperty("property_images")
    @Expose
    public List<PropertyImageModel> propertyImages;
    @SerializedName("propertyFeatures")
    @JsonProperty("property_features")
    @Expose
    public List<PropertyFeatureModel> propertyFeatures;

    @Serial
    private final static long serialVersionUID = 5197816893747896682L;

}
