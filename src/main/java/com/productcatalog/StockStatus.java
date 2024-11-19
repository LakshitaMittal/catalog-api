package com.productcatalog;

public class StockStatus {
    private boolean inStock;
    private int quantity;

    // Getters and Setters
    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
