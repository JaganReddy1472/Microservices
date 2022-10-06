package com.Inventory_microservice.Inventory_microservice;

import com.Inventory_microservice.Inventory_microservice.Repository.InventoryRepository;
import com.Inventory_microservice.Inventory_microservice.model.Inventory;
import java.lang.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryMicroserviceApplication.class, args);
	}

	@Bean
	public  CommandLineRunner intotheinventory(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory=new Inventory();
			inventory.setSkucode("order_10");
			inventory.setQuantity(10);

			Inventory inventory1 = new Inventory();
			inventory1.setSkucode("order_20");
			inventory1.setQuantity(10);

			Inventory inventory2=new Inventory();

			inventory2.setSkucode("order_30");
			inventory2.setQuantity(10);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
			inventoryRepository.save(inventory);

		};
	}
}
