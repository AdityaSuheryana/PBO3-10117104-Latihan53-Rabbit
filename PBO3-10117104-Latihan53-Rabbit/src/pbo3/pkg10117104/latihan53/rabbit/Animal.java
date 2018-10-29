/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan53.rabbit;

/**
 *
 * @author user
 */
public class Animal {

protected boolean vegetarian;
protected String eats;
protected int noOfLegs;

    public Animal(boolean veg, String food, int legs) {
   this.vegetarian = veg;
   this.eats = food; 
   this.noOfLegs= legs;   
    }



    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public String getEats() {
        return eats;
    }



}
