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
public class Monitor extends Item {

    public Monitor(String type, String manufacturer, double price, double costPrice, Period warranty) {
        super(type, manufacturer, price, costPrice, warranty);
    }
    

    @Override
    public String getName() {
        return "Datorskärm";
    }
    
}
