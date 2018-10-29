/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan53.rabbit;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Keterangan nama binatang Kelinci yang 
 * tidak bisa di ketik di keyboard user
 */
public class PBO310117104Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit kelinci = new Rabbit("Peter",false,"grass",4,"grey");
        
        System.out.println("Hello, His name is "+kelinci.getName());
        System.out.println(kelinci.getName()+" is Vegetarian? "+kelinci.vegetarian);
        System.out.println(kelinci.getName()+" eats "+kelinci.getEats());
        System.out.println(kelinci.getName()+" has "+kelinci.getNoOfLegs()+" legs");
        System.out.println(kelinci.getName()+" color is "+kelinci.getColor()); 
    }
    
}
