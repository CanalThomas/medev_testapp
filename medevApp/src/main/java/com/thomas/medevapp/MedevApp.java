/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.thomas.medevapp;

/**
 *
 * @author mouche66
 */
public class MedevApp {

    public static void main(String[] args) {
        System.out.println(Operator.helloWorld());
        final Adresse adr = new Adresse("88", "street", "barcares","France");
        final Personne pers = new Personne("Thomas", "Canal", "tomcantal@hotmtial.fr", adr);
        final int a,b,res;
        
        System.out.println(pers);
        
        a = 4;
        b = 7;
        
        res = Operator.multiplication(Operator.sum(a, b),a);
        
        System.out.println("4*(7+4) = " + res);
        
        
    }
}
