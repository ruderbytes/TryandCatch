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
public class SetArrayEx {
        public static void main(String[] args) { 
         int a[] = new int[5]; 
         int b[] = new int[3];
         try{ 
            a[4] = 4 ; //this statement will be contained
            a[2] = 6;
         }catch(ArrayIndexOutOfBoundsException e){ 
             System.out.println("Terjadi  exception karena  Indeks  Array melebihi batas"); 
         }finally{ 
             System.out.println("Selalu Dijalankan"); 
         } 
         System.out.println("Setelah blok try-catch"); 
    } 
         }

