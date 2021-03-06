/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lager;

import java.time.Period;

/**
 *
 * @author kmatil
 */
public abstract class Item implements Comparable<Item> {    
    
    private String type;
    private String manufacturer;
    private double price;
    private double costPrice;
    private Period warranty;
    private int amount;

    Item(String type, String manufacturer, double price, double costPrice, Period warranty) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.price = price;
        this.costPrice = costPrice;
        this.warranty = warranty;
        amount = 0;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the costPrice
     */
    public double getCostPrice() {
        return costPrice;
    }

    /**
     * @param costPrice the costPrice to set
     */
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * @return the warranty
     */
    public Period getWarranty() {
        return warranty;
    }

    /**
     * @param warranty the warranty to set
     */
    public void setWarranty(Period warranty) {
        this.warranty = warranty;
    }
    
    public abstract String getName();
    
    @Override
    public String toString() {
        return "Föremål: "+getName()+
                "\n\tTyp: "+getType()+
                "\n\tTillverkare: "+getManufacturer()+
                "\n\tPris: "+getPrice()+" kr"+
                "\n\tInköpspris: "+getCostPrice()+" kr"+
                "\n\tGarantitid: "+getWarranty().getYears()+" år";
    }

    @Override
    public int compareTo(Item o) {
        int comparison =  this.manufacturer.compareTo(o.manufacturer);
        if(comparison == 0) {
            return this.type.compareTo(o.type);
        }
        return comparison;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int addAmount(int amount) {
        return this.amount += amount;
    }
}
