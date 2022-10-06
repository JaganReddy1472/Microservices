package com.OrderService.order_service_microsevice.model;

import lombok.*;
import org.hibernate.engine.internal.Cascade;
import java.util.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String OrderNumber;
    @OneToMany(cascade=CascadeType.ALL)
    private List<OrderItemList> orderItemList;

}
