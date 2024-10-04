package com.inventory_services.application.inventory;

import com.inventory_services.application.company.Company;
import com.inventory_services.application.item.Item;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "Inventory")
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private Integer quantity;

    private String warehouseLocation;

    @Column(name = "last_updated")
    private Timestamp lastUpdated;

    // Getters and Setters
}
