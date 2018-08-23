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
public class TV extends Item {
    private double size;
    private String functionDescription;

    public TV(String type, String manufacturer, double price, double costPrice, Period warranty,
            double size, String functionDescription) {
        super(type, manufacturer, price, costPrice, warranty);
        this.size = size;
        this.functionDescription = functionDescription;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the functionDescription
     */
    public String getFunctionDescription() {
        return functionDescription;
    }

    /**
     * @param functionDescription the functionDescription to set
     */
    public void setFunctionDescription(String functionDescription) {
        this.functionDescription = functionDescription;
    }
}
