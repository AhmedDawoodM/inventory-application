package com.inventory_services.application.seller;

import com.inventory_services.application.address.Address;
import com.inventory_services.application.contact.Contact;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Seller")
@Data
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sellerId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    // Getters and Setters
}
