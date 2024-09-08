package dev.jethayer.inventor.service;

import org.springframework.beans.factory.annotation.Autowired;

import dev.jethayer.inventor.model.InventoryItem;
import dev.jethayer.inventor.repository.InventoryRepository;

import java.util.List;
import java.util.Optional;

public class InventoryService {

    @Autowired
    private InventoryRepository repository;

    public List<InventoryItem> getAllItems() {
        return repository.findAll();
    }

    public Optional<InventoryItem> getItemById(Long id) {
        return repository.findById(id);
    }
}
