//TESTE LÓGICO COM FUNÇÃO


import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      
      int qtMaca= 5 ;
      float v1 = 0.30f;
      float v2 =0.25f;
      
      
    
    
      float xaxa = calculo(qtMaca, v1, v2);
      
      System.out.println(" valor a ser pago é R$" + xaxa );
     
  }
  
  
  public static float calculo(int  a, float v1, float v2){
    
    if (a < 12){
      
      return a * v1;
      
    } else{
      
        return a * v2 ;
      
    }
    
  }
}