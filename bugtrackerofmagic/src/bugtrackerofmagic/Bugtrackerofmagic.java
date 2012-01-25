/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtrackerofmagic;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Bugtrackerofmagic {

    public static void rec(ArrayList<Integer> estadoInicial, ArrayList<Integer> alternativas) {
        if (alternativas.isEmpty()) {
            for (int i = 0; i < estadoInicial.size(); i++) {
                System.out.print(estadoInicial.get(i) + ", ");
            }
            System.out.println("");
        } else {
            for (int i = 0; i < alternativas.size(); i++) {
                int foo = alternativas.get(i);
                estadoInicial.add(alternativas.get(i));
                alternativas.remove(i);
                rec(estadoInicial, alternativas);
                alternativas.add(i, foo);
                estadoInicial.remove(alternativas.get(i));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 60;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> choise = new ArrayList<Integer>();
        //int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            //cartas.add(i);
            choise.add(i);
        }
        rec(result, choise);
    }
}
