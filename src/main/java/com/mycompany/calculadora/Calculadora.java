/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author pedro
 */
public class Calculadora {

    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        
        op.leerNumeros();
        op.sumar();
        op.resta();
        op.multiplicacion();
        op.division();
        op.mostrarResultados();
    }
}
