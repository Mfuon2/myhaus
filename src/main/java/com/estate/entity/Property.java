package com.estate.entity;

import com.estate.enums.PropertyStatus;
import com.estate.enums.PropertyTypes;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "properties")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long propertyId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "bedrooms")
    private int bedrooms;
    @Column(name = "bathrooms")
    private int bathrooms;
    @Column(name = "year")
    private int year;
    @Column(name = "area")
    private int area;
    @Column(name = "garages")
    int garages;
    @Column(name = "views")
    private int views;
    @Column(name = "location")
    private String location;
    @Column(name = "status")
    private String status;
    @Column(name = "property_type")
    private PropertyTypes propertyType;
    @Column(name = "property_status")
    private PropertyStatus propertyStatus;
    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "property_id",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<PropertyImage> propertyImages;

    @OneToMany(mappedBy = "property_id",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<PropertyFeature> propertyFeatures;

}
