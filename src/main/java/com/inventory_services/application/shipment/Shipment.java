package com.inventory_services.application.shipment;

import com.inventory_services.application.inventory.Inventory;
import com.inventory_services.application.seller.Seller;
import com.inventory_services.application.supplier.Supplier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipmentId;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    private Date shipmentDate;

    private Date deliveryDate;

    private String shipmentStatus;

    private String trackingNumber;

    // Getters and Setters
}

