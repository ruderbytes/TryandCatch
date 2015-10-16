/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author muhammad
 */
public class Excfiny {
    public static void main(String args[]){ 
              int a[] = new int[2]; 
              a[1] = 10;
      try{ 
         System.out.println("Access element three :" + a[3]); 
      }catch(ArrayIndexOutOfBoundsException e){ 
         System.out.println("Exception thrown  :" + e); 
      } 
      finally{ 
         a[0] = 6; 
         System.out.println("First element value: " +a[0]);
         System.out.println("Second element value: " +a[1]); 
         System.out.println("The finally statement is executed"); 
      } 
   } 
    
}
