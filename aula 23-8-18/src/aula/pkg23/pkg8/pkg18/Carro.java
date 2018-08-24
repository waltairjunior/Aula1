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
public class Carro {
    
    public String Marca;
    public String Modelo;
    public String Cor;
    public String Ano;
    public String AnoFabricacao;
    public boolean Correndo;
    
    public void Andar(){
        this.Correndo = true;
     
            
    }
    public void Frear(){
        this.Correndo = false;}
     
   public void AcaoCarro(boolean andar, String marca){
       if (andar) {
           System.out.print(marca + " está Correndo!, ");
       } else {
           System.out.print(marca + " está Morto!, ");
       }
   }
    }
    

