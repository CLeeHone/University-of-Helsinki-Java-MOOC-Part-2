/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author chloe
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
 
    //instance variables
    private ChangeHistory warehouseHistory = new ChangeHistory();
 
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.balance = initialBalance;
        warehouseHistory.add(initialBalance);
    }
 
    public String history() {
        return warehouseHistory.toString();
    }
 
    @Override
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            super.balance = super.balance + amount;
        } else {
            super.balance = super.capacity;
        }
        warehouseHistory.add(super.balance);
    }
 
    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }
        this.balance = this.balance - amount;
 
        warehouseHistory.add(super.balance);
 
        return amount;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + warehouseHistory.toString());
        System.out.println("Largest amount of product: " + warehouseHistory.maxValue());
        System.out.println("Smallest amount of product: " + warehouseHistory.minValue());
        System.out.println("Average: " + warehouseHistory.average());
    }
}
 