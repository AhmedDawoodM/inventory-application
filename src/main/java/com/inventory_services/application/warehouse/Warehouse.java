package com.inventory_services.application.warehouse;

import com.inventory_services.application.address.Address;
import com.inventory_services.application.company.Company;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Warehouse")
@Data
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    // Getters and Setters
}

