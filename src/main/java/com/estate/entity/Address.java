package com.estate.entity;

import io.micronaut.data.annotation.GeneratedValue;
import lombok.*;

import javax.persistence.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue
    public long addressId;
    @Column(name = "address")
    public String address;
    @Column(name = "country")
    public String country;
    @Column(name = "city")
    public String city;
    @Column(name = "neighbourhood")
    public String neighbourhood;
    @OneToOne
    public Property property;
}
