/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author marka
 */
public class ClothingItem implements Product{
    private String type;
    private Size size;
    private double price;

    public ClothingItem(String type, Size size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }
    
    
    
    // =====================================================================

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }
    // ===============================================================
    
     @Override
    public String toString() {
        return this.getClass().getSimpleName()+" {type: "+this.getType()+", size: "+
                this.getSize()+", price: "+this.getPrice()+"}";
    }
    
}
