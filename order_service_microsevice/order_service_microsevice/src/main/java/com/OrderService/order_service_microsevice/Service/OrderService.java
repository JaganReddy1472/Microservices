package com.OrderService.order_service_microsevice.Service;

import com.OrderService.order_service_microsevice.Repository.OrderRepository;
import com.OrderService.order_service_microsevice.dto.OrderListItemsDto;
import com.OrderService.order_service_microsevice.dto.RequestOrder;
import com.OrderService.order_service_microsevice.model.Order;
import com.OrderService.order_service_microsevice.model.OrderItemList;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void placeOrder(@NotNull RequestOrder requestOrder) {

        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderItemList> orderItemLists =requestOrder.getOrderListItemsDtos().stream().map(this::maptodto).collect(Collectors.toList());
        order.setOrderItemList(orderItemLists);

        orderRepository.save(order);
    }

    private @NotNull OrderItemList maptodto(@NotNull OrderListItemsDto orderListItemsDto) {
        OrderItemList orderItemList = new OrderItemList();
        orderItemList.setSkucode(orderListItemsDto.getSkucode());
        orderItemList.setQuantity(orderListItemsDto.getQuantity());
        orderItemList.setPrice(orderListItemsDto.getPrice());

        return orderItemList;
    }
}