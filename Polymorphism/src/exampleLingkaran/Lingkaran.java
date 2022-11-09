/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampleLingkaran;

/**
 *
 * @author Leman
 */
public class Lingkaran {
    private double pi = 3.14;
// menghitung luas lingkaran menggunakan jari-jari

    public float luas(int r) {
        return (float) (this.pi * r * r);
    }
// menghitung luas lingkaran menggunakan diameter

    public double luas(double d) {
        return (double) (1/4 * this.pi * d);
    }

}
