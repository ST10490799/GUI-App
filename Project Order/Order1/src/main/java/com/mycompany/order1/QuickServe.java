/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author avela
 */
package com.mycompany.order1;
import javax.swing.JOptionPane;

public class QuickServe {

    public static void main(String[] args) {

        // Customer details
        String customerName = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNumber = JOptionPane.showInputDialog("Enter Student Number:");

        // Order details
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price per Item:"));

        // Create Order object
        Order order = new Order(item, quantity, price);

        double subtotal = order.calculateSubtotal();
        double discount = order.calculateDiscount();
        double vat = order.calculateVAT();
        double total = order.calculateTotal();

        // Receipt
        String receipt =
                "===== Campus QuickServe Receipt =====\n\n" +
                "Customer Name: " + customerName + "\n" +
                "Student Number: " + studentNumber + "\n\n" +
                "Item Ordered: " + order.getItemName() + "\n" +
                "Quantity: " + order.getQuantity() + "\n" +
                "Price per Item: R" + order.getPrice() + "\n\n" +
                "Subtotal: R" + String.format("%.2f", subtotal) + "\n" +
                "Discount Applied: R" + String.format("%.2f", discount) + "\n" +
                "VAT (15%): R" + String.format("%.2f", vat) + "\n" +
                "Total: R" + String.format("%.2f", total) + "\n\n" +
                "=====================================";

        JOptionPane.showMessageDialog(null, receipt);
    }
}