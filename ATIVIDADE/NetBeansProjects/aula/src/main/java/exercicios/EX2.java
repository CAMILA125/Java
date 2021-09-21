/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Catulo
 */
public class EX2 {
    public static void main(String[] args){
        //inserindo informações
     
    
        Moto biz= new Moto();
        biz.setModelo_mot("BIZ");
        biz.setBau_mot("grande");
        biz.setAro_mot(19);
        
        Carro siena= new Carro();
        siena.setValor_car((float) 21000.50);
        siena.setMarca_car("Sdtaudt");
        siena.setModelo_car("2011");
        
        
        //apresentando informações
        System.out.println("Moto modelo: "+ biz.getModelo_mot());
        System.out.println("Moto bau: "+biz.getBau_mot());
        System.out.println("Moto aro: "+biz.getAro_mot());
        
        System.out.println("Carro valor: "+ siena.getValor_car());
        System.out.println("Carro marca: "+siena.getMarca_car());
        System.out.println("Carro modelo: "+siena.getModelo_car());

    }
}
