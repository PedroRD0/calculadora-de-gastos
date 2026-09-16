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
        
                while (salario <0){
            System.out.print("salario invalido! digite novamente.");
            salario = teclado.nextFloat();
        }
         
        System.out.print("Digite seu aluguel: ");
        float aluguel = teclado.nextFloat();
        
          while (aluguel <0){
            System.out.print("valor invalido! digite novamente.");
            aluguel = teclado.nextFloat();
          }
        System.out.print("Digite seu gasto com alimentacao: ");
        float alimentacao = teclado.nextFloat();
        
          while (alimentacao <0){
            System.out.print("valor invalido! digite novamente.");
            alimentacao = teclado.nextFloat();
          }
        System.out.print("Digite seu gasto com estudo: ");
        float estudo = teclado.nextFloat();
        
          while (estudo <0){
            System.out.print("valor invalido! digite novamente.");
            estudo = teclado.nextFloat();
          }
        System.out.print("Digite seu gasto com lazer: ");
        float lazer = teclado.nextFloat();
        
          while (lazer <0){
            System.out.print("valor invalido! digite novamente.");
            lazer = teclado.nextFloat();
          }       
        float totalGastos = aluguel + alimentacao + estudo + lazer;
        
        float saldo = salario - totalGastos;
            System.out.println("=========== RESUMO FINANCEIRO ==========");
        System.out.printf("olá %s \n", nome);
        
         System.out.printf("seu salario: R$ %.2f \n", salario);
        
        System.out.printf("gasto total: R$ %.2f \n", totalGastos);
        /*neste printf é para entregar o saldo gasto para melhor controle do 
        usuario
        */
        System.out.printf("saldo disponivel: R$ %.2f \n", saldo);
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
        System.out.printf("seu maior gasto foi aluguel: R$ %.2f \n " , aluguel);
    }
  else if(alimentacao >= aluguel && alimentacao >= estudo && alimentacao >= lazer){
      System.out.printf("seu maior gasto foi alimentacao: R$ %.2f \n" , alimentacao); 
   }
  else if (lazer >= aluguel && lazer >= alimentacao && lazer >= estudo) {
       System.out.printf("seu maior gasto foi lazer: R$ %.2f \n" , lazer);
   }
  else if (estudo >= aluguel && estudo >= alimentacao && estudo >= lazer ){
       System.out.printf("seu maior gasto foi estudo: R$ %.2f \n" , estudo);
   }
        System.out.println("=====================================");

    }
}
