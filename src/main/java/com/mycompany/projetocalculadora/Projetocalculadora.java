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
        if (saldo > 0) { 
            float porcentagem = saldo / salario * 100;
    System.out.printf("voce economizou %.2f%% do seu salario \n" , porcentagem);
            // se o saldo for maior que zero aparecera a mensagem           
            System.out.printf("seu saldo esta positivo este mes! \n");              
        }
        else if (saldo < 0) {
            float porcentagem = saldo / salario * -100;
    System.out.printf("voce ultrapassou %.2f%% do seu salario \n" , porcentagem);    
            // se o saldo for menor que zero aparecera a mensagem
            System.out.printf("seu saldo esta negativo este mes \n:[ ");
        }
        
        else {
            System.out.printf("voce esta no zero a zero! \n");           
        }
        
        if (aluguel >= lazer && aluguel >= estudo && aluguel >= alimentacao ) {
        System.out.printf("seu maior gasto foi aluguel: %.2f \n " , aluguel);
    }
  else if(alimentacao >= aluguel && alimentacao >= estudo && alimentacao >= lazer){
      System.out.printf("seu maior gasto foi alimentacao: %.2f" , alimentacao); 
   }
  else if (lazer >= aluguel && lazer >= alimentacao && lazer >= estudo) {
       System.out.printf("seu maior gasto foi lazer: %.2f" , lazer);
   }
  else if (estudo >= aluguel && estudo >= alimentacao && estudo >= lazer ){
       System.out.printf("seu maior gasto foi estudo: %.2f" , estudo);
   }
    }
}
