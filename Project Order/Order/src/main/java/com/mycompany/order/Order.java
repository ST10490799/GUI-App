/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.order;

/**
 *
 * @author avela
 */
public class Order {

    // Constant
    public static final double VAT_RATE = 0.15;

    // Private attributes (Encapsulation)
    private String itemName;
    private int quantity;
    private double price;
        // Getters

    // Constructor
    public Order(String itemN,int q,double p) {
        itemName = itemN;
        quantity = q ;
        price = p;
    }
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Subtotal calculation
    public double calculateSubtotal() {
        return quantity * price;
    }

    // Discount calculation (10% if quantity > 3)
    public double calculateDiscount() {
        if (quantity > 3) {
            return calculateSubtotal() * 0.10;
        }
        return 0.0;
    }

    // VAT calculation (after discount)
    public double calculateVAT() {
        double afterDiscount = calculateSubtotal() - calculateDiscount();
        return afterDiscount * VAT_RATE;
    }

    // Final total
    public double calculateTotal() {
        double afterDiscount = calculateSubtotal() - calculateDiscount();
        return afterDiscount + calculateVAT();
    }
}