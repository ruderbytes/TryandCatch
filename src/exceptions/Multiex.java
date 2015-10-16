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
public class Multiex {
        public static void main(String[] args) { 
        int bil=10; 
        String b[] = {"a","b","c"}; 
        try{ 
            System.out.println(bil/1); 
            System.out.println(b[3]); 
        }catch(ArithmeticException e){ 
            System.out.println("Error Aritmetik"); 
        }catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println("Error Kapasitas Array Melebihi Batas"); 
        }catch(Exception e){ 
            System.out.println("Terdapat Error"); 
        } 
    } 
}
