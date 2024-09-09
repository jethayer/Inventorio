package dev.jethayer.inventorio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.jethayer.inventorio.model.InventoryItem;
import dev.jethayer.inventorio.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping
public class InventoryController {
    
    @Autowired
    private InventoryService service;

    @GetMapping
    public List<InventoryItem> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryItem> getItemById(@PathVariable Long id) {
        return service.getItemById(id)
                        .map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());   
    }

    @PostMapping
    public InventoryItem createItem(@RequestBody InventoryItem item) {
        return service.saveItem(item);
    }

    @PutMapping("/id")
    public ResponseEntity<InventoryItem> updateItem(@PathVariable Long id, @RequestBody InventoryItem item) {
        return ResponseEntity.ok(service.updateItem(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}