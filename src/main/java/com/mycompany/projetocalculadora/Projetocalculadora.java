/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocalculadora;

import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Projetocalculadora {

    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite seu salario: ");
        float salario = teclado.nextFloat();
         
        System.out.print("Digite seu aluguel: ");
        float aluguel = teclado.nextFloat();
        
        System.out.print("Digite seu gasto com alimentacao: ");
        float alimentacao = teclado.nextFloat();
        
        System.out.print("Digite seu gasto com estudo: ");
        float estudo = teclado.nextFloat();
        
        System.out.print("Digite seu gasto com lazer: ");
        float lazer = teclado.nextFloat();
              
        float totalGastos = aluguel + alimentacao + estudo + lazer;
        
        float saldo = salario - totalGastos;
        
        System.out.printf("olá %s \n", nome);
        
         System.out.printf("seu salario: %.2f \n", salario);
        
        System.out.printf("seu gasto foi de: %.2f \n", totalGastos);
        /*neste printf é para entregar o saldo gasto para melhor controle do 
        usuario
        */
        System.out.printf("seu saldo é: %.2f \n", saldo);
        /* aqui vai aparecer somente o saldo somado
        */
        
                }
}
