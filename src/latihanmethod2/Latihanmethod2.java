/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmethod2;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Latihanmethod2 {

    void kalkulator(String operasi,double bil1,double bil2){
        double hasil;
        switch(operasi){
            case "Penjumlahan":
                hasil = bil1+bil2;
                break;
            case "Pengurangan":
                hasil = bil1-bil2;
                break;
            case "Perkalian":
                hasil = bil1 * bil2 ;
                break;
            case "Pembagian":
                hasil = bil1 / bil2 ;
                break;
            default:
                hasil =0;
        }
        String txtMessage = "Hasil Operasi "+operasi+" "+bil1+" dan "+bil2
                             +" adalah "+ hasil;
        JOptionPane.showMessageDialog(null,txtMessage,"Hasil Operasi",JOptionPane.PLAIN_MESSAGE);
    }
    public static void main(String[] args) {
        Latihanmethod2 lm = new Latihanmethod2();
        lm.kalkulator("Penjumlahan", 3, 5);
        lm.kalkulator("Pengurangan", 5, 2);
        lm.kalkulator("Perkalian", 0.5, 4);
        lm.kalkulator("Pembagian", 10, 5);
    }
    
}
