package com.estate.entity;

import io.micronaut.data.annotation.GeneratedValue;
import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "property_features")
public class PropertyFeature {
    @Id
    @GeneratedValue
    Long featureId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "property_id")
    private Property property_id;

}
