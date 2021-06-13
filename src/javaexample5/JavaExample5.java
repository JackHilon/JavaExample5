
package javaexample5;

import Model.ClothingItem;
import Model.Product;
import Model.Shirt;
import Model.Size;
import static Model.Size.*;


public class JavaExample5 {

    
    public static void main(String[] args) {
        
        ClothingItem item= new ClothingItem("shirt", S, 14.9);
        System.out.println(item.toString());
        DisplayProduct(item);
        
        System.out.println(" ");
        
        Shirt shirt=new Shirt(L, 20.01);
        System.out.println(shirt);
        shirt.setPattern("plaid");
        System.out.println("shirt pattern: "+shirt.getPattern());
        DisplayProduct(shirt);
        
        System.out.println(" ");
        
        ClothingItem reallyAShirt=new Shirt(XL, 0);
        System.out.println(reallyAShirt);
        Shirt shirt2= (Shirt)reallyAShirt; 
        shirt2.setPattern("solid");
        System.out.println("shirt pattern: "+shirt2.getPattern());
        DisplayProduct(reallyAShirt);
        DisplayProduct(shirt2);

    } // end main
    
    private static void DisplayProduct(Product product)
    {
        String message = product.getClass().getSimpleName()+" {type: "+product.getType()+", size: "+
                product.getSize()+", price: "+product.getPrice()+"}";
        System.out.println(message);
    }
    
}
