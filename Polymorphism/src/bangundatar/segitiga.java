/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Leman
 */
public class segitiga extends Bangundatar {

    int alas;
    int tinggi;
    int st;

    public segitiga(int alas, int tinggi, int st) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.st = st;
    }

    @Override
    public float luas() {
        return this.alas * this.tinggi;
    }
    @Override
    public float keliling(){
        return this.st+st+alas;
    }
}
