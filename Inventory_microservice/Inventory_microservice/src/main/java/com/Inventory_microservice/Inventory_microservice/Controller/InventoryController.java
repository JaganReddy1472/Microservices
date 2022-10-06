package com.Inventory_microservice.Inventory_microservice.Controller;

import com.Inventory_microservice.Inventory_microservice.Service.InventoryService;
import com.Inventory_microservice.Inventory_microservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skucode ) {
        return inventoryService.isInStock(skucode);

    }
}
