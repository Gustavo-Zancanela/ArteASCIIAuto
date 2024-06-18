public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
       
        if(width <= 1 || height <= 1)
            {
                 System.out.println("#");
            }
        else{ 
        for(int i = 0; i < width;i++)
       {
                System.out.print("#");
            
        }
       
         System.out.println();
       
         for (int i = 0; i < height - 2; i++) 
         {
             
            for (int j = 0; j < width; j++) 
            {
                if (j == 0 || j == width - 1) 
                {
                    System.out.print("#"); 
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
              System.out.println();
              
        }
         
          for(int i = 0; i < width;i++)
       {
                System.out.print("#");
            
        }
  }
        System.out.println();
        System.out.println();
 }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        if(leg <= 1)
        {
            System.out.println("#");
        }
        else{
        
        for(int i = 0; i < leg - 1; i++)
        {
         for (int j = 0; j < leg; j++) 
            {
                if (j == 0 || j == i ) 
                {
                    System.out.print("#"); 
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
              System.out.println();
        }
      
         for(int i = 0; i < leg;i++)
       {
                System.out.print("#");
            
        }
    }
        
  }
}

