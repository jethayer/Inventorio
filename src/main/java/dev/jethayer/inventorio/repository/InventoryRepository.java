package dev.jethayer.inventorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jethayer.inventorio.model.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    
}
