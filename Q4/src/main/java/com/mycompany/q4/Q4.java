
package com.mycompany.q4;

import java.util.Scanner;

/**
 *
 * @author Arthur Fernandes
 */
public class Q4 {

    public static void main(String[] args) {
        int n,nd,cont=0; 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um valor inteiro maior ou igual a 0: ");
        n=scanner.nextInt();
        if (n<0) {
            System.out.println("Erro. Insira um valor inteiro maior ou igual a 0");
        } else {
            nd=contdigitos(n);
            System.out.println("O número de dígitos é: "+n);
        }
    }

    public static int contdigitos(int n) {
        int count=0;
        if (n==0) {
            return 1; 
        }
        while (n!=0) {
            count++;
            n/=10;
        }
        return count;
    }
}
