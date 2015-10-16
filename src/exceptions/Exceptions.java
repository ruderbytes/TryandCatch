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
public class Exceptions {
  public static void main(String args[]){
   try{
    int a[]=new int[5];
    a[5]=30/90;
   }
   catch(ArithmeticException e){
       System.out.println("task1 is completed");
   }
   catch(ArrayIndexOutOfBoundsException e){
       System.out.println("task 2 completed");
   }
   catch(Exception e){
       System.out.println("common task completed");
   }finally{
   System.out.println("rest of the code...");
   }
 }
}