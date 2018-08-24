/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg23.pkg8.pkg18;

/**
 *
 * @author ads
 */
public class Aula23818 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro car = new Carro();
        car.Marca = "Toyota";
        car.Ano = "2018";
        car.Andar();
        car.AcaoCarro(car.Correndo, car.Marca);
        
        Carro car2 = new Carro();
        car2.Marca = "Fiat";
        car2.Ano = "2018";
        car2.Frear();
        car2.AcaoCarro(car2.Correndo, car2.Marca);
        
        
}}
