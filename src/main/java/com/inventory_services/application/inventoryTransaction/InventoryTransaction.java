package com.inventory_services.application.inventoryTransaction;

import com.inventory_services.application.inventory.Inventory;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "InventoryTransaction")
@Data
public class InventoryTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    private Integer quantityChange;

    private String transactionType; // e.g., "SALE", "RETURN", "RECEIVE"

    @Column(name = "transaction_date")
    private Timestamp transactionDate;

    // Getters and Setters
}
