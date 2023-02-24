package exeptionHandling;


public class assign2 {  
	  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                
                System.out.println(a[10]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception ");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception ");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Exception ");  
                  }             
              
    }  
}  