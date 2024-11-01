/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author Dell-
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProsesBMI BMIProses = new ProsesBMI(167, 45);
        
        BMIProses.setIdentitas("Achmad Fajar Sodiq", 19);
        
        System.out.println(BMIProses.getIdentitas());
        System.out.println("Tinggi Badan= " + BMIProses.tinggiBadan + " m");
        System.out.println("Berat Badan= " + BMIProses.beratBadan + " Kg");
        System.out.println("BMI= " + BMIProses.hitungBMI());
        System.out.println("Kategori BMI= " + BMIProses.getKategori());       
    }
    
}
