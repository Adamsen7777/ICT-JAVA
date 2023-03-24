
package com;


public class DOG {
    String variety ;
    int bittingpound;
    
    void dogspeed()
    {
        System.out.println(variety + " barks so loud. ");
        System.out.println(variety + " has more bitting pound around " + bittingpound + " PSI." );
    }
      DOG()
      {
          variety = "GERMAN SHEPARD";
          bittingpound = 250 ;
          
      }
      DOG(int i)
      {
          variety = "HUSKEY";
          bittingpound = 200 ;
}
}
