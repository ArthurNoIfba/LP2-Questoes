
package com.mycompany.q;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Fernandes
 */
public class Q5 {

    public static void main(String[] args) {

        double salarios[] = new double[5], rj, sf;
        
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário número " + (i + 1) + " (OBS: Utilizar '.' e não ',')"));
        }
        
        rj = Double.parseDouble(JOptionPane.showInputDialog("Digite o reajuste (OBS: Não usar %)"));

        StringBuilder mensagem = new StringBuilder("Salários reajustados:\n");         
        for (int i = 0; i < salarios.length; i++) {
            sf = salarios[i] + (salarios[i] * rj / 100);
            mensagem.append("Salário ").append(i + 1).append(": ").append(String.format("%.2f", sf)).append("\n");
        } 
        
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}