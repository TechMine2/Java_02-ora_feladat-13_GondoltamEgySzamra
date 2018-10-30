package javaapp_02_gondoltamegyszamra;

import java.util.Random;
import java.util.Scanner;

public class JavaApp_02_GondoltamEgySzamra {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomSzam = r.nextInt(101)+1;
        int tippeltSzam;
        System.out.println("Tippelj egy számra 1 és 100 között");
        do {
            tippeltSzam = sc.nextInt();
            if (tippeltSzam>randomSzam) {
                System.out.println("Kisebb számra gondoltam!");
            }else if (tippeltSzam<randomSzam) {
                System.out.println("Nagyobb számra gondoltam!");
            }else{
                System.out.println("Gratulálunk!");
            }
        } while (randomSzam!= tippeltSzam);
        
    }
    
}
