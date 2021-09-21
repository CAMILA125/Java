/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

public class EX1 {
    public static void main(String[] args){
        //inserindo informações
        Pessoa pessoa1= new Pessoa();
        pessoa1.setNome("Camila");
        pessoa1.setSobrenome("Munzlinger");
        pessoa1.setIdade(19);
        pessoa1.setEndereco("Palmitos-SC");
        
        Pessoa pessoa2= new Pessoa();
        pessoa2.setNome("Vanessa");
        pessoa2.setSobrenome("Sdtaudt");
        pessoa2.setIdade(20);
        pessoa2.setEndereco("Caibi-SC");
        
        Pessoa pessoa3= new Pessoa();
        pessoa3.setNome("Kélita");
        pessoa3.setSobrenome("Silva");
        pessoa3.setIdade(50);
        pessoa3.setEndereco("Riqueza-SC");
        
        Pessoa pessoa4= new Pessoa();
        pessoa4.setNome("Ana");
        pessoa4.setSobrenome("Correa");
        pessoa4.setIdade(36);
        pessoa4.setEndereco("Mondaí-SC");
        
        //apresentando informações
        System.out.println("Nome: "+ pessoa1.getNome());
        System.out.println("Sobrenome: "+pessoa1.getSobrenome());
        System.out.println("Idade: "+pessoa1.getIdade());
        System.out.println("Endereco: "+pessoa1.getEndereco());
        
        System.out.println("Nome: "+ pessoa2.getNome());
        System.out.println("Sobrenome: "+pessoa2.getSobrenome());
        System.out.println("Idade: "+pessoa2.getIdade());
        System.out.println("Endereco: "+pessoa2.getEndereco());
        
        System.out.println("Nome: "+ pessoa3.getNome());
        System.out.println("Sobrenome: "+pessoa3.getSobrenome());
        System.out.println("Idade: "+pessoa3.getIdade());
        System.out.println("Endereco: "+pessoa3.getEndereco());
        
        System.out.println("Nome: "+ pessoa3.getNome());
        System.out.println("Sobrenome: "+pessoa3.getSobrenome());
        System.out.println("Idade: "+pessoa3.getIdade());
        System.out.println("Endereco: "+pessoa3.getEndereco());
    }
}
