package com.nayana.Example;

/**
 * Price of an item
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	// Input of values
    	int price=34200;
    	int fullprice;
        String name= new String("Camera");
        Boolean Luxury = true;
        
       fullprice = PriceAnItem(price,Luxury);
        
        System.out.print("Item is " + name+ " Price of Item is " + fullprice);
        if (Luxury){
        	System.out.println(".  This is a luxury item.");
        }else{
        	System.out.println(".  This is not a luxury item.");
        }
        
        
   }
    
    public static int PriceAnItem(int price, boolean luxury)
    {
    	int Fullprice;
    	
    	if (luxury) {
        	Fullprice= (int) (price*1.09);
        }else {
        	Fullprice= (int) (price*1.01);
        }
    	
		return Fullprice;
    	
    }
    
}
