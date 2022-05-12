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
@Table(name = "property_images")
public class PropertyImage {
    @Id
    @GeneratedValue
    Long imageId;

    @Column(name = "url")
    private String url;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "property_id")
    private Property property_id;

}
