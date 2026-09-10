/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocalculadora;

/**
 *
 * @author PICHAU
 */
public class Projetocalculadora {

    public static void main(String[] args){
   
        String nome = "Pedro";
        
        float salario = 3600f;
        
        float aluguel = 790f;
        
        float alimentacao = 650f;
        
        float estudo = 350f;
        
        float lazer = 600f;
              
        float totalGastos = aluguel + alimentacao + estudo + lazer;
        
        float saldo = salario - totalGastos;
        
        System.out.printf("olá %s \n", nome);
        
        System.out.printf("seu saldo é: %.2f \n", saldo);
        /* aqui vai aparecer somente o saldo somado
        */
                }
}
