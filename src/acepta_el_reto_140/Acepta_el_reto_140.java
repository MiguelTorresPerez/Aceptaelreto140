/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_el_reto_140;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Acepta_el_reto_140 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros = sc.nextLine();
        char array[] = numeros.toCharArray();
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += (array[i] - 48);
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " + ");
        }
        System.out.print(array[array.length - 1] + " = ");
        System.out.println(total);
    }
}
