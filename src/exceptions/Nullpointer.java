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
public class Nullpointer {
    public static void main(String[] args) {
        try
        {
            int a = 1/0;  //berpotensi untuk menimbulkan kesalahan yaitu pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        }
        catch(NullPointerException e)
        {
            System.out.println("a "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("b "+e);
        }
        catch(Exception e)
        {
            System.out.println("c "+e);
        }
    }
}
