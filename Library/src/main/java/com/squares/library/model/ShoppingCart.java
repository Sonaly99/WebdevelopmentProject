package com.squares.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopping_cart_id")
    private Long id;
    private int totalItems;
    private double totalPrices;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    private Set<CartItem> cartItem;
}
