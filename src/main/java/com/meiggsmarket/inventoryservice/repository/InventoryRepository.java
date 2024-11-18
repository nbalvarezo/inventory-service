package com.meiggsmarket.inventoryservice.repository;

import com.meiggsmarket.inventoryservice.model.Inventory;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {



}
