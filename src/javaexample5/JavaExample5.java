
package javaexample5;

import Model.ClothingItem;
import Model.Product;
import Model.Shirt;
import Model.Size;
import static Model.Size.*;
import java.util.Arrays;


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
        
        System.out.println(" ");
        
        ClothingItem[] items=new ClothingItem[3];
        items[0]=new ClothingItem("shirt", S, 10);
        items[1]=new ClothingItem("pants", L, 17);
        PrintArray(items);
        ClothingItem[] copied = Arrays.copyOf(items, 3);
        // items and copied are two arrays, but reference to the same object
        // any change to one of them will affects the anther array.
        PrintArray(copied);
        System.out.println(" -------------- ");
        items[0].setPrice(1000);
        PrintArray(items);
        PrintArray(copied);

    } // end main
    
    private static void DisplayProduct(Product product)
    {
        String message = product.getClass().getSimpleName()+" {type: "+product.getType()+", size: "+
                product.getSize()+", price: "+product.getPrice()+"}";
        System.out.println(message);
    }
    
    private static void PrintArray(ClothingItem[] array)
    {
        for (ClothingItem item: array) {
            System.out.println(item);
        }
    }
    
}
