package com.OrderService.order_service_microsevice.Repository;

import com.OrderService.order_service_microsevice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Long> {
}
