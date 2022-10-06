package com.OrderService.order_service_microsevice.dto;


import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderListItemsDto {
    private Long Id;
    private String skucode;
    private BigDecimal price;
    private Integer quantity;


}
