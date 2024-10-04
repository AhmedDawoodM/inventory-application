package com.inventory_services.application.order;

import com.inventory_services.application.contact.Contact;
import com.inventory_services.application.seller.Seller;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "`Order`")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String customerName;

    private BigDecimal totalAmount;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "customer_contact_id")
    private Contact customerContact;

    private Date orderDate;

    private Date deliveryDate;

    private String status;

    // Getters and Setters
}

