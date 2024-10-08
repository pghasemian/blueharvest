package com.assignment.blueharvest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity representing a customer.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    /**
     * Unique identifier for the customer.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The first name of the customer.
     */
    private String firstName;

    /**
     * The surname of the customer.
     */
    private String surName;
}
