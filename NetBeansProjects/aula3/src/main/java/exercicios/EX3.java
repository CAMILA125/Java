/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

public class EX3 {
     public static void main(String[] args){
        //inserindo informações
        int a = 34;
        int b = 12;
        
        Calculadora calcularoraMaster = new Calculadora();
        //apresentando informações
        System.out.println("a= 12 \nb= 34\n");
        System.out.println("\na+b = "+ calcularoraMaster.adicionar(a , b));
        System.out.println("\na-b = "+ calcularoraMaster.subtrair(a , b));
        System.out.println("\na*b = "+ calcularoraMaster.multiplicar(a , b));
        System.out.println("\na/b = "+ calcularoraMaster.dividir(a , b));

    }
}
