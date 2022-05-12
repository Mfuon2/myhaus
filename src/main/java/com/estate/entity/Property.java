package com.estate.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "properties")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
}
