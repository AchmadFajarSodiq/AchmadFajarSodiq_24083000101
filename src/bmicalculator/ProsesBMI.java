/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author Dell-
 */
public class ProsesBMI {
    String nama;
    int umur;
    double tinggiBadan;
    double beratBadan;
    
    public ProsesBMI (double tinggiBadan, double beratBadan) {
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }
    
    public void setIdentitas (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public String getIdentitas() {
        return "Nama= " + nama + ", Umur = " + umur;
    }
    
    public double hitungBMI() {
        return beratBadan / ((tinggiBadan / 100) * (tinggiBadan / 100));
    }
    
    public String getKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Gemuk";
        } else {
            return "Obesitas";
        }    
    }
            
}
