package com.Inventory_microservice.Inventory_microservice.Service;

import com.Inventory_microservice.Inventory_microservice.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Transactional
    public boolean isInStock(String Skucode)
    {
           return inventoryRepository.findBySkucode(Skucode).isPresent();
    }
}
