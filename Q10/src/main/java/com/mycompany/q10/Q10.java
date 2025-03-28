
package com.mycompany.q10;

import java.util.Scanner;

/**
 *
 * @author Arthur Fernandes
 */
public class Q10 {

    public static void categoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        }
        if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        }
        if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        }
        if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        }
        if (idade >= 18) {
            System.out.println("Adulto");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        categoria(idade);
        scanner.close();
    }
}