import java.util.*;

public class ClasseMain {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("digite o número  do pedido: ");
    int dia = scanner.nextInt();
    
    if( dia == 1){
      System.out.println("Big mac"); 
    }else{
      
      if( dia == 2){
        
        System.out.println("Mc chicken"); 
      }else{
        
         if( dia == 3){
          
          System.out.println("Mc double");  
          
         }else{
           
         }
          
          if(dia > 3){
            
            System.out.println("Não corresponde"); 
            
          }else{
                
          }
        
      }      
      
    }
    

    
  
    
  
  }
}
