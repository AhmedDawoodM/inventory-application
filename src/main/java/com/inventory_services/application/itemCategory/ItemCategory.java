package com.inventory_services.application.itemCategory;

import com.inventory_services.application.category.Category;
import com.inventory_services.application.item.Item;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ItemCategory")
@IdClass(ItemCategoryId.class) // Composite key
@Data
public class ItemCategory {

    @Id
    @Column(name = "item_id")  // Explicitly map the column name
    private Long itemId;

    @Id
    @Column(name = "category_id")  // Explicitly map the column name
    private Long categoryId;

    @ManyToOne
    @JoinColumn(name = "item_id", insertable = false, updatable = false)
    private Item item;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;

    // Getters and Setters
}
