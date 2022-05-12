package com.estate.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
public class AddressModel implements Serializable
{

    @SerializedName("address_id")
    @JsonProperty("address_id")
    @Expose
    public long addressId;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("neighbourhood")
    @Expose
    public String neighbourhood;
    @SerializedName("property")
    @Expose
    public String property;
    @Serial
    private final static long serialVersionUID = 6843621399979113462L;
}
