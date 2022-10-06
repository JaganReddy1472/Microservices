package com.OrderService.order_service_microsevice.Controller;

import com.OrderService.order_service_microsevice.Service.OrderService;
import com.OrderService.order_service_microsevice.dto.RequestOrder;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody @NotNull RequestOrder requestOrder){


        System.out.println("calling Order controller class");
        orderService.placeOrder(requestOrder);
        return  "Order placed Successfully";
    }

}
