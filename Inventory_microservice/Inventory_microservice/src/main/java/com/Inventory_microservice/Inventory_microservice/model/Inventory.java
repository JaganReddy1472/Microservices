package com.Inventory_microservice.Inventory_microservice.model;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name="t_inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private  String skucode;
    private  Integer quantity;

}
