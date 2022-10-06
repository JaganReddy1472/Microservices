package com.OrderService.order_service_microsevice.dto;
import com.OrderService.order_service_microsevice.dto.OrderListItemsDto;
import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestOrder {
    private List<OrderListItemsDto> orderListItemsDtos;

}
