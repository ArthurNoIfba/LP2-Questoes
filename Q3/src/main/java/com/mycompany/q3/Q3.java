
package com.mycompany.q3;

import java.util.Scanner;

/**
 *
 * @author Arthur Fernandes
 */
public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º intervalo de tempo:");
        System.out.print("Horas: ");
        int h1 = scanner.nextInt();
        System.out.print("Minutos: ");
        int m1 = scanner.nextInt();
        System.out.print("Segundos: ");
        int s1 = scanner.nextInt();

        System.out.println("Digite o 2º intervalo de tempo:")  ;
        System.out.print("Horas: ");
        int h2 = scanner.nextInt();
        System.out.print("Minutos: ");
        int m2 = scanner.nextInt();
        System.out.print("Segundos: ");
        int s2 = scanner.nextInt();

        int sh = h1 + h2;
        int sm = m1 + m2;
        int ss = s1 + s2;

        int dh = Math.abs(h1 - h2);
        int dm = Math.abs(m1 - m2);
        int ds = Math.abs(s1 - s2);

        sm += ss / 60;
        ss %= 60;

        sh += sm / 60;
        sm %= 60;

        // Exibe os resultados
        System.out.println("\nSoma dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", sh, sm, ss);

        System.out.println("\nDiferença dos intervalos de tempo:");
        System.out.printf("%02d:%02d:%02d\n", dh, dm, ds);  
    }
}