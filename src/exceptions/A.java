/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

public class A
{
    public static void main(String[] args) {
        try
        {
            int a = 0 / 1; // berpotensi untuk menimbulkan kesalahan yaitu
            // pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        }
        catch (Exception kesalahan)
        {
            System.err.println(kesalahan);
        }
    }
}