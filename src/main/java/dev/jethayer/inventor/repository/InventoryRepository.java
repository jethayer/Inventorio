package dev.jethayer.inventor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jethayer.inventor.model.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    
}
