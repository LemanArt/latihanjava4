/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Leman
 */
public class main {
    public static void main(String[] args) {
        Bangundatar bangunDatar = new Bangundatar();
        persegi persegi = new persegi(5);
        segitiga segitiga = new segitiga(6, 3, 7);
        lingkaran lingkaran = new lingkaran(100);
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("\nLuas segitiga: " + segitiga.luas());
        System.out.println("keliling persegi: " + segitiga.keliling());
        System.out.println("\nLuas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}
