/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectprakpbo;

import java.util.Random;

/**
 *
 * @author Frisca
 */
public class Nasabah {
    public String namaNasabah;public String email;String noHp;
    String ktp; String kerja; String ortu;String alamat;
    int saldoAwal;
    
    Random rand = new Random();
    int rek = rand.nextInt(9000000) + 1000000;
    
}
